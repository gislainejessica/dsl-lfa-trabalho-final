// Generated from /home/gislaine/dsl-lfa-trabalho-final/source/gramatica/TamagotchiCat.g4 by ANTLR 4.7.1

package source.gramatica;
import source.ast.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TamagotchiCatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FUN=8, IF=9, THEN=10, 
		ELSE=11, WHILE=12, STARTBLOCK=13, ENDBLOCK=14, LPAR=15, RPAR=16, LBKT=17, 
		RBKT=18, LBRC=19, RBRC=20, TRUE=21, FALSE=22, COMMA=23, SEMI=24, OR=25, 
		AND=26, EQU=27, NEQ=28, GEQ=29, GT=30, LEQ=31, LT=32, GETS=33, CHARACTERES=34, 
		FLOAT=35, INTEGER=36, CHAR=37, STRING=38, NL=39, WS=40, LINE_COMMENT=41, 
		SINGLE_STRING=42, DOUBLE_STRING=43, CHARACTERESIFIER=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "FUN", "IF", "THEN", 
		"ELSE", "WHILE", "STARTBLOCK", "ENDBLOCK", "LPAR", "RPAR", "LBKT", "RBKT", 
		"LBRC", "RBRC", "TRUE", "FALSE", "COMMA", "SEMI", "OR", "AND", "EQU", 
		"NEQ", "GEQ", "GT", "LEQ", "LT", "GETS", "CHARACTERES", "DIGIT", "FLOAT", 
		"INTEGER", "ESCAPE", "UCHAR", "CHAR", "STRING", "NL", "WS", "LINE_COMMENT", 
		"SINGLE_STRING", "DOUBLE_STRING", "CHARACTERESIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'//'", "'%'", "'!'", "'fun'", "'if'", 
		"'then'", "'else'", "'while'", "':'", "'$'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'true'", "'false'", "','", "';'", "'||'", "'&&'", "'=='", 
		"'!='", "'>='", "'>'", "'<='", "'<'", "'='", null, null, null, null, null, 
		"'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "FUN", "IF", "THEN", "ELSE", 
		"WHILE", "STARTBLOCK", "ENDBLOCK", "LPAR", "RPAR", "LBKT", "RBKT", "LBRC", 
		"RBRC", "TRUE", "FALSE", "COMMA", "SEMI", "OR", "AND", "EQU", "NEQ", "GEQ", 
		"GT", "LEQ", "LT", "GETS", "CHARACTERES", "FLOAT", "INTEGER", "CHAR", 
		"STRING", "NL", "WS", "LINE_COMMENT", "SINGLE_STRING", "DOUBLE_STRING", 
		"CHARACTERESIFIER"
	};
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


	public TamagotchiCatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TamagotchiCat.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\7#\u00c1\n#\f#\16#\u00c4\13#\3"+
		"$\3$\3%\6%\u00c9\n%\r%\16%\u00ca\3%\3%\6%\u00cf\n%\r%\16%\u00d0\3&\6&"+
		"\u00d4\n&\r&\16&\u00d5\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\5)\u00e7\n)\3)\3)\3*\3*\3*\3*\7*\u00ef\n*\f*\16*\u00f2\13*\3*\3*\3+"+
		"\3+\3,\6,\u00f9\n,\r,\16,\u00fa\3,\3,\3-\3-\3-\3-\7-\u0103\n-\f-\16-\u0106"+
		"\13-\3-\3-\3.\3.\6.\u010c\n.\r.\16.\u010d\3.\3.\3/\3/\6/\u0114\n/\r/\16"+
		"/\u0115\3/\3/\3\60\6\60\u011b\n\60\r\60\16\60\u011c\2\2\61\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"\2I%K&M\2O\2Q\'S(U)W*Y+[,]-_.\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\n\2$$))"+
		"^^ddhhppttvv\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\13\17\17\"\"\4"+
		"\2\f\f\17\17\3\2))\3\2$$\5\2\62;C\\c|\2\u0128\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2"+
		"\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_"+
		"\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rl\3"+
		"\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23t\3\2\2\2\25w\3\2\2\2\27|\3\2\2\2\31"+
		"\u0081\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d"+
		"\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2"+
		"+\u0097\3\2\2\2-\u009c\3\2\2\2/\u00a2\3\2\2\2\61\u00a4\3\2\2\2\63\u00a6"+
		"\3\2\2\2\65\u00a9\3\2\2\2\67\u00ac\3\2\2\29\u00af\3\2\2\2;\u00b2\3\2\2"+
		"\2=\u00b5\3\2\2\2?\u00b7\3\2\2\2A\u00ba\3\2\2\2C\u00bc\3\2\2\2E\u00be"+
		"\3\2\2\2G\u00c5\3\2\2\2I\u00c8\3\2\2\2K\u00d3\3\2\2\2M\u00d7\3\2\2\2O"+
		"\u00da\3\2\2\2Q\u00e2\3\2\2\2S\u00ea\3\2\2\2U\u00f5\3\2\2\2W\u00f8\3\2"+
		"\2\2Y\u00fe\3\2\2\2[\u0109\3\2\2\2]\u0111\3\2\2\2_\u011a\3\2\2\2ab\7-"+
		"\2\2b\4\3\2\2\2cd\7/\2\2d\6\3\2\2\2ef\7,\2\2f\b\3\2\2\2gh\7\61\2\2h\n"+
		"\3\2\2\2ij\7\61\2\2jk\7\61\2\2k\f\3\2\2\2lm\7\'\2\2m\16\3\2\2\2no\7#\2"+
		"\2o\20\3\2\2\2pq\7h\2\2qr\7w\2\2rs\7p\2\2s\22\3\2\2\2tu\7k\2\2uv\7h\2"+
		"\2v\24\3\2\2\2wx\7v\2\2xy\7j\2\2yz\7g\2\2z{\7p\2\2{\26\3\2\2\2|}\7g\2"+
		"\2}~\7n\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080\30\3\2\2\2\u0081\u0082"+
		"\7y\2\2\u0082\u0083\7j\2\2\u0083\u0084\7k\2\2\u0084\u0085\7n\2\2\u0085"+
		"\u0086\7g\2\2\u0086\32\3\2\2\2\u0087\u0088\7<\2\2\u0088\34\3\2\2\2\u0089"+
		"\u008a\7&\2\2\u008a\36\3\2\2\2\u008b\u008c\7*\2\2\u008c \3\2\2\2\u008d"+
		"\u008e\7+\2\2\u008e\"\3\2\2\2\u008f\u0090\7]\2\2\u0090$\3\2\2\2\u0091"+
		"\u0092\7_\2\2\u0092&\3\2\2\2\u0093\u0094\7}\2\2\u0094(\3\2\2\2\u0095\u0096"+
		"\7\177\2\2\u0096*\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u009b\7g\2\2\u009b,\3\2\2\2\u009c\u009d\7h\2\2\u009d"+
		"\u009e\7c\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2"+
		"\u00a1.\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7=\2\2"+
		"\u00a5\62\3\2\2\2\u00a6\u00a7\7~\2\2\u00a7\u00a8\7~\2\2\u00a8\64\3\2\2"+
		"\2\u00a9\u00aa\7(\2\2\u00aa\u00ab\7(\2\2\u00ab\66\3\2\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad\u00ae\7?\2\2\u00ae8\3\2\2\2\u00af\u00b0\7#\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1:\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4\7?\2\2\u00b4<\3"+
		"\2\2\2\u00b5\u00b6\7@\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8\u00b9"+
		"\7?\2\2\u00b9@\3\2\2\2\u00ba\u00bb\7>\2\2\u00bbB\3\2\2\2\u00bc\u00bd\7"+
		"?\2\2\u00bdD\3\2\2\2\u00be\u00c2\t\2\2\2\u00bf\u00c1\t\3\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"F\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\4\62;\2\u00c6H\3\2\2\2\u00c7"+
		"\u00c9\5G$\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\7\60\2\2\u00cd"+
		"\u00cf\5G$\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2"+
		"\2\u00d0\u00d1\3\2\2\2\u00d1J\3\2\2\2\u00d2\u00d4\5G$\2\u00d3\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"L\3\2\2\2\u00d7\u00d8\7^\2\2\u00d8\u00d9\t\4\2\2\u00d9N\3\2\2\2\u00da"+
		"\u00db\7^\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\5G$\2"+
		"\u00de\u00df\5G$\2\u00df\u00e0\5G$\2\u00e0\u00e1\5G$\2\u00e1P\3\2\2\2"+
		"\u00e2\u00e6\7)\2\2\u00e3\u00e7\n\5\2\2\u00e4\u00e7\5M\'\2\u00e5\u00e7"+
		"\5O(\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7)\2\2\u00e9R\3\2\2\2\u00ea\u00f0\7$\2\2\u00eb"+
		"\u00ef\n\6\2\2\u00ec\u00ef\5M\'\2\u00ed\u00ef\5O(\2\u00ee\u00eb\3\2\2"+
		"\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\7$\2\2\u00f4T\3\2\2\2\u00f5\u00f6\7\f\2\2\u00f6V\3\2\2\2\u00f7"+
		"\u00f9\t\7\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b,\2\2\u00fd"+
		"X\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7\61\2\2\u0100\u0104\3\2\2"+
		"\2\u0101\u0103\n\b\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0108\b-\2\2\u0108Z\3\2\2\2\u0109\u010b\7)\2\2\u010a\u010c\n\t\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7)\2\2\u0110\\\3\2\2\2\u0111\u0113"+
		"\7$\2\2\u0112\u0114\n\n\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7$"+
		"\2\2\u0118^\3\2\2\2\u0119\u011b\t\13\2\2\u011a\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d`\3\2\2\2\17\2\u00c2"+
		"\u00ca\u00d0\u00d5\u00e6\u00ee\u00f0\u00fa\u0104\u010d\u0115\u011c\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}