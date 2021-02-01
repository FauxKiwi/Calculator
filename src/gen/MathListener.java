// Generated from D:/IdeaProjects/Rechner/src/main/antlr\Math.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathParser}.
 */
public interface MathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MathParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MathParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterCalculation(MathParser.CalculationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitCalculation(MathParser.CalculationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MathParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MathParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MathParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MathParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#defStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefStatement(MathParser.DefStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#defStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefStatement(MathParser.DefStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MathParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MathParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MathParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MathParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(MathParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(MathParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(MathParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(MathParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(MathParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(MathParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MathParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MathParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#numberOrVar}.
	 * @param ctx the parse tree
	 */
	void enterNumberOrVar(MathParser.NumberOrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#numberOrVar}.
	 * @param ctx the parse tree
	 */
	void exitNumberOrVar(MathParser.NumberOrVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MathParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MathParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#sumOp}.
	 * @param ctx the parse tree
	 */
	void enterSumOp(MathParser.SumOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#sumOp}.
	 * @param ctx the parse tree
	 */
	void exitSumOp(MathParser.SumOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#productOp}.
	 * @param ctx the parse tree
	 */
	void enterProductOp(MathParser.ProductOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#productOp}.
	 * @param ctx the parse tree
	 */
	void exitProductOp(MathParser.ProductOpContext ctx);
}