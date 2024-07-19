// Generated from D:/����/����/�����������/ANTLR/src/main/java/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL_VALUE=1, PROGRAM=2, VAR=3, BEGIN=4, END=5, LET=6, IF=7, THEN=8, ELSE=9, 
		END_ELSE=10, FOR=11, WHILE=12, DO=13, LOOP=14, INPUT=15, OUTPUT=16, TRUE=17, 
		FALSE=18, INT=19, FLOAT=20, BOOL=21, NE=22, EQ=23, LT=24, LE=25, GT=26, 
		GE=27, ADD=28, SUB=29, OR=30, MUL=31, DIV=32, AND=33, NOT=34, ID=35, LETTER=36, 
		COMMA=37, COLON=38, SEMICOLON=39, DOT=40, LPAR=41, RPAR=42, LBR=43, RBR=44, 
		ASS=45, REAL_NUMBER=46, EXP=47, INT_NUMBER=48, BIN_NUMBER=49, OCT_NUMBER=50, 
		DEX_NUMBER=51, HEX_NUMBER=52, DIGIT=53, WS=54, COMMENT=55;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_var_type = 2, RULE_stmt = 3, RULE_stmt_ass = 4, 
		RULE_stmt_if = 5, RULE_stmt_for = 6, RULE_stmt_while = 7, RULE_stmt_input = 8, 
		RULE_stmt_output = 9, RULE_expr = 10, RULE_idt = 11, RULE_number = 12, 
		RULE_int_number = 13, RULE_real_number = 14, RULE_bool_value = 15, RULE_rel_op = 16, 
		RULE_add_op = 17, RULE_mul_op = 18, RULE_unary_op = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "var_type", "stmt", "stmt_ass", "stmt_if", "stmt_for", 
			"stmt_while", "stmt_input", "stmt_output", "expr", "idt", "number", "int_number", 
			"real_number", "bool_value", "rel_op", "add_op", "mul_op", "unary_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'program'", "'var'", "'begin'", "'end'", "'let'", "'if'", 
			"'then'", "'else'", "'end_else'", "'for'", "'while'", "'do'", "'loop'", 
			"'input'", "'output'", "'true'", "'false'", "'%'", "'!'", "'$'", "'!='", 
			"'=='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'||'", "'*'", "'/'", 
			"'&&'", "'#'", null, null, "','", "':'", "';'", "'.'", "'('", "')'", 
			"'{'", "'}'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL_VALUE", "PROGRAM", "VAR", "BEGIN", "END", "LET", "IF", "THEN", 
			"ELSE", "END_ELSE", "FOR", "WHILE", "DO", "LOOP", "INPUT", "OUTPUT", 
			"TRUE", "FALSE", "INT", "FLOAT", "BOOL", "NE", "EQ", "LT", "LE", "GT", 
			"GE", "ADD", "SUB", "OR", "MUL", "DIV", "AND", "NOT", "ID", "LETTER", 
			"COMMA", "COLON", "SEMICOLON", "DOT", "LPAR", "RPAR", "LBR", "RBR", "ASS", 
			"REAL_NUMBER", "EXP", "INT_NUMBER", "BIN_NUMBER", "OCT_NUMBER", "DEX_NUMBER", 
			"HEX_NUMBER", "DIGIT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(40);
			match(BEGIN);
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(41);
				decl();
				}
				break;
			case LET:
			case IF:
			case FOR:
			case DO:
			case INPUT:
			case OUTPUT:
			case ID:
				{
				setState(42);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(45);
				match(SEMICOLON);
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(46);
					decl();
					}
					break;
				case LET:
				case IF:
				case FOR:
				case DO:
				case INPUT:
				case OUTPUT:
				case ID:
					{
					setState(47);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public List<IdtContext> idt() {
			return getRuleContexts(IdtContext.class);
		}
		public IdtContext idt(int i) {
			return getRuleContext(IdtContext.class,i);
		}
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(VAR);
			setState(58);
			idt();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);
				setState(60);
				idt();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(COLON);
			setState(67);
			var_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(GrammarParser.BOOL, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Stmt_assContext stmt_ass() {
			return getRuleContext(Stmt_assContext.class,0);
		}
		public Stmt_inputContext stmt_input() {
			return getRuleContext(Stmt_inputContext.class,0);
		}
		public Stmt_outputContext stmt_output() {
			return getRuleContext(Stmt_outputContext.class,0);
		}
		public Stmt_ifContext stmt_if() {
			return getRuleContext(Stmt_ifContext.class,0);
		}
		public Stmt_forContext stmt_for() {
			return getRuleContext(Stmt_forContext.class,0);
		}
		public Stmt_whileContext stmt_while() {
			return getRuleContext(Stmt_whileContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case ID:
				{
				setState(71);
				stmt_ass();
				}
				break;
			case INPUT:
				{
				setState(72);
				stmt_input();
				}
				break;
			case OUTPUT:
				{
				setState(73);
				stmt_output();
				}
				break;
			case IF:
				{
				setState(74);
				stmt_if();
				}
				break;
			case FOR:
				{
				setState(75);
				stmt_for();
				}
				break;
			case DO:
				{
				setState(76);
				stmt_while();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_assContext extends ParserRuleContext {
		public IdtContext idt() {
			return getRuleContext(IdtContext.class,0);
		}
		public TerminalNode ASS() { return getToken(GrammarParser.ASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LET() { return getToken(GrammarParser.LET, 0); }
		public Stmt_assContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_ass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStmt_ass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStmt_ass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStmt_ass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_assContext stmt_ass() throws RecognitionException {
		Stmt_assContext _localctx = new Stmt_assContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt_ass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(79);
				match(LET);
				}
			}

			setState(82);
			idt();
			setState(83);
			match(ASS);
			setState(84);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(GrammarParser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode END_ELSE() { return getToken(GrammarParser.END_ELSE, 0); }
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public Stmt_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStmt_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStmt_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStmt_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_ifContext stmt_if() throws RecognitionException {
		Stmt_ifContext _localctx = new Stmt_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IF);
			setState(87);
			expr(0);
			setState(88);
			match(THEN);
			setState(89);
			stmt();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(90);
				match(ELSE);
				setState(91);
				stmt();
				}
			}

			setState(94);
			match(END_ELSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(GrammarParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public TerminalNode RPAR() { return getToken(GrammarParser.RPAR, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStmt_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStmt_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStmt_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_forContext stmt_for() throws RecognitionException {
		Stmt_forContext _localctx = new Stmt_forContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(FOR);
			setState(97);
			match(LPAR);
			setState(98);
			expr(0);
			setState(99);
			match(SEMICOLON);
			setState(100);
			expr(0);
			setState(101);
			match(SEMICOLON);
			setState(102);
			expr(0);
			setState(103);
			match(RPAR);
			setState(104);
			stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_whileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(GrammarParser.LOOP, 0); }
		public Stmt_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStmt_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStmt_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStmt_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_whileContext stmt_while() throws RecognitionException {
		Stmt_whileContext _localctx = new Stmt_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(DO);
			setState(107);
			match(WHILE);
			setState(108);
			expr(0);
			setState(109);
			stmt();
			setState(110);
			match(LOOP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_inputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(GrammarParser.INPUT, 0); }
		public TerminalNode LPAR() { return getToken(GrammarParser.LPAR, 0); }
		public List<IdtContext> idt() {
			return getRuleContexts(IdtContext.class);
		}
		public IdtContext idt(int i) {
			return getRuleContext(IdtContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(GrammarParser.RPAR, 0); }
		public Stmt_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStmt_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStmt_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStmt_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_inputContext stmt_input() throws RecognitionException {
		Stmt_inputContext _localctx = new Stmt_inputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(INPUT);
			setState(113);
			match(LPAR);
			setState(114);
			idt();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(115);
				idt();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_outputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(GrammarParser.OUTPUT, 0); }
		public TerminalNode LPAR() { return getToken(GrammarParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(GrammarParser.RPAR, 0); }
		public Stmt_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStmt_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStmt_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStmt_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_outputContext stmt_output() throws RecognitionException {
		Stmt_outputContext _localctx = new Stmt_outputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(OUTPUT);
			setState(124);
			match(LPAR);
			setState(125);
			expr(0);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 354094283751426L) != 0)) {
				{
				{
				setState(126);
				expr(0);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_exprContext extends ExprContext {
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unary_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Par_exprContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(GrammarParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(GrammarParser.RPAR, 0); }
		public Par_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPar_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Add_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
		}
		public Add_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAdd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAdd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAdd_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bool_exprContext extends ExprContext {
		public Bool_valueContext bool_value() {
			return getRuleContext(Bool_valueContext.class,0);
		}
		public Bool_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Rel_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Rel_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRel_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRel_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRel_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Idt_exprContext extends ExprContext {
		public IdtContext idt() {
			return getRuleContext(IdtContext.class,0);
		}
		public Idt_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIdt_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIdt_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIdt_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Number_exprContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Number_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumber_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumber_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumber_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mul_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Mul_opContext mul_op() {
			return getRuleContext(Mul_opContext.class,0);
		}
		public Mul_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMul_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMul_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMul_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new Par_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(135);
				match(LPAR);
				setState(136);
				expr(0);
				setState(137);
				match(RPAR);
				}
				break;
			case NOT:
				{
				_localctx = new Unary_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				unary_op();
				setState(140);
				expr(7);
				}
				break;
			case BOOL_VALUE:
				{
				_localctx = new Bool_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				bool_value();
				}
				break;
			case ID:
				{
				_localctx = new Idt_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				idt();
				}
				break;
			case REAL_NUMBER:
			case INT_NUMBER:
				{
				_localctx = new Number_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Mul_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(148);
						mul_op();
						setState(149);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new Add_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(152);
						add_op();
						setState(153);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new Rel_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
						rel_op();
						setState(157);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public IdtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIdt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIdt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIdt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdtContext idt() throws RecognitionException {
		IdtContext _localctx = new IdtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Real_numberContext real_number() {
			return getRuleContext(Real_numberContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				int_number();
				}
				break;
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				real_number();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(GrammarParser.INT_NUMBER, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_int_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(INT_NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Real_numberContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(GrammarParser.REAL_NUMBER, 0); }
		public Real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReal_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReal_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReal_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_numberContext real_number() throws RecognitionException {
		Real_numberContext _localctx = new Real_numberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_real_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(REAL_NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_valueContext extends ParserRuleContext {
		public TerminalNode BOOL_VALUE() { return getToken(GrammarParser.BOOL_VALUE, 0); }
		public Bool_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBool_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBool_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBool_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valueContext bool_value() throws RecognitionException {
		Bool_valueContext _localctx = new Bool_valueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(BOOL_VALUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode NE() { return getToken(GrammarParser.NE, 0); }
		public TerminalNode EQ() { return getToken(GrammarParser.EQ, 0); }
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public TerminalNode LE() { return getToken(GrammarParser.LE, 0); }
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public TerminalNode GE() { return getToken(GrammarParser.GE, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Add_opContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAdd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mul_opContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(GrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public Mul_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMul_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMul_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMul_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_opContext mul_op() throws RecognitionException {
		Mul_opContext _localctx = new Mul_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mul_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unary_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(NOT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u00b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		",\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00001\b\u0000\u0005"+
		"\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001>\b\u0001\n\u0001"+
		"\f\u0001A\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003N\b\u0003\u0001\u0004\u0003\u0004Q\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bu\b\b\n\b\f\bx\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0080\b\t\n\t\f\t\u0083\t\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0092\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a0"+
		"\b\n\n\n\f\n\u00a3\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f"+
		"\u00a9\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0001\u0014\u0014\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&\u0000\u0004\u0001\u0000\u0013\u0015\u0001\u0000\u0016\u001b\u0001"+
		"\u0000\u001c\u001e\u0001\u0000\u001f!\u00b9\u0000(\u0001\u0000\u0000\u0000"+
		"\u00029\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006M"+
		"\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000"+
		"\u0000\f`\u0001\u0000\u0000\u0000\u000ej\u0001\u0000\u0000\u0000\u0010"+
		"p\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014\u0091\u0001"+
		"\u0000\u0000\u0000\u0016\u00a4\u0001\u0000\u0000\u0000\u0018\u00a8\u0001"+
		"\u0000\u0000\u0000\u001a\u00aa\u0001\u0000\u0000\u0000\u001c\u00ac\u0001"+
		"\u0000\u0000\u0000\u001e\u00ae\u0001\u0000\u0000\u0000 \u00b0\u0001\u0000"+
		"\u0000\u0000\"\u00b2\u0001\u0000\u0000\u0000$\u00b4\u0001\u0000\u0000"+
		"\u0000&\u00b6\u0001\u0000\u0000\u0000(+\u0005\u0004\u0000\u0000),\u0003"+
		"\u0002\u0001\u0000*,\u0003\u0006\u0003\u0000+)\u0001\u0000\u0000\u0000"+
		"+*\u0001\u0000\u0000\u0000,4\u0001\u0000\u0000\u0000-0\u0005\'\u0000\u0000"+
		".1\u0003\u0002\u0001\u0000/1\u0003\u0006\u0003\u00000.\u0001\u0000\u0000"+
		"\u00000/\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u00002-\u0001\u0000"+
		"\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"78\u0005\u0005\u0000\u00008\u0001\u0001\u0000\u0000\u00009:\u0005\u0003"+
		"\u0000\u0000:?\u0003\u0016\u000b\u0000;<\u0005%\u0000\u0000<>\u0003\u0016"+
		"\u000b\u0000=;\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000BC\u0005&\u0000\u0000CD\u0003\u0004\u0002\u0000"+
		"D\u0003\u0001\u0000\u0000\u0000EF\u0007\u0000\u0000\u0000F\u0005\u0001"+
		"\u0000\u0000\u0000GN\u0003\b\u0004\u0000HN\u0003\u0010\b\u0000IN\u0003"+
		"\u0012\t\u0000JN\u0003\n\u0005\u0000KN\u0003\f\u0006\u0000LN\u0003\u000e"+
		"\u0007\u0000MG\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000MI\u0001"+
		"\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OQ\u0005\u0006"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RS\u0003\u0016\u000b\u0000ST\u0005-\u0000\u0000TU\u0003"+
		"\u0014\n\u0000U\t\u0001\u0000\u0000\u0000VW\u0005\u0007\u0000\u0000WX"+
		"\u0003\u0014\n\u0000XY\u0005\b\u0000\u0000Y\\\u0003\u0006\u0003\u0000"+
		"Z[\u0005\t\u0000\u0000[]\u0003\u0006\u0003\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005\n"+
		"\u0000\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0005\u000b\u0000\u0000"+
		"ab\u0005)\u0000\u0000bc\u0003\u0014\n\u0000cd\u0005\'\u0000\u0000de\u0003"+
		"\u0014\n\u0000ef\u0005\'\u0000\u0000fg\u0003\u0014\n\u0000gh\u0005*\u0000"+
		"\u0000hi\u0003\u0006\u0003\u0000i\r\u0001\u0000\u0000\u0000jk\u0005\r"+
		"\u0000\u0000kl\u0005\f\u0000\u0000lm\u0003\u0014\n\u0000mn\u0003\u0006"+
		"\u0003\u0000no\u0005\u000e\u0000\u0000o\u000f\u0001\u0000\u0000\u0000"+
		"pq\u0005\u000f\u0000\u0000qr\u0005)\u0000\u0000rv\u0003\u0016\u000b\u0000"+
		"su\u0003\u0016\u000b\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005*\u0000\u0000z\u0011\u0001"+
		"\u0000\u0000\u0000{|\u0005\u0010\u0000\u0000|}\u0005)\u0000\u0000}\u0081"+
		"\u0003\u0014\n\u0000~\u0080\u0003\u0014\n\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005*\u0000\u0000"+
		"\u0085\u0013\u0001\u0000\u0000\u0000\u0086\u0087\u0006\n\uffff\uffff\u0000"+
		"\u0087\u0088\u0005)\u0000\u0000\u0088\u0089\u0003\u0014\n\u0000\u0089"+
		"\u008a\u0005*\u0000\u0000\u008a\u0092\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0003&\u0013\u0000\u008c\u008d\u0003\u0014\n\u0007\u008d\u0092\u0001"+
		"\u0000\u0000\u0000\u008e\u0092\u0003\u001e\u000f\u0000\u008f\u0092\u0003"+
		"\u0016\u000b\u0000\u0090\u0092\u0003\u0018\f\u0000\u0091\u0086\u0001\u0000"+
		"\u0000\u0000\u0091\u008b\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u00a1\u0001\u0000\u0000\u0000\u0093\u0094\n\u0006\u0000"+
		"\u0000\u0094\u0095\u0003$\u0012\u0000\u0095\u0096\u0003\u0014\n\u0007"+
		"\u0096\u00a0\u0001\u0000\u0000\u0000\u0097\u0098\n\u0005\u0000\u0000\u0098"+
		"\u0099\u0003\"\u0011\u0000\u0099\u009a\u0003\u0014\n\u0006\u009a\u00a0"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\n\u0004\u0000\u0000\u009c\u009d\u0003"+
		" \u0010\u0000\u009d\u009e\u0003\u0014\n\u0005\u009e\u00a0\u0001\u0000"+
		"\u0000\u0000\u009f\u0093\u0001\u0000\u0000\u0000\u009f\u0097\u0001\u0000"+
		"\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u0015\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005#\u0000\u0000\u00a5\u0017\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a9\u0003\u001a\r\u0000\u00a7\u00a9\u0003\u001c\u000e\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u0019\u0001\u0000\u0000\u0000\u00aa\u00ab\u00050\u0000\u0000\u00ab"+
		"\u001b\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005.\u0000\u0000\u00ad\u001d"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0001\u0000\u0000\u00af\u001f"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0007\u0001\u0000\u0000\u00b1!\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0007\u0002\u0000\u0000\u00b3#\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0007\u0003\u0000\u0000\u00b5%\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005\"\u0000\u0000\u00b7\'\u0001\u0000\u0000\u0000"+
		"\r+04?MP\\v\u0081\u0091\u009f\u00a1\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}