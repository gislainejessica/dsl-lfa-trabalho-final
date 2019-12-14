// Generated from /home/gislaine/dsl-lfa-trabalho-final/source/gramatica/TamagotchiCat.g4 by ANTLR 4.7.1

package source.gramatica;
import source.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TamagotchiCatParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_exprSeq = 1, RULE_expr = 2, RULE_fundecl = 3, 
		RULE_argumentos = 4, RULE_selecao = 5, RULE_repeticao = 6, RULE_bloco = 7, 
		RULE_condicionais = 8, RULE_addExpr = 9, RULE_multExpr = 10, RULE_simpleExpr = 11, 
		RULE_atomExpr = 12, RULE_listExpresao = 13, RULE_numero = 14, RULE_bool = 15;
	public static final String[] ruleNames = {
		"programa", "exprSeq", "expr", "fundecl", "argumentos", "selecao", "repeticao", 
		"bloco", "condicionais", "addExpr", "multExpr", "simpleExpr", "atomExpr", 
		"listExpresao", "numero", "bool"
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

	@Override
	public String getGrammarFileName() { return "TamagotchiCat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TamagotchiCatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public Expr result;
		public ExprSeqContext catlive;
		public ExprSeqContext exprSeq() {
			return getRuleContext(ExprSeqContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((ProgramaContext)_localctx).catlive = exprSeq();
			((ProgramaContext)_localctx).result =  Block.from(((ProgramaContext)_localctx).catlive.exprs);
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

	public static class ExprSeqContext extends ParserRuleContext {
		public List<Expr> exprs;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TamagotchiCatParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TamagotchiCatParser.SEMI, i);
		}
		public List<TerminalNode> NL() { return getTokens(TamagotchiCatParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TamagotchiCatParser.NL, i);
		}
		public ExprSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSeq; }
	}

	public final ExprSeqContext exprSeq() throws RecognitionException {
		ExprSeqContext _localctx = new ExprSeqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprSeq);
		((ExprSeqContext)_localctx).exprs =  new LinkedList<Expr>();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(40);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FUNC:
					case IF:
					case ELSE:
					case WHILE:
					case STARTBLOCK:
					case ENDBLOCK:
					case LPAR:
					case LBKT:
					case TRUE:
					case FALSE:
					case E:
					case IGUAL:
					case DIFF:
					case MAIORIGUAL:
					case MAIOR:
					case MENORIGUAL:
					case MENOR:
					case NOT:
					case CARACTERE:
					case INTEGER:
					case STRING:
						{
						setState(35);
						((ExprSeqContext)_localctx).expr = expr();
						setState(36);
						_la = _input.LA(1);
						if ( !(_la==SEMI || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						_localctx.exprs.add(((ExprSeqContext)_localctx).expr.result);
						}
						break;
					case SEMI:
					case NL:
						{
						setState(39);
						_la = _input.LA(1);
						if ( !(_la==SEMI || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public Expr result;
		public Token CARACTERE;
		public ExprContext e1;
		public SelecaoContext selecao;
		public RepeticaoContext repeticao;
		public BlocoContext bloco;
		public CondicionaisContext condicionais;
		public FundeclContext fundecl;
		public TerminalNode CARACTERE() { return getToken(TamagotchiCatParser.CARACTERE, 0); }
		public TerminalNode RECEBE() { return getToken(TamagotchiCatParser.RECEBE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CondicionaisContext condicionais() {
			return getRuleContext(CondicionaisContext.class,0);
		}
		public FundeclContext fundecl() {
			return getRuleContext(FundeclContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				((ExprContext)_localctx).CARACTERE = match(CARACTERE);
				setState(46);
				match(RECEBE);
				setState(47);
				((ExprContext)_localctx).e1 = expr();
				((ExprContext)_localctx).result =  new Assign((((ExprContext)_localctx).CARACTERE!=null?((ExprContext)_localctx).CARACTERE.getText():null), ((ExprContext)_localctx).e1.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((ExprContext)_localctx).selecao = selecao();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).selecao.result;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				((ExprContext)_localctx).repeticao = repeticao();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).repeticao.result;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				((ExprContext)_localctx).bloco = bloco();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).bloco.result;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				((ExprContext)_localctx).condicionais = condicionais();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).condicionais.result;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				((ExprContext)_localctx).fundecl = fundecl();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).fundecl.result;
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

	public static class FundeclContext extends ParserRuleContext {
		public Expr result;
		public Token CARACTERE;
		public ArgumentosContext argumentos;
		public ExprContext expr;
		public TerminalNode FUNC() { return getToken(TamagotchiCatParser.FUNC, 0); }
		public TerminalNode CARACTERE() { return getToken(TamagotchiCatParser.CARACTERE, 0); }
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public TerminalNode RECEBE() { return getToken(TamagotchiCatParser.RECEBE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FundeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fundecl; }
	}

	public final FundeclContext fundecl() throws RecognitionException {
		FundeclContext _localctx = new FundeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fundecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(FUNC);
			setState(68);
			((FundeclContext)_localctx).CARACTERE = match(CARACTERE);
			setState(69);
			match(LPAR);
			setState(70);
			((FundeclContext)_localctx).argumentos = argumentos();
			setState(71);
			match(RPAR);
			setState(72);
			match(RECEBE);
			setState(73);
			((FundeclContext)_localctx).expr = expr();
			((FundeclContext)_localctx).result =  new FunDecl((((FundeclContext)_localctx).CARACTERE!=null?((FundeclContext)_localctx).CARACTERE.getText():null), ((FundeclContext)_localctx).argumentos.args, ((FundeclContext)_localctx).expr.result);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public List<String> args;
		public Token CARACTERE;
		public List<TerminalNode> CARACTERE() { return getTokens(TamagotchiCatParser.CARACTERE); }
		public TerminalNode CARACTERE(int i) {
			return getToken(TamagotchiCatParser.CARACTERE, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(TamagotchiCatParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(TamagotchiCatParser.VIRGULA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumentos);
		((ArgumentosContext)_localctx).args =  new ArrayList<>();
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((ArgumentosContext)_localctx).CARACTERE = match(CARACTERE);
				_localctx.args.add((((ArgumentosContext)_localctx).CARACTERE!=null?((ArgumentosContext)_localctx).CARACTERE.getText():null));
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(79);
					match(VIRGULA);
					setState(80);
					((ArgumentosContext)_localctx).CARACTERE = match(CARACTERE);
					_localctx.args.add((((ArgumentosContext)_localctx).CARACTERE!=null?((ArgumentosContext)_localctx).CARACTERE.getText():null));
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class SelecaoContext extends ParserRuleContext {
		public Expr result;
		public ExprContext c1;
		public ExprContext t1;
		public ExprContext t3;
		public TerminalNode IF() { return getToken(TamagotchiCatParser.IF, 0); }
		public TerminalNode STARTBLOCK() { return getToken(TamagotchiCatParser.STARTBLOCK, 0); }
		public TerminalNode ENDBLOCK() { return getToken(TamagotchiCatParser.ENDBLOCK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(TamagotchiCatParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TamagotchiCatParser.NL, i);
		}
		public TerminalNode ELSE() { return getToken(TamagotchiCatParser.ELSE, 0); }
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selecao);
		List<GuardedExpr> gs = new LinkedList<>();
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(IF);
				setState(90);
				((SelecaoContext)_localctx).c1 = expr();
				setState(91);
				match(STARTBLOCK);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(92);
					match(NL);
					}
				}

				setState(95);
				((SelecaoContext)_localctx).t1 = expr();
				setState(96);
				match(ENDBLOCK);
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(97);
					match(NL);
					}
					break;
				}
				gs.add(new GuardedExpr(((SelecaoContext)_localctx).c1.result, ((SelecaoContext)_localctx).t1.result));
				}
				break;
			case ELSE:
			case ENDBLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(102);
					match(ELSE);
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NL) {
						{
						setState(103);
						match(NL);
						}
					}

					setState(106);
					((SelecaoContext)_localctx).t3 = expr();
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NL) {
						{
						setState(107);
						match(NL);
						}
					}

					gs.add(new GuardedExpr(Bool.VERDADE, ((SelecaoContext)_localctx).t3.result));
					}
				}

				setState(114);
				match(ENDBLOCK);
				((SelecaoContext)_localctx).result =  new Cond(gs);
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

	public static class RepeticaoContext extends ParserRuleContext {
		public Expr result;
		public ExprContext e1;
		public BlocoContext bloco;
		public TerminalNode WHILE() { return getToken(TamagotchiCatParser.WHILE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(WHILE);
			setState(119);
			((RepeticaoContext)_localctx).e1 = expr();
			setState(120);
			((RepeticaoContext)_localctx).bloco = bloco();
			((RepeticaoContext)_localctx).result =  new While(((RepeticaoContext)_localctx).e1.result, ((RepeticaoContext)_localctx).bloco.result);
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

	public static class BlocoContext extends ParserRuleContext {
		public Expr result;
		public ExprSeqContext exprSeq;
		public TerminalNode STARTBLOCK() { return getToken(TamagotchiCatParser.STARTBLOCK, 0); }
		public ExprSeqContext exprSeq() {
			return getRuleContext(ExprSeqContext.class,0);
		}
		public TerminalNode ENDBLOCK() { return getToken(TamagotchiCatParser.ENDBLOCK, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(STARTBLOCK);
			setState(124);
			((BlocoContext)_localctx).exprSeq = exprSeq();
			setState(125);
			match(ENDBLOCK);
			((BlocoContext)_localctx).result =  Block.from(((BlocoContext)_localctx).exprSeq.exprs);
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

	public static class CondicionaisContext extends ParserRuleContext {
		public Expr result;
		public AddExprContext addExpr;
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode E() { return getToken(TamagotchiCatParser.E, 0); }
		public TerminalNode IGUAL() { return getToken(TamagotchiCatParser.IGUAL, 0); }
		public TerminalNode DIFF() { return getToken(TamagotchiCatParser.DIFF, 0); }
		public TerminalNode MAIOR() { return getToken(TamagotchiCatParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(TamagotchiCatParser.MENOR, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(TamagotchiCatParser.MAIORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(TamagotchiCatParser.MENORIGUAL, 0); }
		public CondicionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionais; }
	}

	public final CondicionaisContext condicionais() throws RecognitionException {
		CondicionaisContext _localctx = new CondicionaisContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicionais);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case LBKT:
			case TRUE:
			case FALSE:
			case NOT:
			case CARACTERE:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((CondicionaisContext)_localctx).addExpr = addExpr();
				((CondicionaisContext)_localctx).result =  ((CondicionaisContext)_localctx).addExpr.result;
				}
				break;
			case E:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(E);
				setState(132);
				((CondicionaisContext)_localctx).addExpr = addExpr();
				((CondicionaisContext)_localctx).result =  new FunCall(Ops.AND, _localctx.result, ((CondicionaisContext)_localctx).addExpr.result);
				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(IGUAL);
				setState(136);
				((CondicionaisContext)_localctx).addExpr = addExpr();
				((CondicionaisContext)_localctx).result =  new FunCall(Ops.IGUAL, _localctx.result, ((CondicionaisContext)_localctx).addExpr.result;
				}
				break;
			case DIFF:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(DIFF);
				setState(140);
				((CondicionaisContext)_localctx).addExpr = addExpr();
				((CondicionaisContext)_localctx).result =  new FunCall(Ops.DIFF, _localctx.result, ((CondicionaisContext)_localctx).addExpr.result);
				}
				break;
			case MAIOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(MAIOR);
				setState(144);
				((CondicionaisContext)_localctx).addExpr = addExpr();
				((CondicionaisContext)_localctx).result =  new FunCall(Ops.MAIOR, _localctx.result, ((CondicionaisContext)_localctx).addExpr.result);
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				match(MENOR);
				setState(148);
				((CondicionaisContext)_localctx).addExpr = addExpr();
				((CondicionaisContext)_localctx).result =  new FunCall(Ops.MENOR, _localctx.result, ((CondicionaisContext)_localctx).addExpr.result);
				}
				break;
			case MAIORIGUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				match(MAIORIGUAL);
				setState(152);
				((CondicionaisContext)_localctx).addExpr = addExpr();
				((CondicionaisContext)_localctx).result =  new FunCall(Ops.MAIORIGUAL, _localctx.result, ((CondicionaisContext)_localctx).addExpr.result);
				}
				break;
			case MENORIGUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				match(MENORIGUAL);
				setState(156);
				((CondicionaisContext)_localctx).addExpr = addExpr();
				((CondicionaisContext)_localctx).result =  new FunCall(Ops.MENORIGUAL, _localctx.result, ((CondicionaisContext)_localctx).addExpr.result);
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

	public static class AddExprContext extends ParserRuleContext {
		public Expr result;
		public MultExprContext multExpr;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((AddExprContext)_localctx).multExpr = multExpr();
			((AddExprContext)_localctx).result =  ((AddExprContext)_localctx).multExpr.result;
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(163);
					match(T__0);
					setState(164);
					((AddExprContext)_localctx).multExpr = multExpr();
					((AddExprContext)_localctx).result =  new FunCall(Ops.PLUS, _localctx.result, ((AddExprContext)_localctx).multExpr.result);
					}
					break;
				case T__1:
					{
					setState(167);
					match(T__1);
					setState(168);
					((AddExprContext)_localctx).multExpr = multExpr();
					((AddExprContext)_localctx).result =  new FunCall(Ops.MINUS, _localctx.result, ((AddExprContext)_localctx).multExpr.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(175);
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

	public static class MultExprContext extends ParserRuleContext {
		public Expr result;
		public SimpleExprContext simpleExpr;
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((MultExprContext)_localctx).simpleExpr = simpleExpr();
			((MultExprContext)_localctx).result =  ((MultExprContext)_localctx).simpleExpr.result;
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

	public static class SimpleExprContext extends ParserRuleContext {
		public Expr result;
		public AtomExprContext atomExpr;
		public ListExpresaoContext listExpresao;
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public ListExpresaoContext listExpresao() {
			return getRuleContext(ListExpresaoContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleExpr);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				((SimpleExprContext)_localctx).atomExpr = atomExpr();
				((SimpleExprContext)_localctx).result =  ((SimpleExprContext)_localctx).atomExpr.result;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				((SimpleExprContext)_localctx).atomExpr = atomExpr();
				setState(183);
				match(LPAR);
				setState(184);
				((SimpleExprContext)_localctx).listExpresao = listExpresao();
				setState(185);
				match(RPAR);

				      Expr f = ((SimpleExprContext)_localctx).atomExpr.result;
				      ((SimpleExprContext)_localctx).result =  new FunCall(f, ((SimpleExprContext)_localctx).listExpresao.exprs);
				    
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

	public static class AtomExprContext extends ParserRuleContext {
		public Expr result;
		public AtomExprContext atomExpr;
		public NumeroContext numero;
		public BoolContext bool;
		public Token STRING;
		public Token CARACTERE;
		public ListExpresaoContext listExpresao;
		public ExprContext expr;
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TamagotchiCatParser.STRING, 0); }
		public TerminalNode CARACTERE() { return getToken(TamagotchiCatParser.CARACTERE, 0); }
		public TerminalNode LBKT() { return getToken(TamagotchiCatParser.LBKT, 0); }
		public ListExpresaoContext listExpresao() {
			return getRuleContext(ListExpresaoContext.class,0);
		}
		public TerminalNode RBKT() { return getToken(TamagotchiCatParser.RBKT, 0); }
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public AtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpr; }
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atomExpr);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(NOT);
				setState(191);
				((AtomExprContext)_localctx).atomExpr = atomExpr();
				((AtomExprContext)_localctx).result =  new FunCall(Ops.NOT, ((AtomExprContext)_localctx).atomExpr.result);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				((AtomExprContext)_localctx).numero = numero();
				((AtomExprContext)_localctx).result =  ((AtomExprContext)_localctx).numero.result;
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				((AtomExprContext)_localctx).bool = bool();
				((AtomExprContext)_localctx).result =  ((AtomExprContext)_localctx).bool.result;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				((AtomExprContext)_localctx).STRING = match(STRING);
				((AtomExprContext)_localctx).result =  StringLit.fromRepr((((AtomExprContext)_localctx).STRING!=null?((AtomExprContext)_localctx).STRING.getText():null));
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				((AtomExprContext)_localctx).CARACTERE = match(CARACTERE);
				((AtomExprContext)_localctx).result =  new Variable((((AtomExprContext)_localctx).CARACTERE!=null?((AtomExprContext)_localctx).CARACTERE.getText():null));
				}
				break;
			case LBKT:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				match(LBKT);
				setState(205);
				((AtomExprContext)_localctx).listExpresao = listExpresao();
				setState(206);
				match(RBKT);
				((AtomExprContext)_localctx).result =  new ListExpr(((AtomExprContext)_localctx).listExpresao.exprs);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(LPAR);
				setState(210);
				((AtomExprContext)_localctx).expr = expr();
				setState(211);
				match(RPAR);
				((AtomExprContext)_localctx).result =  ((AtomExprContext)_localctx).expr.result;
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

	public static class ListExpresaoContext extends ParserRuleContext {
		public List<Expr> exprs;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(TamagotchiCatParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(TamagotchiCatParser.VIRGULA, i);
		}
		public ListExpresaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpresao; }
	}

	public final ListExpresaoContext listExpresao() throws RecognitionException {
		ListExpresaoContext _localctx = new ListExpresaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listExpresao);
		 ((ListExpresaoContext)_localctx).exprs =  new LinkedList<Expr>(); 
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAR:
			case RBKT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case FUNC:
			case IF:
			case ELSE:
			case WHILE:
			case STARTBLOCK:
			case ENDBLOCK:
			case LPAR:
			case LBKT:
			case TRUE:
			case FALSE:
			case E:
			case IGUAL:
			case DIFF:
			case MAIORIGUAL:
			case MAIOR:
			case MENORIGUAL:
			case MENOR:
			case NOT:
			case CARACTERE:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				((ListExpresaoContext)_localctx).expr = expr();
				_localctx.exprs.add(((ListExpresaoContext)_localctx).expr.result);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(219);
					match(VIRGULA);
					setState(220);
					((ListExpresaoContext)_localctx).expr = expr();
					_localctx.exprs.add(((ListExpresaoContext)_localctx).expr.result);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class NumeroContext extends ParserRuleContext {
		public Expr result;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(TamagotchiCatParser.INTEGER, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((NumeroContext)_localctx).INTEGER = match(INTEGER);
			((NumeroContext)_localctx).result =  Inteiro.of((((NumeroContext)_localctx).INTEGER!=null?((NumeroContext)_localctx).INTEGER.getText():null));
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

	public static class BoolContext extends ParserRuleContext {
		public Expr result;
		public TerminalNode TRUE() { return getToken(TamagotchiCatParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TamagotchiCatParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(TRUE);
				((BoolContext)_localctx).result =  Bool.FATO;
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(FALSE);
				((BoolContext)_localctx).result =  Bool.FAKE;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4D\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6U\n\6\f\6"+
		"\16\6X\13\6\5\6Z\n\6\3\7\3\7\3\7\3\7\5\7`\n\7\3\7\3\7\3\7\5\7e\n\7\3\7"+
		"\3\7\3\7\3\7\5\7k\n\7\3\7\3\7\5\7o\n\7\3\7\3\7\5\7s\n\7\3\7\3\7\5\7w\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a2\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00ae\n\13\f\13\16\13\u00b1\13\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bf\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d9\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00e2\n\17\f\17\16\17\u00e5\13\17\5\17\u00e7\n\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00f0\n\21\3\21\2\2\22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\4\2\22\22!!\2\u0103\2\"\3\2\2\2"+
		"\4,\3\2\2\2\6C\3\2\2\2\bE\3\2\2\2\nY\3\2\2\2\fv\3\2\2\2\16x\3\2\2\2\20"+
		"}\3\2\2\2\22\u00a1\3\2\2\2\24\u00a3\3\2\2\2\26\u00b2\3\2\2\2\30\u00be"+
		"\3\2\2\2\32\u00d8\3\2\2\2\34\u00e6\3\2\2\2\36\u00e8\3\2\2\2 \u00ef\3\2"+
		"\2\2\"#\5\4\3\2#$\b\2\1\2$\3\3\2\2\2%&\5\6\4\2&\'\t\2\2\2\'(\b\3\1\2("+
		"+\3\2\2\2)+\t\2\2\2*%\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2"+
		"-\5\3\2\2\2.,\3\2\2\2/\60\7\35\2\2\60\61\7\34\2\2\61\62\5\6\4\2\62\63"+
		"\b\4\1\2\63D\3\2\2\2\64\65\5\f\7\2\65\66\b\4\1\2\66D\3\2\2\2\678\5\16"+
		"\b\289\b\4\1\29D\3\2\2\2:;\5\20\t\2;<\b\4\1\2<D\3\2\2\2=>\5\22\n\2>?\b"+
		"\4\1\2?D\3\2\2\2@A\5\b\5\2AB\b\4\1\2BD\3\2\2\2C/\3\2\2\2C\64\3\2\2\2C"+
		"\67\3\2\2\2C:\3\2\2\2C=\3\2\2\2C@\3\2\2\2D\7\3\2\2\2EF\7\5\2\2FG\7\35"+
		"\2\2GH\7\13\2\2HI\5\n\6\2IJ\7\f\2\2JK\7\34\2\2KL\5\6\4\2LM\b\5\1\2M\t"+
		"\3\2\2\2NZ\3\2\2\2OP\7\35\2\2PV\b\6\1\2QR\7\21\2\2RS\7\35\2\2SU\b\6\1"+
		"\2TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YN\3\2\2"+
		"\2YO\3\2\2\2Z\13\3\2\2\2[\\\7\6\2\2\\]\5\6\4\2]_\7\t\2\2^`\7!\2\2_^\3"+
		"\2\2\2_`\3\2\2\2`a\3\2\2\2ab\5\6\4\2bd\7\n\2\2ce\7!\2\2dc\3\2\2\2de\3"+
		"\2\2\2ef\3\2\2\2fg\b\7\1\2gw\3\2\2\2hj\7\7\2\2ik\7!\2\2ji\3\2\2\2jk\3"+
		"\2\2\2kl\3\2\2\2ln\5\6\4\2mo\7!\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b"+
		"\7\1\2qs\3\2\2\2rh\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\n\2\2uw\b\7\1\2v[\3"+
		"\2\2\2vr\3\2\2\2w\r\3\2\2\2xy\7\b\2\2yz\5\6\4\2z{\5\20\t\2{|\b\b\1\2|"+
		"\17\3\2\2\2}~\7\t\2\2~\177\5\4\3\2\177\u0080\7\n\2\2\u0080\u0081\b\t\1"+
		"\2\u0081\21\3\2\2\2\u0082\u0083\5\24\13\2\u0083\u0084\b\n\1\2\u0084\u00a2"+
		"\3\2\2\2\u0085\u0086\7\24\2\2\u0086\u0087\5\24\13\2\u0087\u0088\b\n\1"+
		"\2\u0088\u00a2\3\2\2\2\u0089\u008a\7\25\2\2\u008a\u008b\5\24\13\2\u008b"+
		"\u008c\b\n\1\2\u008c\u00a2\3\2\2\2\u008d\u008e\7\26\2\2\u008e\u008f\5"+
		"\24\13\2\u008f\u0090\b\n\1\2\u0090\u00a2\3\2\2\2\u0091\u0092\7\30\2\2"+
		"\u0092\u0093\5\24\13\2\u0093\u0094\b\n\1\2\u0094\u00a2\3\2\2\2\u0095\u0096"+
		"\7\32\2\2\u0096\u0097\5\24\13\2\u0097\u0098\b\n\1\2\u0098\u00a2\3\2\2"+
		"\2\u0099\u009a\7\27\2\2\u009a\u009b\5\24\13\2\u009b\u009c\b\n\1\2\u009c"+
		"\u00a2\3\2\2\2\u009d\u009e\7\31\2\2\u009e\u009f\5\24\13\2\u009f\u00a0"+
		"\b\n\1\2\u00a0\u00a2\3\2\2\2\u00a1\u0082\3\2\2\2\u00a1\u0085\3\2\2\2\u00a1"+
		"\u0089\3\2\2\2\u00a1\u008d\3\2\2\2\u00a1\u0091\3\2\2\2\u00a1\u0095\3\2"+
		"\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\23\3\2\2\2\u00a3\u00a4"+
		"\5\26\f\2\u00a4\u00af\b\13\1\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5\26\f"+
		"\2\u00a7\u00a8\b\13\1\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\7\4\2\2\u00aa"+
		"\u00ab\5\26\f\2\u00ab\u00ac\b\13\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00a5\3"+
		"\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\25\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\5\30\r"+
		"\2\u00b3\u00b4\b\f\1\2\u00b4\27\3\2\2\2\u00b5\u00b6\5\32\16\2\u00b6\u00b7"+
		"\b\r\1\2\u00b7\u00bf\3\2\2\2\u00b8\u00b9\5\32\16\2\u00b9\u00ba\7\13\2"+
		"\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\7\f\2\2\u00bc\u00bd\b\r\1\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00b5\3\2\2\2\u00be\u00b8\3\2\2\2\u00bf\31\3\2\2"+
		"\2\u00c0\u00c1\7\33\2\2\u00c1\u00c2\5\32\16\2\u00c2\u00c3\b\16\1\2\u00c3"+
		"\u00d9\3\2\2\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6\b\16\1\2\u00c6\u00d9"+
		"\3\2\2\2\u00c7\u00c8\5 \21\2\u00c8\u00c9\b\16\1\2\u00c9\u00d9\3\2\2\2"+
		"\u00ca\u00cb\7 \2\2\u00cb\u00d9\b\16\1\2\u00cc\u00cd\7\35\2\2\u00cd\u00d9"+
		"\b\16\1\2\u00ce\u00cf\7\r\2\2\u00cf\u00d0\5\34\17\2\u00d0\u00d1\7\16\2"+
		"\2\u00d1\u00d2\b\16\1\2\u00d2\u00d9\3\2\2\2\u00d3\u00d4\7\13\2\2\u00d4"+
		"\u00d5\5\6\4\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\b\16\1\2\u00d7\u00d9\3"+
		"\2\2\2\u00d8\u00c0\3\2\2\2\u00d8\u00c4\3\2\2\2\u00d8\u00c7\3\2\2\2\u00d8"+
		"\u00ca\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00d3\3\2"+
		"\2\2\u00d9\33\3\2\2\2\u00da\u00e7\3\2\2\2\u00db\u00dc\5\6\4\2\u00dc\u00e3"+
		"\b\17\1\2\u00dd\u00de\7\21\2\2\u00de\u00df\5\6\4\2\u00df\u00e0\b\17\1"+
		"\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00da\3\2\2\2\u00e6\u00db\3\2\2\2\u00e7\35\3\2\2\2\u00e8\u00e9\7\36\2"+
		"\2\u00e9\u00ea\b\20\1\2\u00ea\37\3\2\2\2\u00eb\u00ec\7\17\2\2\u00ec\u00f0"+
		"\b\21\1\2\u00ed\u00ee\7\20\2\2\u00ee\u00f0\b\21\1\2\u00ef\u00eb\3\2\2"+
		"\2\u00ef\u00ed\3\2\2\2\u00f0!\3\2\2\2\25*,CVY_djnrv\u00a1\u00ad\u00af"+
		"\u00be\u00d8\u00e3\u00e6\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}