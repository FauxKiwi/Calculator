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
        TODO("Not yet implemented")
    }

    override fun visitCalculation(ctx: MathParser.CalculationContext): Double =
        visitExpression(ctx.expression())

    override fun visitStatements(ctx: MathParser.StatementsContext): Double {
        TODO("Not yet implemented")
    }

    override fun visitStatement(ctx: MathParser.StatementContext): Double {
        TODO("Not yet implemented")
    }

    override fun visitDefStatement(ctx: MathParser.DefStatementContext): Double {
        TODO("Not yet implemented")
    }

    override fun visitPrintStatement(ctx: MathParser.PrintStatementContext): Double {
        TODO("Not yet implemented")
    }

    override fun visitExpression(ctx: MathParser.ExpressionContext): Double =
        ctx.sum()?.let { visitSum(it) } ?:
        visitPrimary(ctx.primary())

    private var currentOperation: BinOp = { _, _ -> 0.0} //Useless

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

    override fun visitPrimary(ctx: MathParser.PrimaryContext): Double =
        ctx.expression()?.let { visitExpression(it) } ?:
        ctx.function()?.let { visitFunction(it) } ?:
        visitValue(ctx.value())

    private var currentFunction: Function = {0.0} //Useless

    override fun visitFunction(ctx: MathParser.FunctionContext): Double {
        visitFunctionName(ctx.functionName())
        return currentFunction(visitPrimary(ctx.primary()))
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

    override fun visitValue(ctx: MathParser.ValueContext): Double =
        ctx.number()?.let { visitNumber(it) } ?:
        ctx.constant()?.let { visitConstant(it) } ?:
        TODO()

    override fun visitNumber(ctx: MathParser.NumberContext): Double {
        val sign = if(ctx.MINUS().size % 2 == 0) 1 else -1
        return ctx.NUMBER().text.toDouble() * sign
    }

    override fun visitConstant(ctx: MathParser.ConstantContext): Double =
        ctx.PI()?.let { kotlin.math.PI } ?:
        error("")

    override fun visitSumOp(ctx: MathParser.SumOpContext): Double {
        currentOperation =
            ctx.PLUS()?.let { PLUS } ?:
            MINUS
        return 0.0 //Useless
    }

    override fun visitProductOp(ctx: MathParser.ProductOpContext): Double {
        currentOperation =
            ctx.DIV()?.let { DIV } ?:
            ctx.INT_DIV()?.let { INT_DIV } ?:
            ctx.REM()?.let { REM } ?:
            TIMES
        return 0.0 //Useless
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