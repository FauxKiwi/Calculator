import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val expr = """
        pi
    """.trimIndent()

    val program = """
        print sin PI;
    """.trimIndent()

    val lexer = MathLexer(CharStreams.fromString(program))
    val parser = MathParser(CommonTokenStream(lexer))
    val interpreter = Interpreter()

    //val result = interpreter.visitCalculation(parser.calculation())

    //println(result)

    interpreter.visitProgram(parser.program())
}