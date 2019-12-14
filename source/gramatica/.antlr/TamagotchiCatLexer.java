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
		T__0=1, T__1=2, FUNC=3, IF=4, ELSE=5, WHILE=6, STARTBLOCK=7, ENDBLOCK=8, 
		LPAR=9, RPAR=10, LBKT=11, RBKT=12, TRUE=13, FALSE=14, VIRGULA=15, SEMI=16, 
		OU=17, E=18, IGUAL=19, DIFF=20, MAIORIGUAL=21, MAIOR=22, MENORIGUAL=23, 
		MENOR=24, NOT=25, RECEBE=26, CARACTERE=27, INTEGER=28, CHAR=29, STRING=30, 
		NL=31, WS=32, LINE_COMMENT=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "FUNC", "IF", "ELSE", "WHILE", "STARTBLOCK", "ENDBLOCK", 
		"LPAR", "RPAR", "LBKT", "RBKT", "TRUE", "FALSE", "VIRGULA", "SEMI", "OU", 
		"E", "IGUAL", "DIFF", "MAIORIGUAL", "MAIOR", "MENORIGUAL", "MENOR", "NOT", 
		"RECEBE", "CARACTERE", "DIGIT", "INTEGER", "CHAR", "STRING", "NL", "WS", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'func'", "'need'", "'diverse'", "'survive'", "'#'", 
		"'$'", "'('", "')'", "'['", "']'", "'fato'", "'fake'", "','", "';'", "'||'", 
		"'&&'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'!'", "':='", null, 
		null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "FUNC", "IF", "ELSE", "WHILE", "STARTBLOCK", "ENDBLOCK", 
		"LPAR", "RPAR", "LBKT", "RBKT", "TRUE", "FALSE", "VIRGULA", "SEMI", "OU", 
		"E", "IGUAL", "DIFF", "MAIORIGUAL", "MAIOR", "MENORIGUAL", "MENOR", "NOT", 
		"RECEBE", "CARACTERE", "INTEGER", "CHAR", "STRING", "NL", "WS", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\7\34\u009d\n\34"+
		"\f\34\16\34\u00a0\13\34\3\35\3\35\3\36\6\36\u00a5\n\36\r\36\16\36\u00a6"+
		"\3\37\3\37\3\37\3\37\3 \3 \7 \u00af\n \f \16 \u00b2\13 \3 \3 \3!\3!\3"+
		"\"\6\"\u00b9\n\"\r\"\16\"\u00ba\3\"\3\"\3#\3#\3#\3#\7#\u00c3\n#\f#\16"+
		"#\u00c6\13#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\2;\36=\37? A!C\"E#\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\6\2\f"+
		"\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\13\17\17\"\"\4\2\f\f\17\17\2\u00cc"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2"+
		"\2\7K\3\2\2\2\tP\3\2\2\2\13U\3\2\2\2\r]\3\2\2\2\17e\3\2\2\2\21g\3\2\2"+
		"\2\23i\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35v\3\2"+
		"\2\2\37{\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0082\3\2\2\2\'\u0085\3\2\2\2"+
		")\u0088\3\2\2\2+\u008b\3\2\2\2-\u008e\3\2\2\2/\u0090\3\2\2\2\61\u0093"+
		"\3\2\2\2\63\u0095\3\2\2\2\65\u0097\3\2\2\2\67\u009a\3\2\2\29\u00a1\3\2"+
		"\2\2;\u00a4\3\2\2\2=\u00a8\3\2\2\2?\u00ac\3\2\2\2A\u00b5\3\2\2\2C\u00b8"+
		"\3\2\2\2E\u00be\3\2\2\2GH\7-\2\2H\4\3\2\2\2IJ\7/\2\2J\6\3\2\2\2KL\7h\2"+
		"\2LM\7w\2\2MN\7p\2\2NO\7e\2\2O\b\3\2\2\2PQ\7p\2\2QR\7g\2\2RS\7g\2\2ST"+
		"\7f\2\2T\n\3\2\2\2UV\7f\2\2VW\7k\2\2WX\7x\2\2XY\7g\2\2YZ\7t\2\2Z[\7u\2"+
		"\2[\\\7g\2\2\\\f\3\2\2\2]^\7u\2\2^_\7w\2\2_`\7t\2\2`a\7x\2\2ab\7k\2\2"+
		"bc\7x\2\2cd\7g\2\2d\16\3\2\2\2ef\7%\2\2f\20\3\2\2\2gh\7&\2\2h\22\3\2\2"+
		"\2ij\7*\2\2j\24\3\2\2\2kl\7+\2\2l\26\3\2\2\2mn\7]\2\2n\30\3\2\2\2op\7"+
		"_\2\2p\32\3\2\2\2qr\7h\2\2rs\7c\2\2st\7v\2\2tu\7q\2\2u\34\3\2\2\2vw\7"+
		"h\2\2wx\7c\2\2xy\7m\2\2yz\7g\2\2z\36\3\2\2\2{|\7.\2\2| \3\2\2\2}~\7=\2"+
		"\2~\"\3\2\2\2\177\u0080\7~\2\2\u0080\u0081\7~\2\2\u0081$\3\2\2\2\u0082"+
		"\u0083\7(\2\2\u0083\u0084\7(\2\2\u0084&\3\2\2\2\u0085\u0086\7?\2\2\u0086"+
		"\u0087\7?\2\2\u0087(\3\2\2\2\u0088\u0089\7#\2\2\u0089\u008a\7?\2\2\u008a"+
		"*\3\2\2\2\u008b\u008c\7@\2\2\u008c\u008d\7?\2\2\u008d,\3\2\2\2\u008e\u008f"+
		"\7@\2\2\u008f.\3\2\2\2\u0090\u0091\7>\2\2\u0091\u0092\7?\2\2\u0092\60"+
		"\3\2\2\2\u0093\u0094\7>\2\2\u0094\62\3\2\2\2\u0095\u0096\7#\2\2\u0096"+
		"\64\3\2\2\2\u0097\u0098\7<\2\2\u0098\u0099\7?\2\2\u0099\66\3\2\2\2\u009a"+
		"\u009e\t\2\2\2\u009b\u009d\t\3\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f8\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a2\4\62;\2\u00a2:\3\2\2\2\u00a3\u00a5\59\35\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7<\3\2\2\2\u00a8\u00a9\7)\2\2\u00a9\u00aa\n\4\2\2\u00aa\u00ab"+
		"\7)\2\2\u00ab>\3\2\2\2\u00ac\u00b0\7$\2\2\u00ad\u00af\n\5\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4@\3\2\2\2\u00b5"+
		"\u00b6\7\f\2\2\u00b6B\3\2\2\2\u00b7\u00b9\t\6\2\2\u00b8\u00b7\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\b\"\2\2\u00bdD\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf"+
		"\u00c0\7\61\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\n\7\2\2\u00c2\u00c1\3"+
		"\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b#\2\2\u00c8F\3\2\2\2\b"+
		"\2\u009e\u00a6\u00b0\u00ba\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}