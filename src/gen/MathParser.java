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
		PLUS=1, MINUS=2, TIMES=3, DIV=4, POW=5, INT_DIV=6, REM=7, EQ=8, NEQ=9, 
		DEF=10, SEMI=11, LPAREN=12, RPAREN=13, LSQUARE=14, RSQUARE=15, PRINT=16, 
		SIN=17, COS=18, TAN=19, LOG=20, LG=21, LN=22, EXP=23, PI=24, RESERVED=25, 
		NUMBER=26, IDENTIFIER=27, WHITESPACE=28, COMMENT=29;
	public static final int
		RULE_program = 0, RULE_calculation = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_defStatement = 4, RULE_printStatement = 5, RULE_expression = 6, RULE_sum = 7, 
		RULE_product = 8, RULE_power = 9, RULE_primary = 10, RULE_function = 11, 
		RULE_functionName = 12, RULE_log = 13, RULE_value = 14, RULE_number = 15, 
		RULE_constant = 16, RULE_sumOp = 17, RULE_productOp = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "calculation", "statements", "statement", "defStatement", 
			"printStatement", "expression", "sum", "product", "power", "primary", 
			"function", "functionName", "log", "value", "number", "constant", "sumOp", 
			"productOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'/I'", "'/R'", "'='", "'!='", 
			"':='", "';'", "'('", "')'", "'['", "']'", "'print'", "'sin'", "'cos'", 
			"'tan'", "'log_'", "'lg'", "'ln'", "'e^'", null, "'log'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "TIMES", "DIV", "POW", "INT_DIV", "REM", "EQ", 
			"NEQ", "DEF", "SEMI", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "PRINT", 
			"SIN", "COS", "TAN", "LOG", "LG", "LN", "EXP", "PI", "RESERVED", "NUMBER", 
			"IDENTIFIER", "WHITESPACE", "COMMENT"
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRINT || _la==IDENTIFIER) {
				{
				setState(38);
				statements();
				}
			}

			setState(41);
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
			setState(43);
			expression();
			setState(44);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			statement();
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					match(SEMI);
					setState(48);
					statement();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(54);
				match(SEMI);
				}
				}
				setState(59);
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

	public static class StatementContext extends ParserRuleContext {
		public DefStatementContext defStatement() {
			return getRuleContext(DefStatementContext.class,0);
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
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				defStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				printStatement();
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
			setState(64);
			match(IDENTIFIER);
			setState(65);
			match(DEF);
			setState(66);
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
			setState(68);
			match(PRINT);
			setState(69);
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

	public static class ExpressionContext extends ParserRuleContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
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
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				sum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				primary();
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
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
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
		enterRule(_localctx, 14, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			product();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(76);
				sumOp();
				setState(77);
				product();
				}
				}
				setState(83);
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
		enterRule(_localctx, 16, RULE_product);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			power();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIV) | (1L << INT_DIV) | (1L << REM))) != 0)) {
				{
				{
				setState(85);
				productOp();
				setState(86);
				power();
				}
				}
				setState(92);
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
		enterRule(_localctx, 18, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			primary();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(94);
				match(POW);
				setState(95);
				primary();
				}
				}
				setState(100);
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 20, RULE_primary);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(LPAREN);
				setState(102);
				expression();
				setState(103);
				match(RPAREN);
				}
				break;
			case SIN:
			case COS:
			case TAN:
			case LOG:
			case LG:
			case LN:
			case EXP:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				function();
				}
				break;
			case PLUS:
			case MINUS:
			case PI:
			case NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				value();
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
		enterRule(_localctx, 22, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			functionName();
			setState(110);
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

	public static class FunctionNameContext extends ParserRuleContext {
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
		enterRule(_localctx, 24, RULE_functionName);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(SIN);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(COS);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(TAN);
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				log();
				}
				break;
			case LG:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				match(LG);
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(LN);
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
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
		enterRule(_localctx, 26, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LOG);
			setState(122);
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

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				number();
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				constant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MathParser.NUMBER, 0); }
		public List<TerminalNode> PLUS() { return getTokens(MathParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MathParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MathParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MathParser.MINUS, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathVisitor ) return ((MathVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(129);
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
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(NUMBER);
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
		enterRule(_localctx, 32, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		enterRule(_localctx, 34, RULE_sumOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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
		public TerminalNode INT_DIV() { return getToken(MathParser.INT_DIV, 0); }
		public TerminalNode REM() { return getToken(MathParser.REM, 0); }
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
		enterRule(_localctx, 36, RULE_productOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIV) | (1L << INT_DIV) | (1L << REM))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\5\2*\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\3\5\5\5A\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\bL\n\b\3\t\3\t\3\t\3\t\7\tR\n\t"+
		"\f\t\16\tU\13\t\3\n\3\n\3\n\3\n\7\n[\n\n\f\n\16\n^\13\n\3\13\3\13\3\13"+
		"\7\13c\n\13\f\13\16\13f\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fn\n\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16z\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\5\20\u0082\n\20\3\21\7\21\u0085\n\21\f\21\16\21\u0088\13\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&\2\4\3\2\3\4\4\2\5\6\b\t\2\u0091\2)\3\2\2\2"+
		"\4-\3\2\2\2\6\60\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fF\3\2\2\2\16K\3\2\2\2"+
		"\20M\3\2\2\2\22V\3\2\2\2\24_\3\2\2\2\26m\3\2\2\2\30o\3\2\2\2\32y\3\2\2"+
		"\2\34{\3\2\2\2\36\u0081\3\2\2\2 \u0086\3\2\2\2\"\u008b\3\2\2\2$\u008d"+
		"\3\2\2\2&\u008f\3\2\2\2(*\5\6\4\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\2"+
		"\2\3,\3\3\2\2\2-.\5\16\b\2./\7\2\2\3/\5\3\2\2\2\60\65\5\b\5\2\61\62\7"+
		"\r\2\2\62\64\5\b\5\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3"+
		"\2\2\2\66;\3\2\2\2\67\65\3\2\2\28:\7\r\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2"+
		"\2;<\3\2\2\2<\7\3\2\2\2=;\3\2\2\2>A\5\n\6\2?A\5\f\7\2@>\3\2\2\2@?\3\2"+
		"\2\2A\t\3\2\2\2BC\7\35\2\2CD\7\f\2\2DE\5\16\b\2E\13\3\2\2\2FG\7\22\2\2"+
		"GH\5\16\b\2H\r\3\2\2\2IL\5\20\t\2JL\5\26\f\2KI\3\2\2\2KJ\3\2\2\2L\17\3"+
		"\2\2\2MS\5\22\n\2NO\5$\23\2OP\5\22\n\2PR\3\2\2\2QN\3\2\2\2RU\3\2\2\2S"+
		"Q\3\2\2\2ST\3\2\2\2T\21\3\2\2\2US\3\2\2\2V\\\5\24\13\2WX\5&\24\2XY\5\24"+
		"\13\2Y[\3\2\2\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\23\3\2\2\2"+
		"^\\\3\2\2\2_d\5\26\f\2`a\7\7\2\2ac\5\26\f\2b`\3\2\2\2cf\3\2\2\2db\3\2"+
		"\2\2de\3\2\2\2e\25\3\2\2\2fd\3\2\2\2gh\7\16\2\2hi\5\16\b\2ij\7\17\2\2"+
		"jn\3\2\2\2kn\5\30\r\2ln\5\36\20\2mg\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\27\3"+
		"\2\2\2op\5\32\16\2pq\5\26\f\2q\31\3\2\2\2rz\7\23\2\2sz\7\24\2\2tz\7\25"+
		"\2\2uz\5\34\17\2vz\7\27\2\2wz\7\30\2\2xz\7\31\2\2yr\3\2\2\2ys\3\2\2\2"+
		"yt\3\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\33\3\2\2\2{|\7\26"+
		"\2\2|}\5\26\f\2}\35\3\2\2\2~\u0082\5 \21\2\177\u0082\5\"\22\2\u0080\u0082"+
		"\7\35\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\37"+
		"\3\2\2\2\u0083\u0085\t\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008a\7\34\2\2\u008a!\3\2\2\2\u008b\u008c\7\32\2\2\u008c#\3"+
		"\2\2\2\u008d\u008e\t\2\2\2\u008e%\3\2\2\2\u008f\u0090\t\3\2\2\u0090\'"+
		"\3\2\2\2\16)\65;@KS\\dmy\u0081\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}