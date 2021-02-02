// Generated from D:/IdeaProjects/Rechner/src/main/antlr\Math.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, PLUS=5, MINUS=6, TIMES=7, DIV=8, POW=9, 
		INDEX=10, EQ=11, NEQ=12, DEF=13, COLON=14, ARROW=15, COMMA=16, DOT=17, 
		PIPE=18, SEMI=19, LPAREN=20, RPAREN=21, LSQUARE=22, RSQUARE=23, DEGREES=24, 
		PERCENT=25, PERMILLE=26, PRINT=27, SIN=28, COS=29, TAN=30, LOG=31, LG=32, 
		LN=33, EXP=34, ABS=35, SQRT=36, PI=37, NUMBER=38, IDENTIFIER=39, WHITESPACE=40, 
		COMMENT=41;
	public static final int
		RULE_program = 0, RULE_calculation = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_defStatement = 4, RULE_printStatement = 5, RULE_functionDeclaration = 6, 
		RULE_formalParameters = 7, RULE_expression = 8, RULE_sum = 9, RULE_dotProduct = 10, 
		RULE_product = 11, RULE_power = 12, RULE_primary = 13, RULE_absExpression = 14, 
		RULE_function = 15, RULE_parameters = 16, RULE_functionName = 17, RULE_log = 18, 
		RULE_postfix = 19, RULE_value = 20, RULE_vector = 21, RULE_constant = 22, 
		RULE_sumOp = 23, RULE_productOp = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "calculation", "statements", "statement", "defStatement", 
			"printStatement", "functionDeclaration", "formalParameters", "expression", 
			"sum", "dotProduct", "product", "power", "primary", "absExpression", 
			"function", "parameters", "functionName", "log", "postfix", "value", 
			"vector", "constant", "sumOp", "productOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dot'", "'deg'", "'rad'", "'gra'", "'+'", "'-'", null, null, "'^'", 
			"'_'", "'='", "'!='", "':='", "':'", null, "','", "'\u00C2\u00B7'", "'|'", 
			"';'", "'('", "')'", "'['", "']'", "'\u00C2\u00B0'", "'%'", null, "'print'", 
			"'sin'", "'cos'", "'tan'", "'log'", "'lg'", "'ln'", "'e^'", "'abs'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "PLUS", "MINUS", "TIMES", "DIV", "POW", 
			"INDEX", "EQ", "NEQ", "DEF", "COLON", "ARROW", "COMMA", "DOT", "PIPE", 
			"SEMI", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "DEGREES", "PERCENT", 
			"PERMILLE", "PRINT", "SIN", "COS", "TAN", "LOG", "LG", "LN", "EXP", "ABS", 
			"SQRT", "PI", "NUMBER", "IDENTIFIER", "WHITESPACE", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Math.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MathParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRINT || _la==IDENTIFIER) {
				{
				setState(50);
				statements();
				}
			}

			setState(53);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MathParser.EOF, 0); }
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterCalculation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitCalculation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitCalculation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		CalculationContext _localctx = new CalculationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calculation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			expression();
			setState(56);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MathParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MathParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				statement();
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					match(SEMI);
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEMI );
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRINT || _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DefStatementContext defStatement() {
			return getRuleContext(DefStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				defStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				printStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MathParser.IDENTIFIER, 0); }
		public TerminalNode DEF() { return getToken(MathParser.DEF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterDefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitDefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefStatementContext defStatement() throws RecognitionException {
		DefStatementContext _localctx = new DefStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(DEF);
			setState(75);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MathParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(PRINT);
			setState(78);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MathParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MathParser.LPAREN, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathParser.RPAREN, 0); }
		public TerminalNode EQ() { return getToken(MathParser.EQ, 0); }
		public TerminalNode COLON() { return getToken(MathParser.COLON, 0); }
		public TerminalNode ARROW() { return getToken(MathParser.ARROW, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IDENTIFIER);
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(81);
				match(LPAREN);
				setState(82);
				formalParameters();
				setState(83);
				match(RPAREN);
				setState(84);
				match(EQ);
				}
				break;
			case COLON:
				{
				setState(86);
				match(COLON);
				setState(87);
				formalParameters();
				setState(88);
				match(ARROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(92);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MathParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MathParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathParser.COMMA, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IDENTIFIER);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				match(IDENTIFIER);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				sum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumContext extends ParserRuleContext {
		public List<DotProductContext> dotProduct() {
			return getRuleContexts(DotProductContext.class);
		}
		public DotProductContext dotProduct(int i) {
			return getRuleContext(DotProductContext.class,i);
		}
		public List<SumOpContext> sumOp() {
			return getRuleContexts(SumOpContext.class);
		}
		public SumOpContext sumOp(int i) {
			return getRuleContext(SumOpContext.class,i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			dotProduct();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(107);
				sumOp();
				setState(108);
				dotProduct();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotProductContext extends ParserRuleContext {
		public Token dot;
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public TerminalNode DOT() { return getToken(MathParser.DOT, 0); }
		public DotProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotProduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterDotProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitDotProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitDotProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotProductContext dotProduct() throws RecognitionException {
		DotProductContext _localctx = new DotProductContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dotProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			product();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==DOT) {
				{
				setState(116);
				((DotProductContext)_localctx).dot = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==DOT) ) {
					((DotProductContext)_localctx).dot = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(117);
				product();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductContext extends ParserRuleContext {
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public List<ProductOpContext> productOp() {
			return getRuleContexts(ProductOpContext.class);
		}
		public ProductOpContext productOp(int i) {
			return getRuleContext(ProductOpContext.class,i);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_product);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			power();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIV) {
				{
				{
				setState(121);
				productOp();
				setState(122);
				power();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(MathParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(MathParser.POW, i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			primary();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(130);
				match(POW);
				setState(131);
				primary();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MathParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathParser.RPAREN, 0); }
		public AbsExpressionContext absExpression() {
			return getRuleContext(AbsExpressionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(MathParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MathParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MathParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MathParser.MINUS, i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(143);
				match(LPAREN);
				setState(144);
				expression();
				setState(145);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(147);
				absExpression();
				}
				break;
			case 3:
				{
				setState(148);
				function();
				}
				break;
			case 4:
				{
				setState(149);
				value();
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(152);
				postfix();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbsExpressionContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(MathParser.ABS, 0); }
		public TerminalNode LPAREN() { return getToken(MathParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathParser.RPAREN, 0); }
		public List<TerminalNode> PIPE() { return getTokens(MathParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(MathParser.PIPE, i);
		}
		public AbsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterAbsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitAbsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitAbsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsExpressionContext absExpression() throws RecognitionException {
		AbsExpressionContext _localctx = new AbsExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_absExpression);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ABS);
				setState(156);
				match(LPAREN);
				setState(157);
				expression();
				setState(158);
				match(RPAREN);
				}
				break;
			case PIPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(PIPE);
				setState(161);
				expression();
				setState(162);
				match(PIPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MathParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(MathParser.LPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathParser.RPAREN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
			case COS:
			case TAN:
			case LOG:
			case LG:
			case LN:
			case EXP:
			case SQRT:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				functionName();
				setState(167);
				primary();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(IDENTIFIER);
				setState(170);
				match(LPAREN);
				setState(171);
				parameters();
				setState(172);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			expression();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(177);
				match(COMMA);
				setState(178);
				expression();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode SQRT() { return getToken(MathParser.SQRT, 0); }
		public TerminalNode SIN() { return getToken(MathParser.SIN, 0); }
		public TerminalNode COS() { return getToken(MathParser.COS, 0); }
		public TerminalNode TAN() { return getToken(MathParser.TAN, 0); }
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public TerminalNode LG() { return getToken(MathParser.LG, 0); }
		public TerminalNode LN() { return getToken(MathParser.LN, 0); }
		public TerminalNode EXP() { return getToken(MathParser.EXP, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionName);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRT:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(SQRT);
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(SIN);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(COS);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(TAN);
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				log();
				}
				break;
			case LG:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(LG);
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				match(LN);
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				match(EXP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(MathParser.LOG, 0); }
		public TerminalNode INDEX() { return getToken(MathParser.INDEX, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LOG);
			setState(195);
			match(INDEX);
			setState(196);
			primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixContext extends ParserRuleContext {
		public Token deg;
		public Token rad;
		public Token gra;
		public TerminalNode DEGREES() { return getToken(MathParser.DEGREES, 0); }
		public TerminalNode PERCENT() { return getToken(MathParser.PERCENT, 0); }
		public TerminalNode PERMILLE() { return getToken(MathParser.PERMILLE, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_postfix);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case DEGREES:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				((PostfixContext)_localctx).deg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==DEGREES) ) {
					((PostfixContext)_localctx).deg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				((PostfixContext)_localctx).rad = match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				((PostfixContext)_localctx).gra = match(T__3);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(PERCENT);
				}
				break;
			case PERMILLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(PERMILLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MathParser.NUMBER, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MathParser.IDENTIFIER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(NUMBER);
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				vector();
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				constant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(MathParser.LSQUARE, 0); }
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(MathParser.RSQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathParser.COMMA, i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(LSQUARE);
			setState(212);
			primary();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(213);
				match(COMMA);
				setState(214);
				primary();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(MathParser.PI, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(PI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MathParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MathParser.MINUS, 0); }
		public SumOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterSumOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitSumOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitSumOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumOpContext sumOp() throws RecognitionException {
		SumOpContext _localctx = new SumOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sumOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductOpContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(MathParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(MathParser.DIV, 0); }
		public ProductOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterProductOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitProductOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitProductOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductOpContext productOp() throws RecognitionException {
		ProductOpContext _localctx = new ProductOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_productOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==TIMES || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\5\2\66\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\6\4?\n\4\r\4\16"+
		"\4@\6\4C\n\4\r\4\16\4D\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\b\3\b\3\t\3\t\3"+
		"\t\7\td\n\t\f\t\16\tg\13\t\3\n\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\7\13q"+
		"\n\13\f\13\16\13t\13\13\3\f\3\f\3\f\5\fy\n\f\3\r\3\r\3\r\3\r\7\r\177\n"+
		"\r\f\r\16\r\u0082\13\r\3\16\3\16\3\16\7\16\u0087\n\16\f\16\16\16\u008a"+
		"\13\16\3\17\7\17\u008d\n\17\f\17\16\17\u0090\13\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0099\n\17\3\17\5\17\u009c\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a7\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00b1\n\21\3\22\3\22\3\22\7\22\u00b6\n\22\f\22\16"+
		"\22\u00b9\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c3\n\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00ce\n\25\3\26\3\26"+
		"\3\26\3\26\5\26\u00d4\n\26\3\27\3\27\3\27\3\27\7\27\u00da\n\27\f\27\16"+
		"\27\u00dd\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\2\2\33\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\4\2\3\3\23\23"+
		"\3\2\7\b\4\2\4\4\32\32\3\2\t\n\2\u00f0\2\65\3\2\2\2\49\3\2\2\2\6B\3\2"+
		"\2\2\bI\3\2\2\2\nK\3\2\2\2\fO\3\2\2\2\16R\3\2\2\2\20`\3\2\2\2\22j\3\2"+
		"\2\2\24l\3\2\2\2\26u\3\2\2\2\30z\3\2\2\2\32\u0083\3\2\2\2\34\u008e\3\2"+
		"\2\2\36\u00a6\3\2\2\2 \u00b0\3\2\2\2\"\u00b2\3\2\2\2$\u00c2\3\2\2\2&\u00c4"+
		"\3\2\2\2(\u00cd\3\2\2\2*\u00d3\3\2\2\2,\u00d5\3\2\2\2.\u00e0\3\2\2\2\60"+
		"\u00e2\3\2\2\2\62\u00e4\3\2\2\2\64\66\5\6\4\2\65\64\3\2\2\2\65\66\3\2"+
		"\2\2\66\67\3\2\2\2\678\7\2\2\38\3\3\2\2\29:\5\22\n\2:;\7\2\2\3;\5\3\2"+
		"\2\2<>\5\b\5\2=?\7\25\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3"+
		"\2\2\2B<\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FJ\5\n\6\2GJ"+
		"\5\16\b\2HJ\5\f\7\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\t\3\2\2\2KL\7)\2\2"+
		"LM\7\17\2\2MN\5\22\n\2N\13\3\2\2\2OP\7\35\2\2PQ\5\22\n\2Q\r\3\2\2\2R\\"+
		"\7)\2\2ST\7\26\2\2TU\5\20\t\2UV\7\27\2\2VW\7\r\2\2W]\3\2\2\2XY\7\20\2"+
		"\2YZ\5\20\t\2Z[\7\21\2\2[]\3\2\2\2\\S\3\2\2\2\\X\3\2\2\2]^\3\2\2\2^_\5"+
		"\22\n\2_\17\3\2\2\2`e\7)\2\2ab\7\22\2\2bd\7)\2\2ca\3\2\2\2dg\3\2\2\2e"+
		"c\3\2\2\2ef\3\2\2\2f\21\3\2\2\2ge\3\2\2\2hk\5\34\17\2ik\5\24\13\2jh\3"+
		"\2\2\2ji\3\2\2\2k\23\3\2\2\2lr\5\26\f\2mn\5\60\31\2no\5\26\f\2oq\3\2\2"+
		"\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\25\3\2\2\2tr\3\2\2\2ux\5\30"+
		"\r\2vw\t\2\2\2wy\5\30\r\2xv\3\2\2\2xy\3\2\2\2y\27\3\2\2\2z\u0080\5\32"+
		"\16\2{|\5\62\32\2|}\5\32\16\2}\177\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\31\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0083\u0088\5\34\17\2\u0084\u0085\7\13\2\2\u0085\u0087\5\34\17\2\u0086"+
		"\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\33\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\t\3\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0098\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\26\2\2\u0092\u0093\5"+
		"\22\n\2\u0093\u0094\7\27\2\2\u0094\u0099\3\2\2\2\u0095\u0099\5\36\20\2"+
		"\u0096\u0099\5 \21\2\u0097\u0099\5*\26\2\u0098\u0091\3\2\2\2\u0098\u0095"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u009c\5(\25\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\35\3\2\2"+
		"\2\u009d\u009e\7%\2\2\u009e\u009f\7\26\2\2\u009f\u00a0\5\22\n\2\u00a0"+
		"\u00a1\7\27\2\2\u00a1\u00a7\3\2\2\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\5"+
		"\22\n\2\u00a4\u00a5\7\24\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\5$\23\2\u00a9\u00aa\5\34\17"+
		"\2\u00aa\u00b1\3\2\2\2\u00ab\u00ac\7)\2\2\u00ac\u00ad\7\26\2\2\u00ad\u00ae"+
		"\5\"\22\2\u00ae\u00af\7\27\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a8\3\2\2\2"+
		"\u00b0\u00ab\3\2\2\2\u00b1!\3\2\2\2\u00b2\u00b7\5\22\n\2\u00b3\u00b4\7"+
		"\22\2\2\u00b4\u00b6\5\22\n\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8#\3\2\2\2\u00b9\u00b7\3\2\2\2"+
		"\u00ba\u00c3\7&\2\2\u00bb\u00c3\7\36\2\2\u00bc\u00c3\7\37\2\2\u00bd\u00c3"+
		"\7 \2\2\u00be\u00c3\5&\24\2\u00bf\u00c3\7\"\2\2\u00c0\u00c3\7#\2\2\u00c1"+
		"\u00c3\7$\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00bc\3\2"+
		"\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3%\3\2\2\2\u00c4\u00c5\7!\2\2\u00c5"+
		"\u00c6\7\f\2\2\u00c6\u00c7\5\34\17\2\u00c7\'\3\2\2\2\u00c8\u00ce\t\4\2"+
		"\2\u00c9\u00ce\7\5\2\2\u00ca\u00ce\7\6\2\2\u00cb\u00ce\7\33\2\2\u00cc"+
		"\u00ce\7\34\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00d4"+
		"\7(\2\2\u00d0\u00d4\5,\27\2\u00d1\u00d4\5.\30\2\u00d2\u00d4\7)\2\2\u00d3"+
		"\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2"+
		"\2\2\u00d4+\3\2\2\2\u00d5\u00d6\7\30\2\2\u00d6\u00db\5\34\17\2\u00d7\u00d8"+
		"\7\22\2\2\u00d8\u00da\5\34\17\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2"+
		"\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00df\7\31\2\2\u00df-\3\2\2\2\u00e0\u00e1\7\'\2\2\u00e1"+
		"/\3\2\2\2\u00e2\u00e3\t\3\2\2\u00e3\61\3\2\2\2\u00e4\u00e5\t\5\2\2\u00e5"+
		"\63\3\2\2\2\27\65@DI\\ejrx\u0080\u0088\u008e\u0098\u009b\u00a6\u00b0\u00b7"+
		"\u00c2\u00cd\u00d3\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}