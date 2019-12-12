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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FUNC=8, IF=9, 
		ELSE=10, WHILE=11, STARTBLOCK=12, ENDBLOCK=13, LPAR=14, RPAR=15, LBKT=16, 
		RBKT=17, TRUE=18, FALSE=19, VIRGULA=20, SEMI=21, OU=22, E=23, IGUAL=24, 
		DIFF=25, MAIORIGUAL=26, MAIOR=27, MENORIGUAL=28, MENOR=29, RECEBE=30, 
		CARACTERE=31, FLOAT=32, INTEGER=33, CHAR=34, STRING=35, NL=36, WS=37, 
		LINE_COMMENT=38, THEN=39;
	public static final int
		RULE_programa = 0, RULE_exprSeq = 1, RULE_expr = 2, RULE_fundecl = 3, 
		RULE_formalArgs = 4, RULE_ifExpr = 5, RULE_whileExpr = 6, RULE_blockExpr = 7, 
		RULE_bexpr = 8, RULE_disjExpr = 9, RULE_conjExpr = 10, RULE_addExpr = 11, 
		RULE_multExpr = 12, RULE_simpleExpr = 13, RULE_atomExpr = 14, RULE_exprList = 15, 
		RULE_number = 16, RULE_bool = 17;
	public static final String[] ruleNames = {
		"programa", "exprSeq", "expr", "fundecl", "formalArgs", "ifExpr", "whileExpr", 
		"blockExpr", "bexpr", "disjExpr", "conjExpr", "addExpr", "multExpr", "simpleExpr", 
		"atomExpr", "exprList", "number", "bool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'//'", "'%'", "'!'", "'func'", "'need'", 
		"'diverse'", "'survive'", "'#'", "'$'", "'('", "')'", "'['", "']'", "'fato'", 
		"'fake'", "','", "';'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'>'", 
		"'<='", "'<'", "':='", null, null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "FUNC", "IF", "ELSE", 
		"WHILE", "STARTBLOCK", "ENDBLOCK", "LPAR", "RPAR", "LBKT", "RBKT", "TRUE", 
		"FALSE", "VIRGULA", "SEMI", "OU", "E", "IGUAL", "DIFF", "MAIORIGUAL", 
		"MAIOR", "MENORIGUAL", "MENOR", "RECEBE", "CARACTERE", "FLOAT", "INTEGER", 
		"CHAR", "STRING", "NL", "WS", "LINE_COMMENT", "THEN"
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
		public ExprSeqContext cat;
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
			setState(36);
			((ProgramaContext)_localctx).cat = exprSeq();
			((ProgramaContext)_localctx).result =  Block.from(((ProgramaContext)_localctx).cat.exprs);
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
		public ExprContext e1;
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
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << FUNC) | (1L << IF) | (1L << WHILE) | (1L << STARTBLOCK) | (1L << LPAR) | (1L << LBKT) | (1L << TRUE) | (1L << FALSE) | (1L << SEMI) | (1L << CARACTERE) | (1L << FLOAT) | (1L << INTEGER) | (1L << CHAR) | (1L << STRING) | (1L << NL))) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__6:
				case FUNC:
				case IF:
				case WHILE:
				case STARTBLOCK:
				case LPAR:
				case LBKT:
				case TRUE:
				case FALSE:
				case CARACTERE:
				case FLOAT:
				case INTEGER:
				case CHAR:
				case STRING:
					{
					setState(39);
					((ExprSeqContext)_localctx).e1 = expr();
					setState(40);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					_localctx.exprs.add(((ExprSeqContext)_localctx).e1.result);
					}
					break;
				case SEMI:
				case NL:
					{
					setState(43);
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
				setState(48);
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

	public static class ExprContext extends ParserRuleContext {
		public Expr result;
		public Token CARACTERE;
		public ExprContext e1;
		public IfExprContext i1;
		public WhileExprContext w1;
		public BlockExprContext b1;
		public BexprContext x1;
		public FundeclContext d1;
		public TerminalNode CARACTERE() { return getToken(TamagotchiCatParser.CARACTERE, 0); }
		public TerminalNode RECEBE() { return getToken(TamagotchiCatParser.RECEBE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((ExprContext)_localctx).CARACTERE = match(CARACTERE);
				setState(50);
				match(RECEBE);
				setState(51);
				((ExprContext)_localctx).e1 = expr();
				((ExprContext)_localctx).result =  new Assign((((ExprContext)_localctx).CARACTERE!=null?((ExprContext)_localctx).CARACTERE.getText():null), ((ExprContext)_localctx).e1.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				((ExprContext)_localctx).i1 = ifExpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).i1.result;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				((ExprContext)_localctx).w1 = whileExpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).w1.result;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				((ExprContext)_localctx).b1 = blockExpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).b1.result;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				((ExprContext)_localctx).x1 = bexpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).x1.result;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				((ExprContext)_localctx).d1 = fundecl();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).d1.result;
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
		public FormalArgsContext fa;
		public ExprContext e1;
		public TerminalNode FUNC() { return getToken(TamagotchiCatParser.FUNC, 0); }
		public TerminalNode CARACTERE() { return getToken(TamagotchiCatParser.CARACTERE, 0); }
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public TerminalNode RECEBE() { return getToken(TamagotchiCatParser.RECEBE, 0); }
		public FormalArgsContext formalArgs() {
			return getRuleContext(FormalArgsContext.class,0);
		}
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(FUNC);
				setState(72);
				((FundeclContext)_localctx).CARACTERE = match(CARACTERE);
				setState(73);
				match(LPAR);
				setState(74);
				((FundeclContext)_localctx).fa = formalArgs();
				setState(75);
				match(RPAR);
				setState(76);
				match(RECEBE);
				setState(77);
				((FundeclContext)_localctx).e1 = expr();
				((FundeclContext)_localctx).result =  new FunDecl((((FundeclContext)_localctx).CARACTERE!=null?((FundeclContext)_localctx).CARACTERE.getText():null), ((FundeclContext)_localctx).fa.args, ((FundeclContext)_localctx).e1.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(FUNC);
				setState(81);
				match(LPAR);
				setState(82);
				((FundeclContext)_localctx).fa = formalArgs();
				setState(83);
				match(RPAR);
				setState(84);
				match(RECEBE);
				setState(85);
				((FundeclContext)_localctx).e1 = expr();
				((FundeclContext)_localctx).result =  Lambda.declare(((FundeclContext)_localctx).fa.args, ((FundeclContext)_localctx).e1.result);
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

	public static class FormalArgsContext extends ParserRuleContext {
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
		public FormalArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalArgs; }
	}

	public final FormalArgsContext formalArgs() throws RecognitionException {
		FormalArgsContext _localctx = new FormalArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalArgs);
		((FormalArgsContext)_localctx).args =  new ArrayList<>();
		int _la;
		try {
			setState(101);
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
				setState(91);
				((FormalArgsContext)_localctx).CARACTERE = match(CARACTERE);
				_localctx.args.add((((FormalArgsContext)_localctx).CARACTERE!=null?((FormalArgsContext)_localctx).CARACTERE.getText():null));
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(93);
					match(VIRGULA);
					setState(94);
					((FormalArgsContext)_localctx).CARACTERE = match(CARACTERE);
					_localctx.args.add((((FormalArgsContext)_localctx).CARACTERE!=null?((FormalArgsContext)_localctx).CARACTERE.getText():null));
					}
					}
					setState(100);
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

	public static class IfExprContext extends ParserRuleContext {
		public Expr result;
		public ExprContext c1;
		public ExprContext t1;
		public ExprContext t3;
		public TerminalNode IF() { return getToken(TamagotchiCatParser.IF, 0); }
		public TerminalNode THEN() { return getToken(TamagotchiCatParser.THEN, 0); }
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
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifExpr);
		List<GuardedExpr> gs = new LinkedList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IF);
			setState(104);
			((IfExprContext)_localctx).c1 = expr();
			setState(105);
			match(THEN);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(106);
				match(NL);
				}
			}

			setState(109);
			((IfExprContext)_localctx).t1 = expr();
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(110);
				match(NL);
				}
				break;
			}
			gs.add(new GuardedExpr(((IfExprContext)_localctx).c1.result, ((IfExprContext)_localctx).t1.result));
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(114);
				match(ELSE);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(115);
					match(NL);
					}
				}

				setState(118);
				((IfExprContext)_localctx).t3 = expr();
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(119);
					match(NL);
					}
					break;
				}
				gs.add(new GuardedExpr(Bool.VERUM, ((IfExprContext)_localctx).t3.result));
				}
				break;
			}
			((IfExprContext)_localctx).result =  new Cond(gs);
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

	public static class WhileExprContext extends ParserRuleContext {
		public Expr result;
		public ExprContext c1;
		public ExprContext d1;
		public TerminalNode WHILE() { return getToken(TamagotchiCatParser.WHILE, 0); }
		public TerminalNode STARTBLOCK() { return getToken(TamagotchiCatParser.STARTBLOCK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NL() { return getToken(TamagotchiCatParser.NL, 0); }
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(WHILE);
			setState(129);
			((WhileExprContext)_localctx).c1 = expr();
			setState(130);
			match(STARTBLOCK);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(131);
				match(NL);
				}
			}

			setState(134);
			((WhileExprContext)_localctx).d1 = expr();
			((WhileExprContext)_localctx).result =  new While(((WhileExprContext)_localctx).c1.result, ((WhileExprContext)_localctx).d1.result);
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

	public static class BlockExprContext extends ParserRuleContext {
		public Expr result;
		public ExprSeqContext es;
		public TerminalNode STARTBLOCK() { return getToken(TamagotchiCatParser.STARTBLOCK, 0); }
		public TerminalNode ENDBLOCK() { return getToken(TamagotchiCatParser.ENDBLOCK, 0); }
		public ExprSeqContext exprSeq() {
			return getRuleContext(ExprSeqContext.class,0);
		}
		public BlockExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpr; }
	}

	public final BlockExprContext blockExpr() throws RecognitionException {
		BlockExprContext _localctx = new BlockExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(STARTBLOCK);
			setState(138);
			((BlockExprContext)_localctx).es = exprSeq();
			setState(139);
			match(ENDBLOCK);
			((BlockExprContext)_localctx).result =  Block.from(((BlockExprContext)_localctx).es.exprs);
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

	public static class BexprContext extends ParserRuleContext {
		public Expr result;
		public DisjExprContext d1;
		public DisjExprContext d2;
		public List<DisjExprContext> disjExpr() {
			return getRuleContexts(DisjExprContext.class);
		}
		public DisjExprContext disjExpr(int i) {
			return getRuleContext(DisjExprContext.class,i);
		}
		public List<TerminalNode> OU() { return getTokens(TamagotchiCatParser.OU); }
		public TerminalNode OU(int i) {
			return getToken(TamagotchiCatParser.OU, i);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((BexprContext)_localctx).d1 = disjExpr();
			((BexprContext)_localctx).result =  ((BexprContext)_localctx).d1.result;
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(144);
				match(OU);
				setState(145);
				((BexprContext)_localctx).d2 = disjExpr();
				((BexprContext)_localctx).result =  new FunCall(Ops.OR, _localctx.result, ((BexprContext)_localctx).d2.result);
				}
				}
				setState(152);
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

	public static class DisjExprContext extends ParserRuleContext {
		public Expr result;
		public ConjExprContext c1;
		public ConjExprContext c2;
		public List<ConjExprContext> conjExpr() {
			return getRuleContexts(ConjExprContext.class);
		}
		public ConjExprContext conjExpr(int i) {
			return getRuleContext(ConjExprContext.class,i);
		}
		public List<TerminalNode> E() { return getTokens(TamagotchiCatParser.E); }
		public TerminalNode E(int i) {
			return getToken(TamagotchiCatParser.E, i);
		}
		public DisjExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjExpr; }
	}

	public final DisjExprContext disjExpr() throws RecognitionException {
		DisjExprContext _localctx = new DisjExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_disjExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((DisjExprContext)_localctx).c1 = conjExpr();
			((DisjExprContext)_localctx).result =  ((DisjExprContext)_localctx).c1.result;
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(155);
				match(E);
				setState(156);
				((DisjExprContext)_localctx).c2 = conjExpr();
				((DisjExprContext)_localctx).result =  new FunCall(Ops.AND, _localctx.result, ((DisjExprContext)_localctx).c2.result);
				}
				}
				setState(163);
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

	public static class ConjExprContext extends ParserRuleContext {
		public Expr result;
		public AddExprContext a1;
		public AddExprContext a2;
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(TamagotchiCatParser.IGUAL, 0); }
		public TerminalNode DIFF() { return getToken(TamagotchiCatParser.DIFF, 0); }
		public TerminalNode MAIOR() { return getToken(TamagotchiCatParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(TamagotchiCatParser.MENOR, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(TamagotchiCatParser.MAIORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(TamagotchiCatParser.MENORIGUAL, 0); }
		public ConjExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjExpr; }
	}

	public final ConjExprContext conjExpr() throws RecognitionException {
		ConjExprContext _localctx = new ConjExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conjExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((ConjExprContext)_localctx).a1 = addExpr();
			((ConjExprContext)_localctx).result =  ((ConjExprContext)_localctx).a1.result;
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				setState(166);
				match(IGUAL);
				setState(167);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.IGUAL, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case DIFF:
				{
				setState(170);
				match(DIFF);
				setState(171);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.DIFF, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case MAIOR:
				{
				setState(174);
				match(MAIOR);
				setState(175);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.MAIOR, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case MENOR:
				{
				setState(178);
				match(MENOR);
				setState(179);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.MENOR, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case MAIORIGUAL:
				{
				setState(182);
				match(MAIORIGUAL);
				setState(183);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.MAIORIGUAL, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case MENORIGUAL:
				{
				setState(186);
				match(MENORIGUAL);
				setState(187);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.MENORIGUAL, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case ELSE:
			case STARTBLOCK:
			case RPAR:
			case RBKT:
			case VIRGULA:
			case SEMI:
			case OU:
			case E:
			case NL:
			case THEN:
				break;
			default:
				break;
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

	public static class AddExprContext extends ParserRuleContext {
		public Expr result;
		public MultExprContext a1;
		public MultExprContext a2;
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
		enterRule(_localctx, 22, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((AddExprContext)_localctx).a1 = multExpr();
			((AddExprContext)_localctx).result =  ((AddExprContext)_localctx).a1.result;
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(202);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(194);
					match(T__0);
					setState(195);
					((AddExprContext)_localctx).a2 = multExpr();
					((AddExprContext)_localctx).result =  new FunCall(Ops.PLUS, _localctx.result, ((AddExprContext)_localctx).a2.result);
					}
					break;
				case T__1:
					{
					setState(198);
					match(T__1);
					setState(199);
					((AddExprContext)_localctx).a2 = multExpr();
					((AddExprContext)_localctx).result =  new FunCall(Ops.MINUS, _localctx.result, ((AddExprContext)_localctx).a2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(206);
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
		public SimpleExprContext a1;
		public SimpleExprContext a2;
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((MultExprContext)_localctx).a1 = simpleExpr();
			((MultExprContext)_localctx).result =  ((MultExprContext)_localctx).a1.result;
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(209);
					match(T__2);
					setState(210);
					((MultExprContext)_localctx).a2 = simpleExpr();
					((MultExprContext)_localctx).result =  new FunCall(Ops.TIMES, _localctx.result, ((MultExprContext)_localctx).a2.result);
					}
					break;
				case T__3:
					{
					setState(213);
					match(T__3);
					setState(214);
					((MultExprContext)_localctx).a2 = simpleExpr();
					((MultExprContext)_localctx).result =  new FunCall(Ops.DIVIDE, _localctx.result, ((MultExprContext)_localctx).a2.result);
					}
					break;
				case T__4:
					{
					setState(217);
					match(T__4);
					setState(218);
					((MultExprContext)_localctx).a2 = simpleExpr();
					((MultExprContext)_localctx).result =  new FunCall(Ops.IDIV, _localctx.result, ((MultExprContext)_localctx).a2.result);
					}
					break;
				case T__5:
					{
					setState(221);
					match(T__5);
					setState(222);
					((MultExprContext)_localctx).a2 = simpleExpr();
					((MultExprContext)_localctx).result =  new FunCall(Ops.MOD, _localctx.result, ((MultExprContext)_localctx).a2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(229);
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

	public static class SimpleExprContext extends ParserRuleContext {
		public Expr result;
		public AtomExprContext a1;
		public ExprListContext es;
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpleExpr);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				((SimpleExprContext)_localctx).a1 = atomExpr();
				((SimpleExprContext)_localctx).result =  ((SimpleExprContext)_localctx).a1.result;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				((SimpleExprContext)_localctx).a1 = atomExpr();
				setState(234);
				match(LPAR);
				setState(235);
				((SimpleExprContext)_localctx).es = exprList();
				setState(236);
				match(RPAR);

				      Expr f = ((SimpleExprContext)_localctx).a1.result;
				      ((SimpleExprContext)_localctx).result =  new FunCall(f, ((SimpleExprContext)_localctx).es.exprs);
				    
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
		public AtomExprContext a1;
		public NumberContext n;
		public BoolContext b;
		public Token STRING;
		public Token CHAR;
		public Token CARACTERE;
		public ExprListContext es;
		public ExprContext e1;
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TamagotchiCatParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(TamagotchiCatParser.CHAR, 0); }
		public TerminalNode CARACTERE() { return getToken(TamagotchiCatParser.CARACTERE, 0); }
		public TerminalNode LBKT() { return getToken(TamagotchiCatParser.LBKT, 0); }
		public TerminalNode RBKT() { return getToken(TamagotchiCatParser.RBKT, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpr; }
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomExpr);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__1);
				setState(242);
				((AtomExprContext)_localctx).a1 = atomExpr();
				((AtomExprContext)_localctx).result =  new FunCall(Ops.UMINUS, ((AtomExprContext)_localctx).a1.result);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T__6);
				setState(246);
				((AtomExprContext)_localctx).a1 = atomExpr();
				((AtomExprContext)_localctx).result =  new FunCall(Ops.NOT, ((AtomExprContext)_localctx).a1.result);
				}
				break;
			case FLOAT:
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				((AtomExprContext)_localctx).n = number();
				((AtomExprContext)_localctx).result =  ((AtomExprContext)_localctx).n.result;
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				((AtomExprContext)_localctx).b = bool();
				((AtomExprContext)_localctx).result =  ((AtomExprContext)_localctx).b.result;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				((AtomExprContext)_localctx).STRING = match(STRING);
				((AtomExprContext)_localctx).result =  StringLit.fromRepr((((AtomExprContext)_localctx).STRING!=null?((AtomExprContext)_localctx).STRING.getText():null));
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				((AtomExprContext)_localctx).CHAR = match(CHAR);
				((AtomExprContext)_localctx).result =  CharLit.fromRepr((((AtomExprContext)_localctx).CHAR!=null?((AtomExprContext)_localctx).CHAR.getText():null));
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 7);
				{
				setState(259);
				((AtomExprContext)_localctx).CARACTERE = match(CARACTERE);
				((AtomExprContext)_localctx).result =  new Variable((((AtomExprContext)_localctx).CARACTERE!=null?((AtomExprContext)_localctx).CARACTERE.getText():null));
				}
				break;
			case LBKT:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				match(LBKT);
				setState(262);
				((AtomExprContext)_localctx).es = exprList();
				setState(263);
				match(RBKT);
				((AtomExprContext)_localctx).result =  new ListExpr(((AtomExprContext)_localctx).es.exprs);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(266);
				match(LPAR);
				setState(267);
				((AtomExprContext)_localctx).e1 = expr();
				setState(268);
				match(RPAR);
				((AtomExprContext)_localctx).result =  ((AtomExprContext)_localctx).e1.result;
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

	public static class ExprListContext extends ParserRuleContext {
		public List<Expr> exprs;
		public ExprContext e1;
		public ExprContext e2;
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
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprList);
		 ((ExprListContext)_localctx).exprs =  new LinkedList<Expr>(); 
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAR:
			case RBKT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
			case T__6:
			case FUNC:
			case IF:
			case WHILE:
			case STARTBLOCK:
			case LPAR:
			case LBKT:
			case TRUE:
			case FALSE:
			case CARACTERE:
			case FLOAT:
			case INTEGER:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				((ExprListContext)_localctx).e1 = expr();
				_localctx.exprs.add(((ExprListContext)_localctx).e1.result);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(276);
					match(VIRGULA);
					setState(277);
					((ExprListContext)_localctx).e2 = expr();
					_localctx.exprs.add(((ExprListContext)_localctx).e2.result);
					}
					}
					setState(284);
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

	public static class NumberContext extends ParserRuleContext {
		public Expr result;
		public Token INTEGER;
		public Token FLOAT;
		public TerminalNode INTEGER() { return getToken(TamagotchiCatParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(TamagotchiCatParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((NumberContext)_localctx).INTEGER = match(INTEGER);
				((NumberContext)_localctx).result =  IntLit.of((((NumberContext)_localctx).INTEGER!=null?((NumberContext)_localctx).INTEGER.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				((NumberContext)_localctx).FLOAT = match(FLOAT);
				((NumberContext)_localctx).result =  FloatLit.of((((NumberContext)_localctx).FLOAT!=null?((NumberContext)_localctx).FLOAT.getText():null));
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
		enterRule(_localctx, 34, RULE_bool);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(TRUE);
				((BoolContext)_localctx).result =  Bool.VERUM;
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(FALSE);
				((BoolContext)_localctx).result =  Bool.FALSUM;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6c\n\6\f\6\16\6f\13"+
		"\6\5\6h\n\6\3\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7\5\7r\n\7\3\7\3\7\3\7\5\7"+
		"w\n\7\3\7\3\7\5\7{\n\7\3\7\3\7\5\7\177\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b"+
		"\u0087\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u0097\n\n\f\n\16\n\u009a\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a2"+
		"\n\13\f\13\16\13\u00a5\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c1"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00e4\n\16\f\16\16\16\u00e7\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f2\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0112\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u011b\n\21\f\21\16"+
		"\21\u011e\13\21\5\21\u0120\n\21\3\22\3\22\3\22\3\22\5\22\u0126\n\22\3"+
		"\23\3\23\3\23\3\23\5\23\u012c\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$\2\3\4\2\27\27&&\2\u0146\2&\3\2\2\2\4\60\3\2\2\2\6"+
		"G\3\2\2\2\bZ\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16\u0082\3\2\2\2\20\u008b\3"+
		"\2\2\2\22\u0090\3\2\2\2\24\u009b\3\2\2\2\26\u00a6\3\2\2\2\30\u00c2\3\2"+
		"\2\2\32\u00d1\3\2\2\2\34\u00f1\3\2\2\2\36\u0111\3\2\2\2 \u011f\3\2\2\2"+
		"\"\u0125\3\2\2\2$\u012b\3\2\2\2&\'\5\4\3\2\'(\b\2\1\2(\3\3\2\2\2)*\5\6"+
		"\4\2*+\t\2\2\2+,\b\3\1\2,/\3\2\2\2-/\t\2\2\2.)\3\2\2\2.-\3\2\2\2/\62\3"+
		"\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63\64\7!\2"+
		"\2\64\65\7 \2\2\65\66\5\6\4\2\66\67\b\4\1\2\67H\3\2\2\289\5\f\7\29:\b"+
		"\4\1\2:H\3\2\2\2;<\5\16\b\2<=\b\4\1\2=H\3\2\2\2>?\5\20\t\2?@\b\4\1\2@"+
		"H\3\2\2\2AB\5\22\n\2BC\b\4\1\2CH\3\2\2\2DE\5\b\5\2EF\b\4\1\2FH\3\2\2\2"+
		"G\63\3\2\2\2G8\3\2\2\2G;\3\2\2\2G>\3\2\2\2GA\3\2\2\2GD\3\2\2\2H\7\3\2"+
		"\2\2IJ\7\n\2\2JK\7!\2\2KL\7\20\2\2LM\5\n\6\2MN\7\21\2\2NO\7 \2\2OP\5\6"+
		"\4\2PQ\b\5\1\2Q[\3\2\2\2RS\7\n\2\2ST\7\20\2\2TU\5\n\6\2UV\7\21\2\2VW\7"+
		" \2\2WX\5\6\4\2XY\b\5\1\2Y[\3\2\2\2ZI\3\2\2\2ZR\3\2\2\2[\t\3\2\2\2\\h"+
		"\3\2\2\2]^\7!\2\2^d\b\6\1\2_`\7\26\2\2`a\7!\2\2ac\b\6\1\2b_\3\2\2\2cf"+
		"\3\2\2\2db\3\2\2\2de\3\2\2\2eh\3\2\2\2fd\3\2\2\2g\\\3\2\2\2g]\3\2\2\2"+
		"h\13\3\2\2\2ij\7\13\2\2jk\5\6\4\2km\7)\2\2ln\7&\2\2ml\3\2\2\2mn\3\2\2"+
		"\2no\3\2\2\2oq\5\6\4\2pr\7&\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2s~\b\7\1"+
		"\2tv\7\f\2\2uw\7&\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\5\6\4\2y{\7&\2\2"+
		"zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\7\1\2}\177\3\2\2\2~t\3\2\2\2~\177\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\7\1\2\u0081\r\3\2\2\2\u0082\u0083"+
		"\7\r\2\2\u0083\u0084\5\6\4\2\u0084\u0086\7\16\2\2\u0085\u0087\7&\2\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5\6"+
		"\4\2\u0089\u008a\b\b\1\2\u008a\17\3\2\2\2\u008b\u008c\7\16\2\2\u008c\u008d"+
		"\5\4\3\2\u008d\u008e\7\17\2\2\u008e\u008f\b\t\1\2\u008f\21\3\2\2\2\u0090"+
		"\u0091\5\24\13\2\u0091\u0098\b\n\1\2\u0092\u0093\7\30\2\2\u0093\u0094"+
		"\5\24\13\2\u0094\u0095\b\n\1\2\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2"+
		"\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\23"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\5\26\f\2\u009c\u00a3\b\13\1\2"+
		"\u009d\u009e\7\31\2\2\u009e\u009f\5\26\f\2\u009f\u00a0\b\13\1\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7"+
		"\5\30\r\2\u00a7\u00c0\b\f\1\2\u00a8\u00a9\7\32\2\2\u00a9\u00aa\5\30\r"+
		"\2\u00aa\u00ab\b\f\1\2\u00ab\u00c1\3\2\2\2\u00ac\u00ad\7\33\2\2\u00ad"+
		"\u00ae\5\30\r\2\u00ae\u00af\b\f\1\2\u00af\u00c1\3\2\2\2\u00b0\u00b1\7"+
		"\35\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\b\f\1\2\u00b3\u00c1\3\2\2\2\u00b4"+
		"\u00b5\7\37\2\2\u00b5\u00b6\5\30\r\2\u00b6\u00b7\b\f\1\2\u00b7\u00c1\3"+
		"\2\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\b\f\1\2\u00bb"+
		"\u00c1\3\2\2\2\u00bc\u00bd\7\36\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\b"+
		"\f\1\2\u00bf\u00c1\3\2\2\2\u00c0\u00a8\3\2\2\2\u00c0\u00ac\3\2\2\2\u00c0"+
		"\u00b0\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00bc\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\27\3\2\2\2\u00c2\u00c3\5\32\16\2\u00c3"+
		"\u00ce\b\r\1\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\b"+
		"\r\1\2\u00c7\u00cd\3\2\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\5\32\16\2\u00ca"+
		"\u00cb\b\r\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c8\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\31\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5\34\17\2\u00d2\u00e5\b\16"+
		"\1\2\u00d3\u00d4\7\5\2\2\u00d4\u00d5\5\34\17\2\u00d5\u00d6\b\16\1\2\u00d6"+
		"\u00e4\3\2\2\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9\5\34\17\2\u00d9\u00da\b"+
		"\16\1\2\u00da\u00e4\3\2\2\2\u00db\u00dc\7\7\2\2\u00dc\u00dd\5\34\17\2"+
		"\u00dd\u00de\b\16\1\2\u00de\u00e4\3\2\2\2\u00df\u00e0\7\b\2\2\u00e0\u00e1"+
		"\5\34\17\2\u00e1\u00e2\b\16\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00d3\3\2\2"+
		"\2\u00e3\u00d7\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00e7"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\33\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\b\17\1\2\u00ea\u00f2"+
		"\3\2\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\7\20\2\2\u00ed\u00ee\5 \21"+
		"\2\u00ee\u00ef\7\21\2\2\u00ef\u00f0\b\17\1\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00e8\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2\35\3\2\2\2\u00f3\u00f4\7\4\2"+
		"\2\u00f4\u00f5\5\36\20\2\u00f5\u00f6\b\20\1\2\u00f6\u0112\3\2\2\2\u00f7"+
		"\u00f8\7\t\2\2\u00f8\u00f9\5\36\20\2\u00f9\u00fa\b\20\1\2\u00fa\u0112"+
		"\3\2\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00fd\b\20\1\2\u00fd\u0112\3\2\2\2"+
		"\u00fe\u00ff\5$\23\2\u00ff\u0100\b\20\1\2\u0100\u0112\3\2\2\2\u0101\u0102"+
		"\7%\2\2\u0102\u0112\b\20\1\2\u0103\u0104\7$\2\2\u0104\u0112\b\20\1\2\u0105"+
		"\u0106\7!\2\2\u0106\u0112\b\20\1\2\u0107\u0108\7\22\2\2\u0108\u0109\5"+
		" \21\2\u0109\u010a\7\23\2\2\u010a\u010b\b\20\1\2\u010b\u0112\3\2\2\2\u010c"+
		"\u010d\7\20\2\2\u010d\u010e\5\6\4\2\u010e\u010f\7\21\2\2\u010f\u0110\b"+
		"\20\1\2\u0110\u0112\3\2\2\2\u0111\u00f3\3\2\2\2\u0111\u00f7\3\2\2\2\u0111"+
		"\u00fb\3\2\2\2\u0111\u00fe\3\2\2\2\u0111\u0101\3\2\2\2\u0111\u0103\3\2"+
		"\2\2\u0111\u0105\3\2\2\2\u0111\u0107\3\2\2\2\u0111\u010c\3\2\2\2\u0112"+
		"\37\3\2\2\2\u0113\u0120\3\2\2\2\u0114\u0115\5\6\4\2\u0115\u011c\b\21\1"+
		"\2\u0116\u0117\7\26\2\2\u0117\u0118\5\6\4\2\u0118\u0119\b\21\1\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0116\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0113\3\2\2\2\u011f\u0114\3\2\2\2\u0120!\3\2\2\2\u0121\u0122\7#\2\2\u0122"+
		"\u0126\b\22\1\2\u0123\u0124\7\"\2\2\u0124\u0126\b\22\1\2\u0125\u0121\3"+
		"\2\2\2\u0125\u0123\3\2\2\2\u0126#\3\2\2\2\u0127\u0128\7\24\2\2\u0128\u012c"+
		"\b\23\1\2\u0129\u012a\7\25\2\2\u012a\u012c\b\23\1\2\u012b\u0127\3\2\2"+
		"\2\u012b\u0129\3\2\2\2\u012c%\3\2\2\2\33.\60GZdgmqvz~\u0086\u0098\u00a3"+
		"\u00c0\u00cc\u00ce\u00e3\u00e5\u00f1\u0111\u011c\u011f\u0125\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}