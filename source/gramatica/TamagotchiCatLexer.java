package source.gramatica;

// Generated from /home/gislaine/dsl-lfa-trabalho-final/source/gramatica/TamagotchiCat.g4 by ANTLR 4.7.1

//package source.gramatica;
import java.util.LinkedList;
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
		T__0=1, T__1=2, TipoInteger=3, TipoString=4, TipoFloat=5, TipoBoolean=6, 
		INT=7, FLOAT=8, BOOLEAN=9, ATRIBUICAO=10, IGUAL=11, MENORIGUAL=12, MAIORIGUAL=13, 
		DIFERENTE=14, MAIOR=15, MENOR=16, TERMINAL=17, LPAR=18, RPAR=19, LCOL=20, 
		RCOL=21, SOMA=22, SUB=23, DIV=24, MULT=25, ASP=26, IF=27, ELSE=28, WHILE=29, 
		PRINT=30, VARIAVEL=31, STRING=32, DEF_FUNCAO=33, CHAMADA_FUNCAO=34, NOME_FUNCAO=35, 
		VIRGULA=36, WS=37, SINGLE_STRING=38, DOUBLE_STRING=39, IDENTIFIER=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "TipoInteger", "TipoString", "TipoFloat", "TipoBoolean", 
		"NUMERO", "LETRAS", "CARACTERES", "INT", "FLOAT", "BOOLEAN", "ATRIBUICAO", 
		"IGUAL", "MENORIGUAL", "MAIORIGUAL", "DIFERENTE", "MAIOR", "MENOR", "TERMINAL", 
		"LPAR", "RPAR", "LCOL", "RCOL", "SOMA", "SUB", "DIV", "MULT", "ASP", "IF", 
		"ELSE", "WHILE", "PRINT", "VARIAVEL", "STRING", "DEF_FUNCAO", "CHAMADA_FUNCAO", 
		"NOME_FUNCAO", "VIRGULA", "WS", "SINGLE_STRING", "DOUBLE_STRING", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "'Integer'", "'String'", "'Float'", "'Boolean'", 
		null, null, null, "'larica'", "'=='", "'<='", "'>='", "'!='", "'>'", "'<'", 
		"';'", "'('", "')'", "'['", "']'", "'+'", "'-'", "'/'", "'*'", "'\"'", 
		"'dropa'", "'vaca'", "'caldo'", "'aloha'", null, null, "'def '", "'call '", 
		null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "TipoInteger", "TipoString", "TipoFloat", "TipoBoolean", 
		"INT", "FLOAT", "BOOLEAN", "ATRIBUICAO", "IGUAL", "MENORIGUAL", "MAIORIGUAL", 
		"DIFERENTE", "MAIOR", "MENOR", "TERMINAL", "LPAR", "RPAR", "LCOL", "RCOL", 
		"SOMA", "SUB", "DIV", "MULT", "ASP", "IF", "ELSE", "WHILE", "PRINT", "VARIAVEL", 
		"STRING", "DEF_FUNCAO", "CHAMADA_FUNCAO", "NOME_FUNCAO", "VIRGULA", "WS", 
		"SINGLE_STRING", "DOUBLE_STRING", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0129\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13\u0089\n\13"+
		"\r\13\16\13\u008a\3\f\6\f\u008e\n\f\r\f\16\f\u008f\3\f\3\f\6\f\u0094\n"+
		"\f\r\f\16\f\u0095\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a1\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\6#\u00e6\n#\r#\16#\u00e7\3#\6#\u00eb\n#\r#\16"+
		"#\u00ec\5#\u00ef\n#\3$\3$\6$\u00f3\n$\r$\16$\u00f4\3$\3$\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3\'\3\'\6\'\u0106\n\'\r\'\16\'\u0107\3\'\3\'\3(\3"+
		"(\3)\6)\u010f\n)\r)\16)\u0110\3)\3)\3*\3*\6*\u0117\n*\r*\16*\u0118\3*"+
		"\3*\3+\3+\6+\u011f\n+\r+\16+\u0120\3+\3+\3,\6,\u0126\n,\r,\16,\u0127\2"+
		"\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\t\27\n\31\13\33\f\35\r"+
		"\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34"+
		"=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*\3\2\t\3\2\62;\4\2C\\c|\6\2\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\3\2))\3\2$$\5\2\62;C\\c|\2\u0132\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5^\3\2\2\2\7d\3\2\2\2"+
		"\tl\3\2\2\2\13s\3\2\2\2\ry\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2\2\2\23"+
		"\u0085\3\2\2\2\25\u0088\3\2\2\2\27\u008d\3\2\2\2\31\u00a0\3\2\2\2\33\u00a2"+
		"\3\2\2\2\35\u00a9\3\2\2\2\37\u00ac\3\2\2\2!\u00af\3\2\2\2#\u00b2\3\2\2"+
		"\2%\u00b5\3\2\2\2\'\u00b7\3\2\2\2)\u00b9\3\2\2\2+\u00bb\3\2\2\2-\u00bd"+
		"\3\2\2\2/\u00bf\3\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2\2\65\u00c5\3\2"+
		"\2\2\67\u00c7\3\2\2\29\u00c9\3\2\2\2;\u00cb\3\2\2\2=\u00cd\3\2\2\2?\u00d3"+
		"\3\2\2\2A\u00d8\3\2\2\2C\u00de\3\2\2\2E\u00e5\3\2\2\2G\u00f0\3\2\2\2I"+
		"\u00f8\3\2\2\2K\u00fd\3\2\2\2M\u0103\3\2\2\2O\u010b\3\2\2\2Q\u010e\3\2"+
		"\2\2S\u0114\3\2\2\2U\u011c\3\2\2\2W\u0125\3\2\2\2YZ\7v\2\2Z[\7t\2\2[\\"+
		"\7w\2\2\\]\7g\2\2]\4\3\2\2\2^_\7h\2\2_`\7c\2\2`a\7n\2\2ab\7u\2\2bc\7g"+
		"\2\2c\6\3\2\2\2de\7K\2\2ef\7p\2\2fg\7v\2\2gh\7g\2\2hi\7i\2\2ij\7g\2\2"+
		"jk\7t\2\2k\b\3\2\2\2lm\7U\2\2mn\7v\2\2no\7t\2\2op\7k\2\2pq\7p\2\2qr\7"+
		"i\2\2r\n\3\2\2\2st\7H\2\2tu\7n\2\2uv\7q\2\2vw\7c\2\2wx\7v\2\2x\f\3\2\2"+
		"\2yz\7D\2\2z{\7q\2\2{|\7q\2\2|}\7n\2\2}~\7g\2\2~\177\7c\2\2\177\u0080"+
		"\7p\2\2\u0080\16\3\2\2\2\u0081\u0082\t\2\2\2\u0082\20\3\2\2\2\u0083\u0084"+
		"\t\3\2\2\u0084\22\3\2\2\2\u0085\u0086\t\4\2\2\u0086\24\3\2\2\2\u0087\u0089"+
		"\5\17\b\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\26\3\2\2\2\u008c\u008e\5\17\b\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\13\2\2\2\u0092\u0094\5\17\b\2\u0093\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\30\3\2\2\2\u0097\u0098\7V\2\2\u0098\u0099\7t\2\2\u0099\u009a\7w\2\2\u009a"+
		"\u00a1\7g\2\2\u009b\u009c\7H\2\2\u009c\u009d\7c\2\2\u009d\u009e\7n\2\2"+
		"\u009e\u009f\7u\2\2\u009f\u00a1\7g\2\2\u00a0\u0097\3\2\2\2\u00a0\u009b"+
		"\3\2\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7c\2\2"+
		"\u00a8\34\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7?\2\2\u00ab\36\3\2\2"+
		"\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7?\2\2\u00ae \3\2\2\2\u00af\u00b0\7"+
		"@\2\2\u00b0\u00b1\7?\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7"+
		">\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7=\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7*"+
		"\2\2\u00bc,\3\2\2\2\u00bd\u00be\7+\2\2\u00be.\3\2\2\2\u00bf\u00c0\7]\2"+
		"\2\u00c0\60\3\2\2\2\u00c1\u00c2\7_\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7"+
		"-\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7/\2\2\u00c6\66\3\2\2\2\u00c7\u00c8"+
		"\7\61\2\2\u00c88\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca:\3\2\2\2\u00cb\u00cc"+
		"\7$\2\2\u00cc<\3\2\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0"+
		"\7q\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7c\2\2\u00d2>\3\2\2\2\u00d3\u00d4"+
		"\7x\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7c\2\2\u00d7"+
		"@\3\2\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7f\2\2\u00dc\u00dd\7q\2\2\u00ddB\3\2\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7c\2\2"+
		"\u00e3D\3\2\2\2\u00e4\u00e6\5\21\t\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ee\3\2\2\2\u00e9"+
		"\u00eb\5\17\b\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3"+
		"\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00efF\3\2\2\2\u00f0\u00f2\5;\36\2\u00f1\u00f3\5\23\n\2"+
		"\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5;\36\2\u00f7H\3\2\2\2\u00f8"+
		"\u00f9\7f\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7\"\2"+
		"\2\u00fcJ\3\2\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7"+
		"n\2\2\u0100\u0101\7n\2\2\u0101\u0102\7\"\2\2\u0102L\3\2\2\2\u0103\u0105"+
		"\7>\2\2\u0104\u0106\5\23\n\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7@"+
		"\2\2\u010aN\3\2\2\2\u010b\u010c\7.\2\2\u010cP\3\2\2\2\u010d\u010f\t\5"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b)\2\2\u0113R\3\2\2\2\u0114"+
		"\u0116\7)\2\2\u0115\u0117\n\6\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\7)\2\2\u011bT\3\2\2\2\u011c\u011e\7$\2\2\u011d\u011f\n\7\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7$\2\2\u0123V\3\2\2\2\u0124\u0126"+
		"\t\b\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128X\3\2\2\2\20\2\u008a\u008f\u0095\u00a0\u00e7\u00ec"+
		"\u00ee\u00f4\u0107\u0110\u0118\u0120\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}