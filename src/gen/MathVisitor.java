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
	 * Visit a parse tree produced by {@link MathParser#numberOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberOrVar(MathParser.NumberOrVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MathParser.NumberContext ctx);
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