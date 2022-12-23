// Generated from /home/samuel/School/VYPa/vyp-compiler-new/vypa.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vypaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LEFT_PARANTHESES_SMOOTH", "RIGHT_PARANTHESES_SMOOTH", "LEFT_PARANTHESES_SHARP", 
			"RIGHT_PARANTHESES_SHARP", "COMMA", "COLON", "SEMICOLON", "DOT", "ASSIGN", 
			"NOT", "MULT", "DIV", "ADD", "MINUS", "LESS", "LOE", "GREATER", "GOE", 
			"EQ", "NEQ", "AND", "OR", "CLASS", "ELSE", "IF", "INT_TYPE", "NEW", "RETURN", 
			"STRING_TYPE", "SUPER", "THIS", "VOID", "WHILE", "ID", "INT_VAL", "STRING_VAL", 
			"BLOCK_COMMENT", "LINE_COMMENT", "WHITE_SPACE", "POSITIVE_DIGIT", "PRINTABLE_CHARACTER", 
			"ESCAPE_SEQUENCE", "ANY_LETTER", "ANY_NUMBER", "END_OF_LINE", "TAB", 
			"BACK_SLASH", "FRONT_SLASH", "DOUBLE_QUOTES", "BLOCK_COMMENT_STARTS", 
			"BLOCK_COMMENT_ENDS", "STRING_ENCLOSING", "SPACE", "UNDERSCORE"
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


	public vypaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "vypa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0140\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\5#\u00de\n#\3#\3#\3#\7#\u00e3"+
		"\n#\f#\16#\u00e6\13#\3$\3$\3$\3$\3$\5$\u00ed\n$\3%\3%\3%\7%\u00f2\n%\f"+
		"%\16%\u00f5\13%\3%\3%\3&\3&\7&\u00fb\n&\f&\16&\u00fe\13&\3&\3&\3&\3&\3"+
		"\'\3\'\7\'\u0106\n\'\f\'\16\'\u0109\13\'\3\'\3\'\3(\3(\3(\6(\u0110\n("+
		"\r(\16(\u0111\3(\3(\3)\3)\7)\u0118\n)\f)\16)\u011b\13)\3*\3*\3+\3+\3+"+
		"\3+\5+\u0123\n+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\3\u00fc\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2"+
		"i\2k\2m\2\3\2\7\4\2\f\f\17\17\3\2\63;\3\2\62;\3\2$$\4\2C\\c|\2\u0141\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s"+
		"\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23"+
		"\177\3\2\2\2\25\u0081\3\2\2\2\27\u0083\3\2\2\2\31\u0085\3\2\2\2\33\u0087"+
		"\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d\3\2\2\2#\u0090\3\2\2"+
		"\2%\u0092\3\2\2\2\'\u0095\3\2\2\2)\u0098\3\2\2\2+\u009b\3\2\2\2-\u009e"+
		"\3\2\2\2/\u00a1\3\2\2\2\61\u00a7\3\2\2\2\63\u00ac\3\2\2\2\65\u00af\3\2"+
		"\2\2\67\u00b3\3\2\2\29\u00b7\3\2\2\2;\u00be\3\2\2\2=\u00c5\3\2\2\2?\u00cb"+
		"\3\2\2\2A\u00d0\3\2\2\2C\u00d5\3\2\2\2E\u00dd\3\2\2\2G\u00ec\3\2\2\2I"+
		"\u00ee\3\2\2\2K\u00f8\3\2\2\2M\u0103\3\2\2\2O\u010f\3\2\2\2Q\u0115\3\2"+
		"\2\2S\u011c\3\2\2\2U\u0122\3\2\2\2W\u0124\3\2\2\2Y\u0126\3\2\2\2[\u0128"+
		"\3\2\2\2]\u012a\3\2\2\2_\u012c\3\2\2\2a\u012e\3\2\2\2c\u0131\3\2\2\2e"+
		"\u0134\3\2\2\2g\u0137\3\2\2\2i\u013a\3\2\2\2k\u013c\3\2\2\2m\u013e\3\2"+
		"\2\2op\7*\2\2p\4\3\2\2\2qr\7+\2\2r\6\3\2\2\2st\7}\2\2t\b\3\2\2\2uv\7\177"+
		"\2\2v\n\3\2\2\2wx\7.\2\2x\f\3\2\2\2yz\7<\2\2z\16\3\2\2\2{|\7=\2\2|\20"+
		"\3\2\2\2}~\7\60\2\2~\22\3\2\2\2\177\u0080\7?\2\2\u0080\24\3\2\2\2\u0081"+
		"\u0082\7#\2\2\u0082\26\3\2\2\2\u0083\u0084\7,\2\2\u0084\30\3\2\2\2\u0085"+
		"\u0086\7\61\2\2\u0086\32\3\2\2\2\u0087\u0088\7-\2\2\u0088\34\3\2\2\2\u0089"+
		"\u008a\7/\2\2\u008a\36\3\2\2\2\u008b\u008c\7>\2\2\u008c \3\2\2\2\u008d"+
		"\u008e\7>\2\2\u008e\u008f\7?\2\2\u008f\"\3\2\2\2\u0090\u0091\7@\2\2\u0091"+
		"$\3\2\2\2\u0092\u0093\7@\2\2\u0093\u0094\7?\2\2\u0094&\3\2\2\2\u0095\u0096"+
		"\7?\2\2\u0096\u0097\7?\2\2\u0097(\3\2\2\2\u0098\u0099\7#\2\2\u0099\u009a"+
		"\7?\2\2\u009a*\3\2\2\2\u009b\u009c\7(\2\2\u009c\u009d\7(\2\2\u009d,\3"+
		"\2\2\2\u009e\u009f\7~\2\2\u009f\u00a0\7~\2\2\u00a0.\3\2\2\2\u00a1\u00a2"+
		"\7e\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7u\2\2\u00a5"+
		"\u00a6\7u\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab\62\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7h\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\66\3\2\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7y\2\2\u00b68\3\2\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\u00ba\7v\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7p\2\2"+
		"\u00bd:\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7t\2"+
		"\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7i\2\2\u00c4<\3\2"+
		"\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9\u00ca\7t\2\2\u00ca>\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd"+
		"\7j\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7u\2\2\u00cf@\3\2\2\2\u00d0\u00d1"+
		"\7x\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7f\2\2\u00d4"+
		"B\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8\7k\2\2\u00d8"+
		"\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00daD\3\2\2\2\u00db\u00de\5W,\2\u00dc"+
		"\u00de\5m\67\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e4\3\2"+
		"\2\2\u00df\u00e3\5W,\2\u00e0\u00e3\5m\67\2\u00e1\u00e3\5Y-\2\u00e2\u00df"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5F\3\2\2\2\u00e6\u00e4\3\2\2\2"+
		"\u00e7\u00ed\7\62\2\2\u00e8\u00e9\5\35\17\2\u00e9\u00ea\5Q)\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00ed\5Q)\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00edH\3\2\2\2\u00ee\u00f3\5i\65\2\u00ef\u00f2\5S*\2\u00f0"+
		"\u00f2\5U+\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2"+
		"\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00f7\5i\65\2\u00f7J\3\2\2\2\u00f8\u00fc\5e\63\2\u00f9"+
		"\u00fb\13\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fd\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\5g\64\2\u0100\u0101\3\2\2\2\u0101\u0102\b&\2\2\u0102L\3\2\2\2\u0103"+
		"\u0107\5a\61\2\u0104\u0106\n\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010b\b\'\2\2\u010bN\3\2\2\2\u010c\u0110\5k\66\2"+
		"\u010d\u0110\5[.\2\u010e\u0110\5]/\2\u010f\u010c\3\2\2\2\u010f\u010d\3"+
		"\2\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b(\2\2\u0114P\3\2\2\2\u0115"+
		"\u0119\t\3\2\2\u0116\u0118\t\4\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011aR\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011d\n\5\2\2\u011dT\3\2\2\2\u011e\u0123\5[.\2\u011f\u0123"+
		"\5]/\2\u0120\u0123\5_\60\2\u0121\u0123\5c\62\2\u0122\u011e\3\2\2\2\u0122"+
		"\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123V\3\2\2\2"+
		"\u0124\u0125\t\6\2\2\u0125X\3\2\2\2\u0126\u0127\t\4\2\2\u0127Z\3\2\2\2"+
		"\u0128\u0129\7\f\2\2\u0129\\\3\2\2\2\u012a\u012b\7\13\2\2\u012b^\3\2\2"+
		"\2\u012c\u012d\7^\2\2\u012d`\3\2\2\2\u012e\u012f\7\61\2\2\u012f\u0130"+
		"\7\61\2\2\u0130b\3\2\2\2\u0131\u0132\7^\2\2\u0132\u0133\7$\2\2\u0133d"+
		"\3\2\2\2\u0134\u0135\7\61\2\2\u0135\u0136\7,\2\2\u0136f\3\2\2\2\u0137"+
		"\u0138\7,\2\2\u0138\u0139\7\61\2\2\u0139h\3\2\2\2\u013a\u013b\7$\2\2\u013b"+
		"j\3\2\2\2\u013c\u013d\7\"\2\2\u013dl\3\2\2\2\u013e\u013f\7a\2\2\u013f"+
		"n\3\2\2\2\17\2\u00dd\u00e2\u00e4\u00ec\u00f1\u00f3\u00fc\u0107\u010f\u0111"+
		"\u0119\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}