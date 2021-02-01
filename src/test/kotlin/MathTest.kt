import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val expr = """
        2^-3
    """.trimIndent()

    val lexer = MathLexer(CharStreams.fromString(expr))
    val parser = MathParser(CommonTokenStream(lexer))
    val interpreter = Interpreter()

    val result = interpreter.visitCalculation(parser.calculation())

    println(result)
}