// Generated from D:/IdeaProjects/Rechner/src/main/antlr\Math.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MathParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MathParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculation(MathParser.CalculationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(MathParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MathParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#defStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefStatement(MathParser.DefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(MathParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MathParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(MathParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MathParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(MathParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#product}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduct(MathParser.ProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(MathParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(MathParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MathParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MathParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(MathParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(MathParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(MathParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MathParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(MathParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MathParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#sumOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumOp(MathParser.SumOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#productOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductOp(MathParser.ProductOpContext ctx);
}