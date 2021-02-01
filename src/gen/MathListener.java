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
	 * Enter a parse tree produced by {@link MathParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MathParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MathParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(MathParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(MathParser.FormalParametersContext ctx);
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
	 * Enter a parse tree produced by {@link MathParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MathParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MathParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MathParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MathParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(MathParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(MathParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(MathParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(MathParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(MathParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(MathParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MathParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MathParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(MathParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(MathParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MathParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MathParser.ConstantContext ctx);
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