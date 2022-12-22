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
		RULE_function_body = 4, RULE_function_body_not_in_func = 5, RULE_param_list = 6, 
		RULE_type = 7, RULE_data_type = 8, RULE_prim_type = 9, RULE_statement = 10, 
		RULE_stmt_local_vars = 11, RULE_stmt_assignment = 12, RULE_stmt_while = 13, 
		RULE_while_header = 14, RULE_stmt_func_call = 15, RULE_stmt_method_call = 16, 
		RULE_stmt_if = 17, RULE_if_header = 18, RULE_stmt_return = 19, RULE_expression = 20, 
		RULE_casting = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_definition", "definitions", "function_definition", 
			"function_body", "function_body_not_in_func", "param_list", "type", "data_type", 
			"prim_type", "statement", "stmt_local_vars", "stmt_assignment", "stmt_while", 
			"while_header", "stmt_func_call", "stmt_method_call", "stmt_if", "if_header", 
			"stmt_return", "expression", "casting"
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
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
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
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(51);
			function_definition();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case STRING_TYPE:
				case VOID:
				case ID:
					{
					setState(52);
					function_definition();
					}
					break;
				case CLASS:
					{
					setState(53);
					class_definition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
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
			setState(59);
			match(CLASS);
			setState(60);
			match(ID);
			setState(61);
			match(COLON);
			setState(62);
			match(ID);
			setState(63);
			match(LEFT_PARANTHESES_SHARP);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				{
				setState(64);
				definitions();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				stmt_local_vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
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
			setState(76);
			type();
			setState(77);
			match(ID);
			setState(78);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
			case ID:
				{
				setState(79);
				param_list();
				}
				break;
			case VOID:
				{
				setState(80);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(84);
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
			setState(86);
			match(LEFT_PARANTHESES_SHARP);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INT_TYPE) | (1L << RETURN) | (1L << STRING_TYPE) | (1L << SUPER) | (1L << THIS) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(87);
				statement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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

	public static class Function_body_not_in_funcContext extends ParserRuleContext {
		public TerminalNode LEFT_PARANTHESES_SHARP() { return getToken(vypaParser.LEFT_PARANTHESES_SHARP, 0); }
		public TerminalNode RIGHT_PARANTHESES_SHARP() { return getToken(vypaParser.RIGHT_PARANTHESES_SHARP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_body_not_in_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body_not_in_func; }
	}

	public final Function_body_not_in_funcContext function_body_not_in_func() throws RecognitionException {
		Function_body_not_in_funcContext _localctx = new Function_body_not_in_funcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_body_not_in_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LEFT_PARANTHESES_SHARP);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INT_TYPE) | (1L << RETURN) | (1L << STRING_TYPE) | (1L << SUPER) | (1L << THIS) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(96);
				statement();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
		enterRule(_localctx, 12, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			data_type();
			setState(105);
			match(ID);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				data_type();
				setState(108);
				match(ID);
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				data_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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
		enterRule(_localctx, 16, RULE_data_type);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				prim_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
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
		enterRule(_localctx, 18, RULE_prim_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				stmt_local_vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				stmt_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				stmt_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				stmt_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				stmt_func_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				stmt_method_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
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
		enterRule(_localctx, 22, RULE_stmt_local_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			data_type();
			setState(135);
			match(ID);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				match(ID);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
		enterRule(_localctx, 24, RULE_stmt_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
			match(ASSIGN);
			setState(147);
			expression(0);
			setState(148);
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
		public While_headerContext while_header() {
			return getRuleContext(While_headerContext.class,0);
		}
		public Function_body_not_in_funcContext function_body_not_in_func() {
			return getRuleContext(Function_body_not_in_funcContext.class,0);
		}
		public Stmt_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_while; }
	}

	public final Stmt_whileContext stmt_while() throws RecognitionException {
		Stmt_whileContext _localctx = new Stmt_whileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			while_header();
			setState(151);
			function_body_not_in_func();
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

	public static class While_headerContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(vypaParser.WHILE, 0); }
		public TerminalNode LEFT_PARANTHESES_SMOOTH() { return getToken(vypaParser.LEFT_PARANTHESES_SMOOTH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES_SMOOTH() { return getToken(vypaParser.RIGHT_PARANTHESES_SMOOTH, 0); }
		public While_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_header; }
	}

	public final While_headerContext while_header() throws RecognitionException {
		While_headerContext _localctx = new While_headerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(WHILE);
			setState(154);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(155);
			expression(0);
			setState(156);
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
		enterRule(_localctx, 30, RULE_stmt_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PARANTHESES_SMOOTH) | (1L << NOT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << ID) | (1L << INT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(160);
				expression(0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(161);
					match(COMMA);
					setState(162);
					expression(0);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(170);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(171);
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
		enterRule(_localctx, 32, RULE_stmt_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			match(DOT);
			setState(175);
			match(ID);
			setState(176);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PARANTHESES_SMOOTH) | (1L << NOT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << ID) | (1L << INT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(177);
				expression(0);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(178);
					match(COMMA);
					setState(179);
					expression(0);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(187);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(188);
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
		public List<Function_body_not_in_funcContext> function_body_not_in_func() {
			return getRuleContexts(Function_body_not_in_funcContext.class);
		}
		public Function_body_not_in_funcContext function_body_not_in_func(int i) {
			return getRuleContext(Function_body_not_in_funcContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(vypaParser.ELSE, 0); }
		public Stmt_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_if; }
	}

	public final Stmt_ifContext stmt_if() throws RecognitionException {
		Stmt_ifContext _localctx = new Stmt_ifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			if_header();
			setState(191);
			function_body_not_in_func();
			setState(192);
			match(ELSE);
			setState(193);
			function_body_not_in_func();
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
		enterRule(_localctx, 36, RULE_if_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(IF);
			setState(196);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(197);
			expression(0);
			setState(198);
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
		enterRule(_localctx, 38, RULE_stmt_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(RETURN);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PARANTHESES_SMOOTH) | (1L << NOT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << ID) | (1L << INT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(201);
				expression(0);
				}
			}

			setState(204);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(207);
				match(LEFT_PARANTHESES_SMOOTH);
				setState(208);
				expression(0);
				setState(209);
				match(RIGHT_PARANTHESES_SMOOTH);
				}
				break;
			case 2:
				{
				setState(211);
				match(NEW);
				setState(212);
				match(ID);
				}
				break;
			case 3:
				{
				setState(215);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_PARANTHESES_SMOOTH:
					{
					setState(213);
					casting();
					}
					break;
				case ID:
					{
					setState(214);
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
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(217);
					stmt_method_call();
					}
					break;
				case 2:
					{
					setState(218);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << THIS) | (1L << ID))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(219);
					match(DOT);
					setState(220);
					match(ID);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(223);
				match(NOT);
				setState(224);
				expression(9);
				}
				break;
			case 6:
				{
				setState(225);
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
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(229);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(232);
						match(ADD);
						setState(233);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(235);
						match(MINUS);
						setState(236);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(238);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LOE) | (1L << GREATER) | (1L << GOE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(241);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(244);
						match(AND);
						setState(245);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(247);
						match(OR);
						setState(248);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 42, RULE_casting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(LEFT_PARANTHESES_SMOOTH);
			setState(255);
			data_type();
			setState(256);
			match(RIGHT_PARANTHESES_SMOOTH);
			setState(257);
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
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0106\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\4\3\4\5\4M\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\5\5T\n\5\3\5\3\5\3\5\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6"+
		"\3\7\3\7\7\7d\n\7\f\7\16\7g\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bq"+
		"\n\b\f\b\16\bt\13\b\3\t\3\t\5\tx\n\t\3\n\3\n\5\n|\n\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\7\r\u008d\n\r\f\r"+
		"\16\r\u0090\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00a6\n\21\f\21\16"+
		"\21\u00a9\13\21\5\21\u00ab\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00b7\n\22\f\22\16\22\u00ba\13\22\5\22\u00bc\n\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\5\25\u00cd\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00da\n\26\3\26\3\26\3\26\3\26\5\26\u00e0\n\26\3\26\3\26\3\26\5"+
		"\26\u00e5\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00fc\n\26\f\26"+
		"\16\26\u00ff\13\26\3\27\3\27\3\27\3\27\3\27\3\27\2\3*\30\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,\2\b\4\2\34\34\37\37\4\2 !$$\3\2$&\3\2"+
		"\r\16\3\2\21\24\3\2\25\26\2\u0115\2\62\3\2\2\2\4=\3\2\2\2\6L\3\2\2\2\b"+
		"N\3\2\2\2\nX\3\2\2\2\fa\3\2\2\2\16j\3\2\2\2\20w\3\2\2\2\22{\3\2\2\2\24"+
		"}\3\2\2\2\26\u0086\3\2\2\2\30\u0088\3\2\2\2\32\u0093\3\2\2\2\34\u0098"+
		"\3\2\2\2\36\u009b\3\2\2\2 \u00a0\3\2\2\2\"\u00af\3\2\2\2$\u00c0\3\2\2"+
		"\2&\u00c5\3\2\2\2(\u00ca\3\2\2\2*\u00e4\3\2\2\2,\u0100\3\2\2\2.\61\5\b"+
		"\5\2/\61\5\4\3\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65:\5\b\5\2\669\5\b\5\2\679\5"+
		"\4\3\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\3\3\2\2"+
		"\2<:\3\2\2\2=>\7\31\2\2>?\7$\2\2?@\7\b\2\2@A\7$\2\2AE\7\5\2\2BD\5\6\4"+
		"\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\6\2"+
		"\2I\5\3\2\2\2JM\5\30\r\2KM\5\b\5\2LJ\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NO\5"+
		"\20\t\2OP\7$\2\2PS\7\3\2\2QT\5\16\b\2RT\7\"\2\2SQ\3\2\2\2SR\3\2\2\2TU"+
		"\3\2\2\2UV\7\4\2\2VW\5\n\6\2W\t\3\2\2\2X\\\7\5\2\2Y[\5\26\f\2ZY\3\2\2"+
		"\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\6\2\2`\13"+
		"\3\2\2\2ae\7\5\2\2bd\5\26\f\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2"+
		"fh\3\2\2\2ge\3\2\2\2hi\7\6\2\2i\r\3\2\2\2jk\5\22\n\2kr\7$\2\2lm\7\7\2"+
		"\2mn\5\22\n\2no\7$\2\2oq\3\2\2\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2s\17\3\2\2\2tr\3\2\2\2ux\5\22\n\2vx\7\"\2\2wu\3\2\2\2wv\3\2\2\2x\21"+
		"\3\2\2\2y|\5\24\13\2z|\7$\2\2{y\3\2\2\2{z\3\2\2\2|\23\3\2\2\2}~\t\2\2"+
		"\2~\25\3\2\2\2\177\u0087\5\30\r\2\u0080\u0087\5\32\16\2\u0081\u0087\5"+
		"$\23\2\u0082\u0087\5\34\17\2\u0083\u0087\5 \21\2\u0084\u0087\5\"\22\2"+
		"\u0085\u0087\5(\25\2\u0086\177\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0081"+
		"\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\27\3\2\2\2\u0088\u0089\5\22\n\2\u0089\u008e\7$\2"+
		"\2\u008a\u008b\7\7\2\2\u008b\u008d\7$\2\2\u008c\u008a\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\7\t\2\2\u0092\31\3\2\2\2\u0093\u0094\7$\2\2"+
		"\u0094\u0095\7\13\2\2\u0095\u0096\5*\26\2\u0096\u0097\7\t\2\2\u0097\33"+
		"\3\2\2\2\u0098\u0099\5\36\20\2\u0099\u009a\5\f\7\2\u009a\35\3\2\2\2\u009b"+
		"\u009c\7#\2\2\u009c\u009d\7\3\2\2\u009d\u009e\5*\26\2\u009e\u009f\7\4"+
		"\2\2\u009f\37\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1\u00aa\7\3\2\2\u00a2\u00a7"+
		"\5*\26\2\u00a3\u00a4\7\7\2\2\u00a4\u00a6\5*\26\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00ae\7\t\2\2\u00ae!\3\2\2\2"+
		"\u00af\u00b0\t\3\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2\7$\2\2\u00b2\u00bb"+
		"\7\3\2\2\u00b3\u00b8\5*\26\2\u00b4\u00b5\7\7\2\2\u00b5\u00b7\5*\26\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\4\2\2\u00be\u00bf\7\t"+
		"\2\2\u00bf#\3\2\2\2\u00c0\u00c1\5&\24\2\u00c1\u00c2\5\f\7\2\u00c2\u00c3"+
		"\7\32\2\2\u00c3\u00c4\5\f\7\2\u00c4%\3\2\2\2\u00c5\u00c6\7\33\2\2\u00c6"+
		"\u00c7\7\3\2\2\u00c7\u00c8\5*\26\2\u00c8\u00c9\7\4\2\2\u00c9\'\3\2\2\2"+
		"\u00ca\u00cc\7\36\2\2\u00cb\u00cd\5*\26\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\t\2\2\u00cf)\3\2\2\2\u00d0"+
		"\u00d1\b\26\1\2\u00d1\u00d2\7\3\2\2\u00d2\u00d3\5*\26\2\u00d3\u00d4\7"+
		"\4\2\2\u00d4\u00e5\3\2\2\2\u00d5\u00d6\7\35\2\2\u00d6\u00e5\7$\2\2\u00d7"+
		"\u00da\5,\27\2\u00d8\u00da\5 \21\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00e5\3\2\2\2\u00db\u00e0\5\"\22\2\u00dc\u00dd\t\3\2\2\u00dd"+
		"\u00de\7\n\2\2\u00de\u00e0\7$\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2"+
		"\2\2\u00e0\u00e5\3\2\2\2\u00e1\u00e2\7\f\2\2\u00e2\u00e5\5*\26\13\u00e3"+
		"\u00e5\t\4\2\2\u00e4\u00d0\3\2\2\2\u00e4\u00d5\3\2\2\2\u00e4\u00d9\3\2"+
		"\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00fd\3\2\2\2\u00e6\u00e7\f\n\2\2\u00e7\u00e8\t\5\2\2\u00e8\u00fc\5*"+
		"\26\13\u00e9\u00ea\f\t\2\2\u00ea\u00eb\7\17\2\2\u00eb\u00fc\5*\26\n\u00ec"+
		"\u00ed\f\b\2\2\u00ed\u00ee\7\20\2\2\u00ee\u00fc\5*\26\t\u00ef\u00f0\f"+
		"\7\2\2\u00f0\u00f1\t\6\2\2\u00f1\u00fc\5*\26\b\u00f2\u00f3\f\6\2\2\u00f3"+
		"\u00f4\t\7\2\2\u00f4\u00fc\5*\26\7\u00f5\u00f6\f\5\2\2\u00f6\u00f7\7\27"+
		"\2\2\u00f7\u00fc\5*\26\6\u00f8\u00f9\f\4\2\2\u00f9\u00fa\7\30\2\2\u00fa"+
		"\u00fc\5*\26\5\u00fb\u00e6\3\2\2\2\u00fb\u00e9\3\2\2\2\u00fb\u00ec\3\2"+
		"\2\2\u00fb\u00ef\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb"+
		"\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe+\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\3\2\2\u0101\u0102"+
		"\5\22\n\2\u0102\u0103\7\4\2\2\u0103\u0104\5*\26\2\u0104-\3\2\2\2\32\60"+
		"\628:ELS\\erw{\u0086\u008e\u00a7\u00aa\u00b8\u00bb\u00cc\u00d9\u00df\u00e4"+
		"\u00fb\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}