// Generated from /Users/pavelbednar/Desktop/MIT/3._semestr/VYPa/Projekt/Compiler/vypa_compiler/vypa.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vypaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT_PARANTHESES_SMOOTH=1, RIGHT_PARANTHESES_SMOOTH=2, LEFT_PARANTHESES_SHARP=3, 
		RIGHT_PARANTHESES_SHARP=4, COMMA=5, COLON=6, SEMICOLON=7, DOT=8, ASSIGN=9, 
		NOT=10, MULT=11, DIV=12, ADD=13, MINUS=14, LESS=15, LOE=16, GREATER=17, 
		GOE=18, EQ=19, NEQ=20, AND=21, OR=22, CLASS=23, ELSE=24, IF=25, INT_TYPE=26, 
		NEW=27, RETURN=28, STRING_TYPE=29, SUPER=30, THIS=31, VOID=32, WHILE=33, 
		ID=34, INT_VAL=35, STRING_VAL=36, BLOCK_COMMENT=37, LINE_COMMENT=38, WHITE_SPACE=39;
	public static final int
		RULE_program = 0, RULE_class_definition = 1, RULE_definitions = 2, RULE_function_definition = 3, 
		RULE_param_list = 4, RULE_type = 5, RULE_data_type = 6, RULE_prim_type = 7, 
		RULE_statement = 8, RULE_stmt_local_vars = 9, RULE_stmt_assignment = 10, 
		RULE_stmt_while = 11, RULE_stmt_func_call = 12, RULE_stmt_method_call = 13, 
		RULE_stmt_if = 14, RULE_stmt_return = 15, RULE_expression = 16, RULE_casting = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_definition", "definitions", "function_definition", 
			"param_list", "type", "data_type", "prim_type", "statement", "stmt_local_vars", 
			"stmt_assignment", "stmt_while", "stmt_func_call", "stmt_method_call", 
			"stmt_if", "stmt_return", "expression", "casting"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "':'", "';'", "'.'", "'='", 
			"'!'", "'*'", "'/'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", 
			"'!='", "'&&'", "'||'", "'class'", "'else'", "'if'", "'int'", "'new'", 
			"'return'", "'string'", "'super'", "'this'", "'void'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFT_PARANTHESES_SMOOTH", "RIGHT_PARANTHESES_SMOOTH", "LEFT_PARANTHESES_SHARP", 
			"RIGHT_PARANTHESES_SHARP", "COMMA", "COLON", "SEMICOLON", "DOT", "ASSIGN", 
			"NOT", "MULT", "DIV", "ADD", "MINUS", "LESS", "LOE", "GREATER", "GOE", 
			"EQ", "NEQ", "AND", "OR", "CLASS", "ELSE", "IF", "INT_TYPE", "NEW", "RETURN", 
			"STRING_TYPE", "SUPER", "THIS", "VOID", "WHILE", "ID", "INT_VAL", "STRING_VAL", 
			"BLOCK_COMMENT", "LINE_COMMENT", "WHITE_SPACE"
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
	public String getGrammarFileName() { return "vypa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public vypaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public List<Class_definitionContext> class_definition() {
			return getRuleContexts(Class_definitionContext.class);
		}
		public Class_definitionContext class_definition(int i) {
			return getRuleContext(Class_definitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(38);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_TYPE:
					case STRING_TYPE:
					case VOID:
					case ID:
						{
						setState(36);
						function_definition();
						}
						break;
					case CLASS:
						{
						setState(37);
						class_definition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(43);
			function_definition();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case STRING_TYPE:
				case VOID:
				case ID:
					{
					setState(44);
					function_definition();
					}
					break;
				case CLASS:
					{
					setState(45);
					class_definition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
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

	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(vypaParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(vypaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(vypaParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(vypaParser.COLON, 0); }
		public TerminalNode LEFT_PARANTHESES_SHARP() { return getToken(vypaParser.LEFT_PARANTHESES_SHARP, 0); }
		public TerminalNode RIGHT_PARANTHESES_SHARP() { return getToken(vypaParser.RIGHT_PARANTHESES_SHARP, 0); }
		public List<DefinitionsContext> definitions() {
			return getRuleContexts(DefinitionsContext.class);
		}
		public DefinitionsContext definitions(int i) {
			return getRuleContext(DefinitionsContext.class,i);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(CLASS);
			setState(52);
			match(ID);
			setState(53);
			match(COLON);
			setState(54);
			match(ID);
			setState(55);
			match(LEFT_PARANTHESES_SHARP);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				{
				setState(56);
				definitions();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(RIGHT_PARANTHESES_SHARP);
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

	public static class DefinitionsContext extends ParserRuleContext {
		public Stmt_local_varsContext stmt_local_vars() {
			return getRuleContext(Stmt_local_varsContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definitions);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				stmt_local_vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				function_definition();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(vypaParser.ID, 0); }
		public TerminalNode LEFT_PARANTHESES_SMOOTH() { return getToken(vypaParser.LEFT_PARANTHESES_SMOOTH, 0); }
		public TerminalNode RIGHT_PARANTHESES_SMOOTH() { return getToken(vypaParser.RIGHT_PARANTHESES_SMOOTH, 0); }
		public TerminalNode LEFT_PARANTHESES_SHARP() { return getToken(vypaParser.LEFT_PARANTHESES_SHARP, 0); }
		public TerminalNode RIGHT_PARANTHESES_SHARP() { return getToken(vypaParser.RIGHT_PARANTHESES_SHARP, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode VOID() { return getToken(vypaParser.VOID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			type();
			setState(69);
			match(ID);
			setState(70);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
			case ID:
				{
				setState(71);
				param_list();
				}
				break;
			case VOID:
				{
				setState(72);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(75);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(76);
			match(LEFT_PARANTHESES_SHARP);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INT_TYPE) | (1L << RETURN) | (1L << STRING_TYPE) | (1L << SUPER) | (1L << THIS) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(77);
				statement();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(RIGHT_PARANTHESES_SHARP);
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

	public static class Param_listContext extends ParserRuleContext {
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(vypaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(vypaParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vypaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vypaParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			data_type();
			setState(86);
			match(ID);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(87);
				match(COMMA);
				setState(88);
				data_type();
				setState(89);
				match(ID);
				}
				}
				setState(95);
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

	public static class TypeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(vypaParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				data_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(VOID);
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

	public static class Data_typeContext extends ParserRuleContext {
		public Prim_typeContext prim_type() {
			return getRuleContext(Prim_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(vypaParser.ID, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_data_type);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				prim_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(ID);
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

	public static class Prim_typeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(vypaParser.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(vypaParser.STRING_TYPE, 0); }
		public Prim_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim_type; }
	}

	public final Prim_typeContext prim_type() throws RecognitionException {
		Prim_typeContext _localctx = new Prim_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prim_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==STRING_TYPE) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public Stmt_local_varsContext stmt_local_vars() {
			return getRuleContext(Stmt_local_varsContext.class,0);
		}
		public Stmt_assignmentContext stmt_assignment() {
			return getRuleContext(Stmt_assignmentContext.class,0);
		}
		public Stmt_ifContext stmt_if() {
			return getRuleContext(Stmt_ifContext.class,0);
		}
		public Stmt_whileContext stmt_while() {
			return getRuleContext(Stmt_whileContext.class,0);
		}
		public Stmt_func_callContext stmt_func_call() {
			return getRuleContext(Stmt_func_callContext.class,0);
		}
		public Stmt_method_callContext stmt_method_call() {
			return getRuleContext(Stmt_method_callContext.class,0);
		}
		public Stmt_returnContext stmt_return() {
			return getRuleContext(Stmt_returnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				stmt_local_vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				stmt_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				stmt_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				stmt_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				stmt_func_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				stmt_method_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				stmt_return();
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

	public static class Stmt_local_varsContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(vypaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(vypaParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(vypaParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(vypaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vypaParser.COMMA, i);
		}
		public Stmt_local_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_local_vars; }
	}

	public final Stmt_local_varsContext stmt_local_vars() throws RecognitionException {
		Stmt_local_varsContext _localctx = new Stmt_local_varsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt_local_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			data_type();
			setState(116);
			match(ID);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117);
				match(COMMA);
				setState(118);
				match(ID);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(SEMICOLON);
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

	public static class Stmt_assignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vypaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(vypaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(vypaParser.SEMICOLON, 0); }
		public Stmt_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_assignment; }
	}

	public final Stmt_assignmentContext stmt_assignment() throws RecognitionException {
		Stmt_assignmentContext _localctx = new Stmt_assignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(127);
			match(ASSIGN);
			setState(128);
			expression(0);
			setState(129);
			match(SEMICOLON);
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

	public static class Stmt_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(vypaParser.WHILE, 0); }
		public TerminalNode LEFT_PARANTHESES_SMOOTH() { return getToken(vypaParser.LEFT_PARANTHESES_SMOOTH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES_SMOOTH() { return getToken(vypaParser.RIGHT_PARANTHESES_SMOOTH, 0); }
		public TerminalNode LEFT_PARANTHESES_SHARP() { return getToken(vypaParser.LEFT_PARANTHESES_SHARP, 0); }
		public TerminalNode RIGHT_PARANTHESES_SHARP() { return getToken(vypaParser.RIGHT_PARANTHESES_SHARP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Stmt_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_while; }
	}

	public final Stmt_whileContext stmt_while() throws RecognitionException {
		Stmt_whileContext _localctx = new Stmt_whileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(WHILE);
			setState(132);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(133);
			expression(0);
			setState(134);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(135);
			match(LEFT_PARANTHESES_SHARP);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INT_TYPE) | (1L << RETURN) | (1L << STRING_TYPE) | (1L << SUPER) | (1L << THIS) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(136);
				statement();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(RIGHT_PARANTHESES_SHARP);
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

	public static class Stmt_func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vypaParser.ID, 0); }
		public TerminalNode LEFT_PARANTHESES_SMOOTH() { return getToken(vypaParser.LEFT_PARANTHESES_SMOOTH, 0); }
		public TerminalNode RIGHT_PARANTHESES_SMOOTH() { return getToken(vypaParser.RIGHT_PARANTHESES_SMOOTH, 0); }
		public TerminalNode SEMICOLON() { return getToken(vypaParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vypaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vypaParser.COMMA, i);
		}
		public Stmt_func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_func_call; }
	}

	public final Stmt_func_callContext stmt_func_call() throws RecognitionException {
		Stmt_func_callContext _localctx = new Stmt_func_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmt_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
			setState(145);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PARANTHESES_SMOOTH) | (1L << NOT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << ID) | (1L << INT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(146);
				expression(0);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(147);
					match(COMMA);
					setState(148);
					expression(0);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(156);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(157);
			match(SEMICOLON);
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

	public static class Stmt_method_callContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(vypaParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(vypaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(vypaParser.ID, i);
		}
		public TerminalNode LEFT_PARANTHESES_SMOOTH() { return getToken(vypaParser.LEFT_PARANTHESES_SMOOTH, 0); }
		public TerminalNode RIGHT_PARANTHESES_SMOOTH() { return getToken(vypaParser.RIGHT_PARANTHESES_SMOOTH, 0); }
		public TerminalNode SEMICOLON() { return getToken(vypaParser.SEMICOLON, 0); }
		public TerminalNode THIS() { return getToken(vypaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(vypaParser.SUPER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vypaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vypaParser.COMMA, i);
		}
		public Stmt_method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_method_call; }
	}

	public final Stmt_method_callContext stmt_method_call() throws RecognitionException {
		Stmt_method_callContext _localctx = new Stmt_method_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(160);
			match(DOT);
			setState(161);
			match(ID);
			setState(162);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PARANTHESES_SMOOTH) | (1L << NOT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << ID) | (1L << INT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(163);
				expression(0);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(164);
					match(COMMA);
					setState(165);
					expression(0);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(173);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(174);
			match(SEMICOLON);
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

	public static class Stmt_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(vypaParser.IF, 0); }
		public TerminalNode LEFT_PARANTHESES_SMOOTH() { return getToken(vypaParser.LEFT_PARANTHESES_SMOOTH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES_SMOOTH() { return getToken(vypaParser.RIGHT_PARANTHESES_SMOOTH, 0); }
		public List<TerminalNode> LEFT_PARANTHESES_SHARP() { return getTokens(vypaParser.LEFT_PARANTHESES_SHARP); }
		public TerminalNode LEFT_PARANTHESES_SHARP(int i) {
			return getToken(vypaParser.LEFT_PARANTHESES_SHARP, i);
		}
		public List<TerminalNode> RIGHT_PARANTHESES_SHARP() { return getTokens(vypaParser.RIGHT_PARANTHESES_SHARP); }
		public TerminalNode RIGHT_PARANTHESES_SHARP(int i) {
			return getToken(vypaParser.RIGHT_PARANTHESES_SHARP, i);
		}
		public TerminalNode ELSE() { return getToken(vypaParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Stmt_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_if; }
	}

	public final Stmt_ifContext stmt_if() throws RecognitionException {
		Stmt_ifContext _localctx = new Stmt_ifContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IF);
			setState(177);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(178);
			expression(0);
			setState(179);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(180);
			match(LEFT_PARANTHESES_SHARP);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INT_TYPE) | (1L << RETURN) | (1L << STRING_TYPE) | (1L << SUPER) | (1L << THIS) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(181);
				statement();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(RIGHT_PARANTHESES_SHARP);
			setState(188);
			match(ELSE);
			setState(189);
			match(LEFT_PARANTHESES_SHARP);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INT_TYPE) | (1L << RETURN) | (1L << STRING_TYPE) | (1L << SUPER) | (1L << THIS) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(190);
				statement();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(RIGHT_PARANTHESES_SHARP);
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

	public static class Stmt_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(vypaParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(vypaParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Stmt_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_return; }
	}

	public final Stmt_returnContext stmt_return() throws RecognitionException {
		Stmt_returnContext _localctx = new Stmt_returnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(RETURN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PARANTHESES_SMOOTH) | (1L << NOT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << ID) | (1L << INT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(199);
				expression(0);
				}
			}

			setState(202);
			match(SEMICOLON);
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
		public TerminalNode LEFT_PARANTHESES_SMOOTH() { return getToken(vypaParser.LEFT_PARANTHESES_SMOOTH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PARANTHESES_SMOOTH() { return getToken(vypaParser.RIGHT_PARANTHESES_SMOOTH, 0); }
		public TerminalNode NEW() { return getToken(vypaParser.NEW, 0); }
		public List<TerminalNode> ID() { return getTokens(vypaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(vypaParser.ID, i);
		}
		public CastingContext casting() {
			return getRuleContext(CastingContext.class,0);
		}
		public Stmt_func_callContext stmt_func_call() {
			return getRuleContext(Stmt_func_callContext.class,0);
		}
		public Stmt_method_callContext stmt_method_call() {
			return getRuleContext(Stmt_method_callContext.class,0);
		}
		public TerminalNode DOT() { return getToken(vypaParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(vypaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(vypaParser.SUPER, 0); }
		public TerminalNode NOT() { return getToken(vypaParser.NOT, 0); }
		public TerminalNode INT_VAL() { return getToken(vypaParser.INT_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(vypaParser.STRING_VAL, 0); }
		public TerminalNode MULT() { return getToken(vypaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(vypaParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(vypaParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(vypaParser.MINUS, 0); }
		public TerminalNode LESS() { return getToken(vypaParser.LESS, 0); }
		public TerminalNode LOE() { return getToken(vypaParser.LOE, 0); }
		public TerminalNode GREATER() { return getToken(vypaParser.GREATER, 0); }
		public TerminalNode GOE() { return getToken(vypaParser.GOE, 0); }
		public TerminalNode AND() { return getToken(vypaParser.AND, 0); }
		public TerminalNode OR() { return getToken(vypaParser.OR, 0); }
		public TerminalNode EQ() { return getToken(vypaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(vypaParser.NEQ, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(205);
				match(LEFT_PARANTHESES_SMOOTH);
				setState(206);
				expression(0);
				setState(207);
				match(RIGHT_PARANTHESES_SMOOTH);
				}
				break;
			case 2:
				{
				setState(209);
				match(NEW);
				setState(210);
				match(ID);
				}
				break;
			case 3:
				{
				setState(213);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_PARANTHESES_SMOOTH:
					{
					setState(211);
					casting();
					}
					break;
				case ID:
					{
					setState(212);
					stmt_func_call();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(215);
					stmt_method_call();
					}
					break;
				case 2:
					{
					setState(216);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << ID))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(217);
					match(DOT);
					setState(218);
					match(ID);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(221);
				match(NOT);
				setState(222);
				expression(9);
				}
				break;
			case 6:
				{
				setState(223);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT_VAL) | (1L << STRING_VAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(227);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(228);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(230);
						match(ADD);
						setState(231);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(233);
						match(MINUS);
						setState(234);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(236);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LOE) | (1L << GREATER) | (1L << GOE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(237);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(239);
						match(AND);
						setState(240);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(242);
						match(OR);
						setState(243);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(245);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class CastingContext extends ParserRuleContext {
		public TerminalNode LEFT_PARANTHESES_SMOOTH() { return getToken(vypaParser.LEFT_PARANTHESES_SMOOTH, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES_SMOOTH() { return getToken(vypaParser.RIGHT_PARANTHESES_SMOOTH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casting; }
	}

	public final CastingContext casting() throws RecognitionException {
		CastingContext _localctx = new CastingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_casting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(252);
			data_type();
			setState(253);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(254);
			expression(0);
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
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0103\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\2\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3"+
		"\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\5\7\5Q\n\5\f"+
		"\5\16\5T\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6"+
		"\3\7\3\7\5\7e\n\7\3\b\3\b\5\bi\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\nt\n\n\3\13\3\13\3\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008c\n\r\f\r\16\r\u008f"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16\u009b"+
		"\13\16\5\16\u009d\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u00a9\n\17\f\17\16\17\u00ac\13\17\5\17\u00ae\n\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00b9\n\20\f\20\16\20\u00bc\13"+
		"\20\3\20\3\20\3\20\3\20\7\20\u00c2\n\20\f\20\16\20\u00c5\13\20\3\20\3"+
		"\20\3\21\3\21\5\21\u00cb\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00d8\n\22\3\22\3\22\3\22\3\22\5\22\u00de\n\22\3"+
		"\22\3\22\3\22\5\22\u00e3\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f9"+
		"\n\22\f\22\16\22\u00fc\13\22\3\23\3\23\3\23\3\23\3\23\3\23\2\3\"\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\b\4\2\34\34\37\37\4\2 !$$"+
		"\3\2$&\3\2\r\16\3\2\21\24\3\2\25\26\2\u0118\2*\3\2\2\2\4\65\3\2\2\2\6"+
		"D\3\2\2\2\bF\3\2\2\2\nW\3\2\2\2\fd\3\2\2\2\16h\3\2\2\2\20j\3\2\2\2\22"+
		"s\3\2\2\2\24u\3\2\2\2\26\u0080\3\2\2\2\30\u0085\3\2\2\2\32\u0092\3\2\2"+
		"\2\34\u00a1\3\2\2\2\36\u00b2\3\2\2\2 \u00c8\3\2\2\2\"\u00e2\3\2\2\2$\u00fd"+
		"\3\2\2\2&)\5\b\5\2\')\5\4\3\2(&\3\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2"+
		"*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-\62\5\b\5\2.\61\5\b\5\2/\61\5\4\3\2\60"+
		".\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3"+
		"\2\2\2\64\62\3\2\2\2\65\66\7\31\2\2\66\67\7$\2\2\678\7\b\2\289\7$\2\2"+
		"9=\7\5\2\2:<\5\6\4\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2"+
		"?=\3\2\2\2@A\7\6\2\2A\5\3\2\2\2BE\5\24\13\2CE\5\b\5\2DB\3\2\2\2DC\3\2"+
		"\2\2E\7\3\2\2\2FG\5\f\7\2GH\7$\2\2HK\7\3\2\2IL\5\n\6\2JL\7\"\2\2KI\3\2"+
		"\2\2KJ\3\2\2\2LM\3\2\2\2MN\7\4\2\2NR\7\5\2\2OQ\5\22\n\2PO\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\6\2\2V\t\3\2\2\2WX"+
		"\5\16\b\2X_\7$\2\2YZ\7\7\2\2Z[\5\16\b\2[\\\7$\2\2\\^\3\2\2\2]Y\3\2\2\2"+
		"^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a_\3\2\2\2be\5\16\b\2ce\7\""+
		"\2\2db\3\2\2\2dc\3\2\2\2e\r\3\2\2\2fi\5\20\t\2gi\7$\2\2hf\3\2\2\2hg\3"+
		"\2\2\2i\17\3\2\2\2jk\t\2\2\2k\21\3\2\2\2lt\5\24\13\2mt\5\26\f\2nt\5\36"+
		"\20\2ot\5\30\r\2pt\5\32\16\2qt\5\34\17\2rt\5 \21\2sl\3\2\2\2sm\3\2\2\2"+
		"sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\23\3\2\2\2uv\5\16"+
		"\b\2v{\7$\2\2wx\7\7\2\2xz\7$\2\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|~\3\2\2\2}{\3\2\2\2~\177\7\t\2\2\177\25\3\2\2\2\u0080\u0081\7$\2\2"+
		"\u0081\u0082\7\13\2\2\u0082\u0083\5\"\22\2\u0083\u0084\7\t\2\2\u0084\27"+
		"\3\2\2\2\u0085\u0086\7#\2\2\u0086\u0087\7\3\2\2\u0087\u0088\5\"\22\2\u0088"+
		"\u0089\7\4\2\2\u0089\u008d\7\5\2\2\u008a\u008c\5\22\n\2\u008b\u008a\3"+
		"\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\6\2\2\u0091\31\3\2\2"+
		"\2\u0092\u0093\7$\2\2\u0093\u009c\7\3\2\2\u0094\u0099\5\"\22\2\u0095\u0096"+
		"\7\7\2\2\u0096\u0098\5\"\22\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\7\4\2\2\u009f\u00a0\7\t\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\t\3\2"+
		"\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\7$\2\2\u00a4\u00ad\7\3\2\2\u00a5\u00aa"+
		"\5\"\22\2\u00a6\u00a7\7\7\2\2\u00a7\u00a9\5\"\22\2\u00a8\u00a6\3\2\2\2"+
		"\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\7\4\2\2\u00b0\u00b1\7\t\2\2\u00b1\35\3\2\2"+
		"\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b5\5\"\22\2\u00b5"+
		"\u00b6\7\4\2\2\u00b6\u00ba\7\5\2\2\u00b7\u00b9\5\22\n\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\6\2\2\u00be\u00bf\7\32"+
		"\2\2\u00bf\u00c3\7\5\2\2\u00c0\u00c2\5\22\n\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\6\2\2\u00c7\37\3\2\2\2\u00c8\u00ca"+
		"\7\36\2\2\u00c9\u00cb\5\"\22\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\t\2\2\u00cd!\3\2\2\2\u00ce\u00cf\b"+
		"\22\1\2\u00cf\u00d0\7\3\2\2\u00d0\u00d1\5\"\22\2\u00d1\u00d2\7\4\2\2\u00d2"+
		"\u00e3\3\2\2\2\u00d3\u00d4\7\35\2\2\u00d4\u00e3\7$\2\2\u00d5\u00d8\5$"+
		"\23\2\u00d6\u00d8\5\32\16\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00e3\3\2\2\2\u00d9\u00de\5\34\17\2\u00da\u00db\t\3\2\2\u00db\u00dc\7"+
		"\n\2\2\u00dc\u00de\7$\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00de"+
		"\u00e3\3\2\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e3\5\"\22\13\u00e1\u00e3\t"+
		"\4\2\2\u00e2\u00ce\3\2\2\2\u00e2\u00d3\3\2\2\2\u00e2\u00d7\3\2\2\2\u00e2"+
		"\u00dd\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00fa\3\2"+
		"\2\2\u00e4\u00e5\f\n\2\2\u00e5\u00e6\t\5\2\2\u00e6\u00f9\5\"\22\13\u00e7"+
		"\u00e8\f\t\2\2\u00e8\u00e9\7\17\2\2\u00e9\u00f9\5\"\22\n\u00ea\u00eb\f"+
		"\b\2\2\u00eb\u00ec\7\20\2\2\u00ec\u00f9\5\"\22\t\u00ed\u00ee\f\7\2\2\u00ee"+
		"\u00ef\t\6\2\2\u00ef\u00f9\5\"\22\b\u00f0\u00f1\f\5\2\2\u00f1\u00f2\7"+
		"\27\2\2\u00f2\u00f9\5\"\22\6\u00f3\u00f4\f\4\2\2\u00f4\u00f5\7\30\2\2"+
		"\u00f5\u00f9\5\"\22\5\u00f6\u00f7\f\6\2\2\u00f7\u00f9\t\7\2\2\u00f8\u00e4"+
		"\3\2\2\2\u00f8\u00e7\3\2\2\2\u00f8\u00ea\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8"+
		"\u00f0\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb#\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fd\u00fe\7\3\2\2\u00fe\u00ff\5\16\b\2\u00ff\u0100\7\4\2\2"+
		"\u0100\u0101\5\"\22\2\u0101%\3\2\2\2\34(*\60\62=DKR_dhs{\u008d\u0099\u009c"+
		"\u00aa\u00ad\u00ba\u00c3\u00ca\u00d7\u00dd\u00e2\u00f8\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}