import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import kotlin.math.*

class Interpreter : MathVisitor<CalculatorValue> {
    override fun visit(p0: ParseTree): CalculatorValue {
        TODO("Not yet implemented")
    }

    override fun visitChildren(p0: RuleNode): CalculatorValue {
        TODO("Not yet implemented")
    }

    override fun visitTerminal(p0: TerminalNode): CalculatorValue {
        TODO("Not yet implemented")
    }

    override fun visitErrorNode(p0: ErrorNode): CalculatorValue {
        TODO("Not yet implemented")
    }

    override fun visitProgram(ctx: MathParser.ProgramContext): CalculatorValue {
        return ctx.statements()?.let(::visitStatements) ?: Number(Double.NaN)
    }

    override fun visitCalculation(ctx: MathParser.CalculationContext): CalculatorValue =
        visitExpression(ctx.expression())

    override fun visitStatements(ctx: MathParser.StatementsContext): CalculatorValue {
        var res: CalculatorValue = Number(Double.NaN)
        ctx.statement().forEach { res = visitStatement(it) }
        return res
    }

    override fun visitStatement(ctx: MathParser.StatementContext): CalculatorValue =
        ctx.defStatement()?.let(::visitDefStatement) ?:
        ctx.functionDeclaration()?.let(::visitFunctionDeclaration) ?:
        visitPrintStatement(ctx.printStatement())

    private var definitions = hashMapOf<String, CalculatorValue>()

    override fun visitDefStatement(ctx: MathParser.DefStatementContext): CalculatorValue {
        return visitExpression(ctx.expression()).also { definitions[ctx.IDENTIFIER().text] = it }
    }

    override fun visitPrintStatement(ctx: MathParser.PrintStatementContext): CalculatorValue {
        return visitExpression(ctx.expression()).also { println(it) }
    }

    private val functions = hashMapOf<String, DefinedFunction>()
    private data class DefinedFunction(val expression: MathParser.ExpressionContext, val parameters: List<String>)
    private var currentFormalParameters = mutableListOf<String>()

    override fun visitFunctionDeclaration(ctx: MathParser.FunctionDeclarationContext): CalculatorValue {
        visitFormalParameters(ctx.formalParameters())
        functions[ctx.IDENTIFIER().text] = DefinedFunction(ctx.expression(), currentFormalParameters)
        return Number(Double.NaN)
    }

    override fun visitFormalParameters(ctx: MathParser.FormalParametersContext): CalculatorValue {
        currentFormalParameters = mutableListOf()
        ctx.IDENTIFIER().forEach { currentFormalParameters.add(it.text) }
        return Number(Double.NaN)
    }

    override fun visitExpression(ctx: MathParser.ExpressionContext): CalculatorValue =
        ctx.sum()?.let(::visitSum) ?:
        visitPrimary(ctx.primary())

    private var currentOperation: BinOp = { _, _ -> Number(Double.NaN)}

    override fun visitSum(ctx: MathParser.SumContext): CalculatorValue {
        var intermediate = visitDotProduct(ctx.dotProduct(0))
        repeat(ctx.dotProduct().size - 1) { i ->
            visitSumOp(ctx.sumOp(i))
            intermediate = currentOperation(intermediate, visitDotProduct(ctx.dotProduct(i + 1)))
        }
        return intermediate
    }

    override fun visitDotProduct(ctx: MathParser.DotProductContext): CalculatorValue =
        ctx.dot?.let {
            visitProduct(ctx.product(0)) dot visitProduct(ctx.product(1))
        } ?:
        visitProduct(ctx.product(0))

    override fun visitProduct(ctx: MathParser.ProductContext): CalculatorValue {
        var intermediate = visitPower(ctx.power(0))
        repeat(ctx.power().size - 1) { i ->
            visitProductOp(ctx.productOp(i))
            intermediate = currentOperation(intermediate, visitPower(ctx.power(i + 1)))
        }
        return intermediate
    }

    override fun visitPower(ctx: MathParser.PowerContext): CalculatorValue {
        var intermediate = visitPrimary(ctx.primary(0))
        currentOperation = POW
        repeat(ctx.primary().size - 1) { i ->
            intermediate = currentOperation(intermediate, visitPrimary(ctx.primary(i + 1)))
        }
        return intermediate
    }

    override fun visitPrimary(ctx: MathParser.PrimaryContext): CalculatorValue {
        val sign = Number(if(ctx.MINUS().size % 2 == 0) 1.0 else -1.0)
        val value =
            ctx.expression()?.let { visitExpression(it) } ?:
            ctx.function()?.let { visitFunction(it) } ?:
            visitValue(ctx.value())
        val multiplier = ctx.postfix()?.let(::visitPostfix) ?: Number(1.0)
        return value * multiplier * sign
    }

    private var currentFunction: Function = {Number(Double.NaN)}
    private var currentParameters = mutableListOf<CalculatorValue>()

    @Suppress("Unchecked_Cast")
    override fun visitFunction(ctx: MathParser.FunctionContext): CalculatorValue {
        ctx.functionName()?.let {
            visitFunctionName(ctx.functionName())
            return currentFunction(visitPrimary(ctx.primary()))
        }
        val fn = functions[ctx.IDENTIFIER().text]!!
        val cachedDefinitions = definitions.clone() as HashMap<String, CalculatorValue>

        visitParameters(ctx.parameters())

        fn.parameters.forEachIndexed { i, s ->
            definitions[s] = currentParameters[i]
        }

        val res = visitExpression(fn.expression)

        definitions = cachedDefinitions
        return res
    }

    override fun visitParameters(ctx: MathParser.ParametersContext): CalculatorValue {
        currentParameters = mutableListOf()
        ctx.expression().forEach { currentParameters.add(visitExpression(it)) }
        return Number(Double.NaN)
    }

    override fun visitFunctionName(ctx: MathParser.FunctionNameContext): CalculatorValue {
        currentFunction =
            ctx.SIN()?.let {{ Number(sin((it as Number).double)) }} ?:
            ctx.COS()?.let {{ Number(sin((it as Number).double)) }} ?:
            ctx.TAN()?.let {{ Number(sin((it as Number).double)) }} ?:
            ctx.log()?.let { log(visitLog(it)) } ?:
            ctx.LG()?.let {{ Number(sin((it as Number).double)) }} ?:
            ctx.LN()?.let {{ Number(sin((it as Number).double)) }} ?:
            { Number(exp((it as Number).double)) }
        return Number(Double.NaN)
    }

    override fun visitLog(ctx: MathParser.LogContext): CalculatorValue =
        visitPrimary(ctx.primary())

    override fun visitPostfix(ctx: MathParser.PostfixContext): CalculatorValue =
        ctx.deg?.let { DEGREES } ?:
        ctx.rad?.let { RADS } ?:
        ctx.gra?.let { GRADS } ?:
        PERCENT

    override fun visitValue(ctx: MathParser.ValueContext): CalculatorValue =
        ctx.NUMBER()?.text?.let { Number(it) } ?:
        ctx.vector()?.let(::visitVector) ?:
        ctx.constant()?.let { visitConstant(it) } ?:
        definitions[ctx.IDENTIFIER().text] ?:
        error("Not defined")

    override fun visitVector(ctx: MathParser.VectorContext): CalculatorValue {
        val primaries = ctx.primary()
        val values = DoubleArray(primaries.size) { i ->
            (visitPrimary(primaries[i]) as Number).double
        }
        return Vector(values)
    }

    override fun visitConstant(ctx: MathParser.ConstantContext): CalculatorValue =
        ctx.PI()?.let { NUM_PI } ?:
        error("")

    override fun visitSumOp(ctx: MathParser.SumOpContext): CalculatorValue {
        currentOperation =
            ctx.PLUS()?.let { PLUS } ?:
            MINUS
        return Number(Double.NaN)
    }

    override fun visitProductOp(ctx: MathParser.ProductOpContext): CalculatorValue {
        currentOperation =
            ctx.DIV()?.let { DIV } ?:
            //ctx.INT_DIV()?.let { INT_DIV } ?:
            //ctx.REM()?.let { REM } ?:
            TIMES
        return Number(Double.NaN)
    }
}

typealias BinOp = (CalculatorValue, CalculatorValue) -> CalculatorValue
typealias Function = (CalculatorValue) -> CalculatorValue

val PLUS: BinOp = { x, y -> x + y}
val MINUS: BinOp = { x, y -> x - y}
val TIMES: BinOp = { x, y -> x * y}
val DIV: BinOp = { x, y -> x / y}
//val INT_DIV: BinOp = { x, y -> (x.toInt() / y.toInt()).toDouble()}
//val REM: BinOp = { x, y -> (x.toInt() % y.toInt()).toDouble()}
val POW: BinOp = { x, y -> x.pow(y) }

fun log(base: CalculatorValue): Function = { x -> Number(log((x as Number).double, (base as Number).double)) }

val NUM_PI = Number(PI)
val DEGREES = Number(PI / 180.0)
val RADS = Number(1.0)
val GRADS = Number(PI / 200.0)
val PERCENT = Number(0.01)