import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import kotlin.math.*

class Interpreter : MathVisitor<Double> {
    override fun visit(p0: ParseTree): Double {
        TODO("Not yet implemented")
    }

    override fun visitChildren(p0: RuleNode): Double {
        TODO("Not yet implemented")
    }

    override fun visitTerminal(p0: TerminalNode): Double {
        TODO("Not yet implemented")
    }

    override fun visitErrorNode(p0: ErrorNode): Double {
        TODO("Not yet implemented")
    }

    override fun visitProgram(ctx: MathParser.ProgramContext): Double {
        return ctx.statements()?.let(::visitStatements) ?: Double.NaN
    }

    override fun visitCalculation(ctx: MathParser.CalculationContext): Double =
        visitExpression(ctx.expression())

    override fun visitStatements(ctx: MathParser.StatementsContext): Double {
        var res = Double.NaN
        ctx.statement().forEach { res = visitStatement(it) }
        return res
    }

    override fun visitStatement(ctx: MathParser.StatementContext): Double =
        ctx.defStatement()?.let(::visitDefStatement) ?:
        ctx.functionDeclaration()?.let(::visitFunctionDeclaration) ?:
        visitPrintStatement(ctx.printStatement())

    private var definitions = hashMapOf<String, Double>()

    override fun visitDefStatement(ctx: MathParser.DefStatementContext): Double {
        return visitExpression(ctx.expression()).also { definitions[ctx.IDENTIFIER().text] = it }
    }

    override fun visitPrintStatement(ctx: MathParser.PrintStatementContext): Double {
        return visitExpression(ctx.expression()).also { println(it) }
    }

    private val functions = hashMapOf<String, DefinedFunction>()
    private data class DefinedFunction(val expression: MathParser.ExpressionContext, val parameters: List<String>)
    private var currentFormalParameters = mutableListOf<String>()

    override fun visitFunctionDeclaration(ctx: MathParser.FunctionDeclarationContext): Double {
        visitFormalParameters(ctx.formalParameters())
        functions[ctx.IDENTIFIER().text] = DefinedFunction(ctx.expression(), currentFormalParameters)
        return Double.NaN
    }

    override fun visitFormalParameters(ctx: MathParser.FormalParametersContext): Double {
        currentFormalParameters = mutableListOf()
        ctx.IDENTIFIER().forEach { currentFormalParameters.add(it.text) }
        return Double.NaN
    }

    override fun visitExpression(ctx: MathParser.ExpressionContext): Double =
        ctx.sum()?.let(::visitSum) ?:
        visitPrimary(ctx.primary())

    private var currentOperation: BinOp = { _, _ -> Double.NaN}

    override fun visitSum(ctx: MathParser.SumContext): Double {
        var intermediate = visitProduct(ctx.product(0))
        repeat(ctx.product().size - 1) { i ->
            visitSumOp(ctx.sumOp(i))
            intermediate = currentOperation(intermediate, visitProduct(ctx.product(i + 1)))
        }
        return intermediate
    }

    override fun visitProduct(ctx: MathParser.ProductContext): Double {
        var intermediate = visitPower(ctx.power(0))
        repeat(ctx.power().size - 1) { i ->
            visitProductOp(ctx.productOp(i))
            intermediate = currentOperation(intermediate, visitPower(ctx.power(i + 1)))
        }
        return intermediate
    }

    override fun visitPower(ctx: MathParser.PowerContext): Double {
        var intermediate = visitPrimary(ctx.primary(0))
        currentOperation = POW
        repeat(ctx.primary().size - 1) { i ->
            intermediate = currentOperation(intermediate, visitPrimary(ctx.primary(i + 1)))
        }
        return intermediate
    }

    override fun visitPrimary(ctx: MathParser.PrimaryContext): Double {
        val sign = if(ctx.MINUS().size % 2 == 0) 1 else -1
        val value =
            ctx.expression()?.let { visitExpression(it) } ?:
            ctx.function()?.let { visitFunction(it) } ?:
            visitValue(ctx.value())
        val multiplier = ctx.postfix()?.let(::visitPostfix) ?: 1.0
        return value * multiplier * sign
    }

    private var currentFunction: Function = {Double.NaN}
    private var currentParameters = mutableListOf<Double>()

    @Suppress("Unchecked_Cast")
    override fun visitFunction(ctx: MathParser.FunctionContext): Double {
        ctx.functionName()?.let {
            visitFunctionName(ctx.functionName())
            return currentFunction(visitPrimary(ctx.primary()))
        }
        val fn = functions[ctx.IDENTIFIER().text]!!
        val cachedDefinitions = definitions.clone() as HashMap<String, Double>

        visitParameters(ctx.parameters())

        fn.parameters.forEachIndexed { i, s ->
            definitions[s] = currentParameters[i]
        }

        val res = visitExpression(fn.expression)

        definitions = cachedDefinitions
        return res
    }

    override fun visitParameters(ctx: MathParser.ParametersContext): Double {
        currentParameters = mutableListOf()
        ctx.expression().forEach { currentParameters.add(visitExpression(it)) }
        return Double.NaN
    }

    override fun visitFunctionName(ctx: MathParser.FunctionNameContext): Double {
        currentFunction =
            ctx.SIN()?.let { ::sin } ?:
            ctx.COS()?.let { ::cos } ?:
            ctx.TAN()?.let { ::tan } ?:
            ctx.log()?.let { log(visitLog(it)) } ?:
            ctx.LG()?.let { ::log10 } ?:
            ctx.LN()?.let { ::ln } ?:
            ::exp
        return 0.0 //Useless
    }

    override fun visitLog(ctx: MathParser.LogContext): Double =
        visitPrimary(ctx.primary())

    override fun visitPostfix(ctx: MathParser.PostfixContext): Double =
        ctx.deg?.let { DEGREES } ?:
        ctx.rad?.let { 1.0 } ?:
        ctx.gra?.let { GRADS } ?:
        0.01

    override fun visitValue(ctx: MathParser.ValueContext): Double =
        ctx.NUMBER()?.text?.toDouble() ?:
        ctx.constant()?.let { visitConstant(it) } ?:
        definitions[ctx.IDENTIFIER().text] ?:
        error("Not defined")

    override fun visitConstant(ctx: MathParser.ConstantContext): Double =
        ctx.PI()?.let { kotlin.math.PI } ?:
        error("")

    override fun visitSumOp(ctx: MathParser.SumOpContext): Double {
        currentOperation =
            ctx.PLUS()?.let { PLUS } ?:
            MINUS
        return Double.NaN
    }

    override fun visitProductOp(ctx: MathParser.ProductOpContext): Double {
        currentOperation =
            ctx.DIV()?.let { DIV } ?:
            ctx.INT_DIV()?.let { INT_DIV } ?:
            ctx.REM()?.let { REM } ?:
            TIMES
        return Double.NaN
    }
}

typealias BinOp = (Double, Double) -> Double
typealias Function = (Double) -> Double

val PLUS: BinOp = { x, y -> x + y}
val MINUS: BinOp = { x, y -> x - y}
val TIMES: BinOp = { x, y -> x * y}
val DIV: BinOp = { x, y -> x / y}
val INT_DIV: BinOp = { x, y -> (x.toInt() / y.toInt()).toDouble()}
val REM: BinOp = { x, y -> (x.toInt() % y.toInt()).toDouble()}
val POW: BinOp = { x, y -> x.pow(y) }

fun log(base: Double): Function = { x -> log(x, base) }

const val DEGREES = PI / 180.0
const val GRADS = PI / 200.0