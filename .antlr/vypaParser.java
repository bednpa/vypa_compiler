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
		RULE_function_body = 4, RULE_param_list = 5, RULE_type = 6, RULE_data_type = 7, 
		RULE_prim_type = 8, RULE_statement = 9, RULE_stmt_local_vars = 10, RULE_stmt_assignment = 11, 
		RULE_stmt_while = 12, RULE_stmt_func_call = 13, RULE_stmt_method_call = 14, 
		RULE_stmt_if = 15, RULE_if_header = 16, RULE_stmt_return = 17, RULE_expression = 18, 
		RULE_casting = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_definition", "definitions", "function_definition", 
			"function_body", "param_list", "type", "data_type", "prim_type", "statement", 
			"stmt_local_vars", "stmt_assignment", "stmt_while", "stmt_func_call", 
			"stmt_method_call", "stmt_if", "if_header", "stmt_return", "expression", 
			"casting"
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
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(42);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_TYPE:
					case STRING_TYPE:
					case VOID:
					case ID:
						{
						setState(40);
						function_definition();
						}
						break;
					case CLASS:
						{
						setState(41);
						class_definition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(47);
			function_definition();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case STRING_TYPE:
				case VOID:
				case ID:
					{
					setState(48);
					function_definition();
					}
					break;
				case CLASS:
					{
					setState(49);
					class_definition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
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
			setState(55);
			match(CLASS);
			setState(56);
			match(ID);
			setState(57);
			match(COLON);
			setState(58);
			match(ID);
			setState(59);
			match(LEFT_PARANTHESES_SHARP);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				{
				setState(60);
				definitions();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				stmt_local_vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
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
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode VOID() { return getToken(vypaParser.VOID, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			type();
			setState(73);
			match(ID);
			setState(74);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
			case ID:
				{
				setState(75);
				param_list();
				}
				break;
			case VOID:
				{
				setState(76);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(79);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(80);
			function_body();
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode LEFT_PARANTHESES_SHARP() { return getToken(vypaParser.LEFT_PARANTHESES_SHARP, 0); }
		public TerminalNode RIGHT_PARANTHESES_SHARP() { return getToken(vypaParser.RIGHT_PARANTHESES_SHARP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LEFT_PARANTHESES_SHARP);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INT_TYPE) | (1L << RETURN) | (1L << STRING_TYPE) | (1L << SUPER) | (1L << THIS) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(83);
				statement();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		enterRule(_localctx, 10, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			data_type();
			setState(92);
			match(ID);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				data_type();
				setState(95);
				match(ID);
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
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				data_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
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
		enterRule(_localctx, 14, RULE_data_type);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				prim_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
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
		enterRule(_localctx, 16, RULE_prim_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				stmt_local_vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				stmt_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				stmt_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				stmt_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				stmt_func_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				stmt_method_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
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
		enterRule(_localctx, 20, RULE_stmt_local_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			data_type();
			setState(122);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				match(ID);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
		enterRule(_localctx, 22, RULE_stmt_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
			setState(133);
			match(ASSIGN);
			setState(134);
			expression(0);
			setState(135);
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
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Stmt_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_while; }
	}

	public final Stmt_whileContext stmt_while() throws RecognitionException {
		Stmt_whileContext _localctx = new Stmt_whileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmt_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(WHILE);
			setState(138);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(139);
			expression(0);
			setState(140);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(141);
			function_body();
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
		enterRule(_localctx, 26, RULE_stmt_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ID);
			setState(144);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PARANTHESES_SMOOTH) | (1L << NOT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << ID) | (1L << INT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(145);
				expression(0);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(146);
					match(COMMA);
					setState(147);
					expression(0);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(155);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(156);
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
		enterRule(_localctx, 28, RULE_stmt_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(DOT);
			setState(160);
			match(ID);
			setState(161);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PARANTHESES_SMOOTH) | (1L << NOT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << ID) | (1L << INT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(162);
				expression(0);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(163);
					match(COMMA);
					setState(164);
					expression(0);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(172);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(173);
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
		public If_headerContext if_header() {
			return getRuleContext(If_headerContext.class,0);
		}
		public List<Function_bodyContext> function_body() {
			return getRuleContexts(Function_bodyContext.class);
		}
		public Function_bodyContext function_body(int i) {
			return getRuleContext(Function_bodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(vypaParser.ELSE, 0); }
		public Stmt_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_if; }
	}

	public final Stmt_ifContext stmt_if() throws RecognitionException {
		Stmt_ifContext _localctx = new Stmt_ifContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			if_header();
			setState(176);
			function_body();
			setState(177);
			match(ELSE);
			setState(178);
			function_body();
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

	public static class If_headerContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(vypaParser.IF, 0); }
		public TerminalNode LEFT_PARANTHESES_SMOOTH() { return getToken(vypaParser.LEFT_PARANTHESES_SMOOTH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES_SMOOTH() { return getToken(vypaParser.RIGHT_PARANTHESES_SMOOTH, 0); }
		public If_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_header; }
	}

	public final If_headerContext if_header() throws RecognitionException {
		If_headerContext _localctx = new If_headerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IF);
			setState(181);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(182);
			expression(0);
			setState(183);
			match(RIGHT_PARANTHESES_SMOOTH);
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
		enterRule(_localctx, 34, RULE_stmt_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(RETURN);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PARANTHESES_SMOOTH) | (1L << NOT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << ID) | (1L << INT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(186);
				expression(0);
				}
			}

			setState(189);
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
		public TerminalNode EQ() { return getToken(vypaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(vypaParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(vypaParser.AND, 0); }
		public TerminalNode OR() { return getToken(vypaParser.OR, 0); }
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(192);
				match(LEFT_PARANTHESES_SMOOTH);
				setState(193);
				expression(0);
				setState(194);
				match(RIGHT_PARANTHESES_SMOOTH);
				}
				break;
			case 2:
				{
				setState(196);
				match(NEW);
				setState(197);
				match(ID);
				}
				break;
			case 3:
				{
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_PARANTHESES_SMOOTH:
					{
					setState(198);
					casting();
					}
					break;
				case ID:
					{
					setState(199);
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
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(202);
					stmt_method_call();
					}
					break;
				case 2:
					{
					setState(203);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << ID))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(204);
					match(DOT);
					setState(205);
					match(ID);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(208);
				match(NOT);
				setState(209);
				expression(9);
				}
				break;
			case 6:
				{
				setState(210);
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
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(214);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(217);
						match(ADD);
						setState(218);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(220);
						match(MINUS);
						setState(221);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(223);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LOE) | (1L << GREATER) | (1L << GOE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(226);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(229);
						match(AND);
						setState(230);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(232);
						match(OR);
						setState(233);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 38, RULE_casting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(240);
			data_type();
			setState(241);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(242);
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
		case 18:
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
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3"+
		"\16\3C\13\3\3\3\3\3\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\5"+
		"\3\5\3\5\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7d\n\7\f\7\16\7g\13\7\3\b\3\b\5\bk\n\b\3\t\3\t\5\to\n\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13z\n\13\3\f\3\f\3\f\3\f\7\f\u0080"+
		"\n\f\f\f\16\f\u0083\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u0097\n\17\f\17\16\17\u009a"+
		"\13\17\5\17\u009c\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00a8\n\20\f\20\16\20\u00ab\13\20\5\20\u00ad\n\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00be"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00cb"+
		"\n\24\3\24\3\24\3\24\3\24\5\24\u00d1\n\24\3\24\3\24\3\24\5\24\u00d6\n"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00ed\n\24\f\24\16\24\u00f0"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\2\3&\26\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(\2\b\4\2\34\34\37\37\4\2 !$$\3\2$&\3\2\r\16\3\2\21\24"+
		"\3\2\25\26\2\u0107\2.\3\2\2\2\49\3\2\2\2\6H\3\2\2\2\bJ\3\2\2\2\nT\3\2"+
		"\2\2\f]\3\2\2\2\16j\3\2\2\2\20n\3\2\2\2\22p\3\2\2\2\24y\3\2\2\2\26{\3"+
		"\2\2\2\30\u0086\3\2\2\2\32\u008b\3\2\2\2\34\u0091\3\2\2\2\36\u00a0\3\2"+
		"\2\2 \u00b1\3\2\2\2\"\u00b6\3\2\2\2$\u00bb\3\2\2\2&\u00d5\3\2\2\2(\u00f1"+
		"\3\2\2\2*-\5\b\5\2+-\5\4\3\2,*\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2"+
		"./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\66\5\b\5\2\62\65\5\b\5\2\63\65\5"+
		"\4\3\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2"+
		"\2\2\67\3\3\2\2\28\66\3\2\2\29:\7\31\2\2:;\7$\2\2;<\7\b\2\2<=\7$\2\2="+
		"A\7\5\2\2>@\5\6\4\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2"+
		"CA\3\2\2\2DE\7\6\2\2E\5\3\2\2\2FI\5\26\f\2GI\5\b\5\2HF\3\2\2\2HG\3\2\2"+
		"\2I\7\3\2\2\2JK\5\16\b\2KL\7$\2\2LO\7\3\2\2MP\5\f\7\2NP\7\"\2\2OM\3\2"+
		"\2\2ON\3\2\2\2PQ\3\2\2\2QR\7\4\2\2RS\5\n\6\2S\t\3\2\2\2TX\7\5\2\2UW\5"+
		"\24\13\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2["+
		"\\\7\6\2\2\\\13\3\2\2\2]^\5\20\t\2^e\7$\2\2_`\7\7\2\2`a\5\20\t\2ab\7$"+
		"\2\2bd\3\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3\2\2\2ge\3"+
		"\2\2\2hk\5\20\t\2ik\7\"\2\2jh\3\2\2\2ji\3\2\2\2k\17\3\2\2\2lo\5\22\n\2"+
		"mo\7$\2\2nl\3\2\2\2nm\3\2\2\2o\21\3\2\2\2pq\t\2\2\2q\23\3\2\2\2rz\5\26"+
		"\f\2sz\5\30\r\2tz\5 \21\2uz\5\32\16\2vz\5\34\17\2wz\5\36\20\2xz\5$\23"+
		"\2yr\3\2\2\2ys\3\2\2\2yt\3\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2"+
		"\2z\25\3\2\2\2{|\5\20\t\2|\u0081\7$\2\2}~\7\7\2\2~\u0080\7$\2\2\177}\3"+
		"\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\t\2\2\u0085\27\3\2\2"+
		"\2\u0086\u0087\7$\2\2\u0087\u0088\7\13\2\2\u0088\u0089\5&\24\2\u0089\u008a"+
		"\7\t\2\2\u008a\31\3\2\2\2\u008b\u008c\7#\2\2\u008c\u008d\7\3\2\2\u008d"+
		"\u008e\5&\24\2\u008e\u008f\7\4\2\2\u008f\u0090\5\n\6\2\u0090\33\3\2\2"+
		"\2\u0091\u0092\7$\2\2\u0092\u009b\7\3\2\2\u0093\u0098\5&\24\2\u0094\u0095"+
		"\7\7\2\2\u0095\u0097\5&\24\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u0093\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\7\4\2\2\u009e\u009f\7\t\2\2\u009f\35\3\2\2\2\u00a0\u00a1\t\3\2"+
		"\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\7$\2\2\u00a3\u00ac\7\3\2\2\u00a4\u00a9"+
		"\5&\24\2\u00a5\u00a6\7\7\2\2\u00a6\u00a8\5&\24\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\7\4\2\2\u00af\u00b0\7\t\2\2\u00b0\37\3\2\2"+
		"\2\u00b1\u00b2\5\"\22\2\u00b2\u00b3\5\n\6\2\u00b3\u00b4\7\32\2\2\u00b4"+
		"\u00b5\5\n\6\2\u00b5!\3\2\2\2\u00b6\u00b7\7\33\2\2\u00b7\u00b8\7\3\2\2"+
		"\u00b8\u00b9\5&\24\2\u00b9\u00ba\7\4\2\2\u00ba#\3\2\2\2\u00bb\u00bd\7"+
		"\36\2\2\u00bc\u00be\5&\24\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\7\t\2\2\u00c0%\3\2\2\2\u00c1\u00c2\b\24\1\2"+
		"\u00c2\u00c3\7\3\2\2\u00c3\u00c4\5&\24\2\u00c4\u00c5\7\4\2\2\u00c5\u00d6"+
		"\3\2\2\2\u00c6\u00c7\7\35\2\2\u00c7\u00d6\7$\2\2\u00c8\u00cb\5(\25\2\u00c9"+
		"\u00cb\5\34\17\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00d6\3"+
		"\2\2\2\u00cc\u00d1\5\36\20\2\u00cd\u00ce\t\3\2\2\u00ce\u00cf\7\n\2\2\u00cf"+
		"\u00d1\7$\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d6\3\2"+
		"\2\2\u00d2\u00d3\7\f\2\2\u00d3\u00d6\5&\24\13\u00d4\u00d6\t\4\2\2\u00d5"+
		"\u00c1\3\2\2\2\u00d5\u00c6\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00d0\3\2"+
		"\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00ee\3\2\2\2\u00d7"+
		"\u00d8\f\n\2\2\u00d8\u00d9\t\5\2\2\u00d9\u00ed\5&\24\13\u00da\u00db\f"+
		"\t\2\2\u00db\u00dc\7\17\2\2\u00dc\u00ed\5&\24\n\u00dd\u00de\f\b\2\2\u00de"+
		"\u00df\7\20\2\2\u00df\u00ed\5&\24\t\u00e0\u00e1\f\7\2\2\u00e1\u00e2\t"+
		"\6\2\2\u00e2\u00ed\5&\24\b\u00e3\u00e4\f\6\2\2\u00e4\u00e5\t\7\2\2\u00e5"+
		"\u00ed\5&\24\7\u00e6\u00e7\f\5\2\2\u00e7\u00e8\7\27\2\2\u00e8\u00ed\5"+
		"&\24\6\u00e9\u00ea\f\4\2\2\u00ea\u00eb\7\30\2\2\u00eb\u00ed\5&\24\5\u00ec"+
		"\u00d7\3\2\2\2\u00ec\u00da\3\2\2\2\u00ec\u00dd\3\2\2\2\u00ec\u00e0\3\2"+
		"\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\'\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\3\2\2\u00f2\u00f3\5\20\t\2\u00f3\u00f4"+
		"\7\4\2\2\u00f4\u00f5\5&\24\2\u00f5)\3\2\2\2\31,.\64\66AHOXejny\u0081\u0098"+
		"\u009b\u00a9\u00ac\u00bd\u00ca\u00d0\u00d5\u00ec\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}