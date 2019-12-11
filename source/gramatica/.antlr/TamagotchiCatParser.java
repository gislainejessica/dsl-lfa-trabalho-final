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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FUN=8, IF=9, THEN=10, 
		ELSE=11, WHILE=12, STARTBLOCK=13, ENDBLOCK=14, LPAR=15, RPAR=16, LBKT=17, 
		RBKT=18, LBRC=19, RBRC=20, TRUE=21, FALSE=22, COMMA=23, SEMI=24, OR=25, 
		AND=26, EQU=27, NEQ=28, GEQ=29, GT=30, LEQ=31, LT=32, GETS=33, CHARACTERES=34, 
		FLOAT=35, INTEGER=36, CHAR=37, STRING=38, NL=39, WS=40, LINE_COMMENT=41, 
		SINGLE_STRING=42, DOUBLE_STRING=43, CHARACTERESIFIER=44;
	public static final int
		RULE_progr = 0, RULE_exprSeq = 1, RULE_expr = 2, RULE_fundecl = 3, RULE_formalArgs = 4, 
		RULE_ifExpr = 5, RULE_whileExpr = 6, RULE_blockExpr = 7, RULE_bexpr = 8, 
		RULE_disjExpr = 9, RULE_conjExpr = 10, RULE_addExpr = 11, RULE_multExpr = 12, 
		RULE_simpleExpr = 13, RULE_atomExpr = 14, RULE_exprList = 15, RULE_number = 16, 
		RULE_bool = 17, RULE_primitive = 18, RULE_string = 19;
	public static final String[] ruleNames = {
		"progr", "exprSeq", "expr", "fundecl", "formalArgs", "ifExpr", "whileExpr", 
		"blockExpr", "bexpr", "disjExpr", "conjExpr", "addExpr", "multExpr", "simpleExpr", 
		"atomExpr", "exprList", "number", "bool", "primitive", "string"
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
	public static class ProgrContext extends ParserRuleContext {
		public Expr result;
		public ExprSeqContext es;
		public ExprSeqContext exprSeq() {
			return getRuleContext(ExprSeqContext.class,0);
		}
		public ProgrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progr; }
	}

	public final ProgrContext progr() throws RecognitionException {
		ProgrContext _localctx = new ProgrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_progr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((ProgrContext)_localctx).es = exprSeq();
			((ProgrContext)_localctx).result =  Block.from(((ProgrContext)_localctx).es.exprs);
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << FUN) | (1L << IF) | (1L << WHILE) | (1L << LPAR) | (1L << LBKT) | (1L << LBRC) | (1L << TRUE) | (1L << FALSE) | (1L << SEMI) | (1L << CHARACTERES) | (1L << FLOAT) | (1L << INTEGER) | (1L << CHAR) | (1L << STRING) | (1L << NL))) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__6:
				case FUN:
				case IF:
				case WHILE:
				case LPAR:
				case LBKT:
				case LBRC:
				case TRUE:
				case FALSE:
				case CHARACTERES:
				case FLOAT:
				case INTEGER:
				case CHAR:
				case STRING:
					{
					setState(43);
					((ExprSeqContext)_localctx).e1 = expr();
					setState(44);
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
					setState(47);
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
				setState(52);
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
		public Token CHARACTERES;
		public ExprContext e1;
		public IfExprContext i1;
		public WhileExprContext w1;
		public BlockExprContext b1;
		public BexprContext x1;
		public FundeclContext d1;
		public TerminalNode CHARACTERES() { return getToken(TamagotchiCatParser.CHARACTERES, 0); }
		public TerminalNode GETS() { return getToken(TamagotchiCatParser.GETS, 0); }
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				((ExprContext)_localctx).CHARACTERES = match(CHARACTERES);
				setState(54);
				match(GETS);
				setState(55);
				((ExprContext)_localctx).e1 = expr();
				((ExprContext)_localctx).result =  new Assign((((ExprContext)_localctx).CHARACTERES!=null?((ExprContext)_localctx).CHARACTERES.getText():null), ((ExprContext)_localctx).e1.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				((ExprContext)_localctx).i1 = ifExpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).i1.result;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				((ExprContext)_localctx).w1 = whileExpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).w1.result;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				((ExprContext)_localctx).b1 = blockExpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).b1.result;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				((ExprContext)_localctx).x1 = bexpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).x1.result;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
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
		public Token CHARACTERES;
		public FormalArgsContext fa;
		public ExprContext e1;
		public TerminalNode FUN() { return getToken(TamagotchiCatParser.FUN, 0); }
		public TerminalNode CHARACTERES() { return getToken(TamagotchiCatParser.CHARACTERES, 0); }
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public TerminalNode GETS() { return getToken(TamagotchiCatParser.GETS, 0); }
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(FUN);
				setState(76);
				((FundeclContext)_localctx).CHARACTERES = match(CHARACTERES);
				setState(77);
				match(LPAR);
				setState(78);
				((FundeclContext)_localctx).fa = formalArgs();
				setState(79);
				match(RPAR);
				setState(80);
				match(GETS);
				setState(81);
				((FundeclContext)_localctx).e1 = expr();
				((FundeclContext)_localctx).result =  new FunDecl((((FundeclContext)_localctx).CHARACTERES!=null?((FundeclContext)_localctx).CHARACTERES.getText():null), ((FundeclContext)_localctx).fa.args, ((FundeclContext)_localctx).e1.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(FUN);
				setState(85);
				match(LPAR);
				setState(86);
				((FundeclContext)_localctx).fa = formalArgs();
				setState(87);
				match(RPAR);
				setState(88);
				match(GETS);
				setState(89);
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
		public Token CHARACTERES;
		public List<TerminalNode> CHARACTERES() { return getTokens(TamagotchiCatParser.CHARACTERES); }
		public TerminalNode CHARACTERES(int i) {
			return getToken(TamagotchiCatParser.CHARACTERES, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TamagotchiCatParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TamagotchiCatParser.COMMA, i);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CHARACTERES:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((FormalArgsContext)_localctx).CHARACTERES = match(CHARACTERES);
				_localctx.args.add((((FormalArgsContext)_localctx).CHARACTERES!=null?((FormalArgsContext)_localctx).CHARACTERES.getText():null));
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(97);
					match(COMMA);
					setState(98);
					((FormalArgsContext)_localctx).CHARACTERES = match(CHARACTERES);
					_localctx.args.add((((FormalArgsContext)_localctx).CHARACTERES!=null?((FormalArgsContext)_localctx).CHARACTERES.getText():null));
					}
					}
					setState(104);
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
			setState(107);
			match(IF);
			setState(108);
			((IfExprContext)_localctx).c1 = expr();
			setState(109);
			match(THEN);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(110);
				match(NL);
				}
			}

			setState(113);
			((IfExprContext)_localctx).t1 = expr();
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(114);
				match(NL);
				}
				break;
			}
			gs.add(new GuardedExpr(((IfExprContext)_localctx).c1.result, ((IfExprContext)_localctx).t1.result));
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(118);
				match(ELSE);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(119);
					match(NL);
					}
				}

				setState(122);
				((IfExprContext)_localctx).t3 = expr();
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(123);
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
			setState(132);
			match(WHILE);
			setState(133);
			((WhileExprContext)_localctx).c1 = expr();
			setState(134);
			match(STARTBLOCK);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(135);
				match(NL);
				}
			}

			setState(138);
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
		public TerminalNode LBRC() { return getToken(TamagotchiCatParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(TamagotchiCatParser.RBRC, 0); }
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
			setState(141);
			match(LBRC);
			setState(142);
			((BlockExprContext)_localctx).es = exprSeq();
			setState(143);
			match(RBRC);
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
		public List<TerminalNode> OR() { return getTokens(TamagotchiCatParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TamagotchiCatParser.OR, i);
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
			setState(146);
			((BexprContext)_localctx).d1 = disjExpr();
			((BexprContext)_localctx).result =  ((BexprContext)_localctx).d1.result;
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(148);
				match(OR);
				setState(149);
				((BexprContext)_localctx).d2 = disjExpr();
				((BexprContext)_localctx).result =  new FunCall(Ops.OR, _localctx.result, ((BexprContext)_localctx).d2.result);
				}
				}
				setState(156);
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
		public List<TerminalNode> AND() { return getTokens(TamagotchiCatParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TamagotchiCatParser.AND, i);
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
			setState(157);
			((DisjExprContext)_localctx).c1 = conjExpr();
			((DisjExprContext)_localctx).result =  ((DisjExprContext)_localctx).c1.result;
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(159);
				match(AND);
				setState(160);
				((DisjExprContext)_localctx).c2 = conjExpr();
				((DisjExprContext)_localctx).result =  new FunCall(Ops.AND, _localctx.result, ((DisjExprContext)_localctx).c2.result);
				}
				}
				setState(167);
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
		public TerminalNode EQU() { return getToken(TamagotchiCatParser.EQU, 0); }
		public TerminalNode NEQ() { return getToken(TamagotchiCatParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(TamagotchiCatParser.GT, 0); }
		public TerminalNode LT() { return getToken(TamagotchiCatParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(TamagotchiCatParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(TamagotchiCatParser.LEQ, 0); }
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
			setState(168);
			((ConjExprContext)_localctx).a1 = addExpr();
			((ConjExprContext)_localctx).result =  ((ConjExprContext)_localctx).a1.result;
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQU:
				{
				setState(170);
				match(EQU);
				setState(171);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.EQU, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case NEQ:
				{
				setState(174);
				match(NEQ);
				setState(175);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.NEQ, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case GT:
				{
				setState(178);
				match(GT);
				setState(179);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.GT, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case LT:
				{
				setState(182);
				match(LT);
				setState(183);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.LT, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case GEQ:
				{
				setState(186);
				match(GEQ);
				setState(187);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.GEQ, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case LEQ:
				{
				setState(190);
				match(LEQ);
				setState(191);
				((ConjExprContext)_localctx).a2 = addExpr();
				((ConjExprContext)_localctx).result =  new FunCall(Ops.LEQ, _localctx.result, ((ConjExprContext)_localctx).a2.result);
				}
				break;
			case THEN:
			case ELSE:
			case STARTBLOCK:
			case RPAR:
			case RBKT:
			case COMMA:
			case SEMI:
			case OR:
			case AND:
			case NL:
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
			setState(196);
			((AddExprContext)_localctx).a1 = multExpr();
			((AddExprContext)_localctx).result =  ((AddExprContext)_localctx).a1.result;
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(198);
					match(T__0);
					setState(199);
					((AddExprContext)_localctx).a2 = multExpr();
					((AddExprContext)_localctx).result =  new FunCall(Ops.PLUS, _localctx.result, ((AddExprContext)_localctx).a2.result);
					}
					break;
				case T__1:
					{
					setState(202);
					match(T__1);
					setState(203);
					((AddExprContext)_localctx).a2 = multExpr();
					((AddExprContext)_localctx).result =  new FunCall(Ops.MINUS, _localctx.result, ((AddExprContext)_localctx).a2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(210);
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
			setState(211);
			((MultExprContext)_localctx).a1 = simpleExpr();
			((MultExprContext)_localctx).result =  ((MultExprContext)_localctx).a1.result;
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(213);
					match(T__2);
					setState(214);
					((MultExprContext)_localctx).a2 = simpleExpr();
					((MultExprContext)_localctx).result =  new FunCall(Ops.TIMES, _localctx.result, ((MultExprContext)_localctx).a2.result);
					}
					break;
				case T__3:
					{
					setState(217);
					match(T__3);
					setState(218);
					((MultExprContext)_localctx).a2 = simpleExpr();
					((MultExprContext)_localctx).result =  new FunCall(Ops.DIVIDE, _localctx.result, ((MultExprContext)_localctx).a2.result);
					}
					break;
				case T__4:
					{
					setState(221);
					match(T__4);
					setState(222);
					((MultExprContext)_localctx).a2 = simpleExpr();
					((MultExprContext)_localctx).result =  new FunCall(Ops.IDIV, _localctx.result, ((MultExprContext)_localctx).a2.result);
					}
					break;
				case T__5:
					{
					setState(225);
					match(T__5);
					setState(226);
					((MultExprContext)_localctx).a2 = simpleExpr();
					((MultExprContext)_localctx).result =  new FunCall(Ops.MOD, _localctx.result, ((MultExprContext)_localctx).a2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(233);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((SimpleExprContext)_localctx).a1 = atomExpr();
				((SimpleExprContext)_localctx).result =  ((SimpleExprContext)_localctx).a1.result;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				((SimpleExprContext)_localctx).a1 = atomExpr();
				setState(238);
				match(LPAR);
				setState(239);
				((SimpleExprContext)_localctx).es = exprList();
				setState(240);
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
		public Token CHARACTERES;
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
		public TerminalNode CHARACTERES() { return getToken(TamagotchiCatParser.CHARACTERES, 0); }
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
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__1);
				setState(246);
				((AtomExprContext)_localctx).a1 = atomExpr();
				((AtomExprContext)_localctx).result =  new FunCall(Ops.UMINUS, ((AtomExprContext)_localctx).a1.result);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(T__6);
				setState(250);
				((AtomExprContext)_localctx).a1 = atomExpr();
				((AtomExprContext)_localctx).result =  new FunCall(Ops.NOT, ((AtomExprContext)_localctx).a1.result);
				}
				break;
			case FLOAT:
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				((AtomExprContext)_localctx).n = number();
				((AtomExprContext)_localctx).result =  ((AtomExprContext)_localctx).n.result;
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				((AtomExprContext)_localctx).b = bool();
				((AtomExprContext)_localctx).result =  ((AtomExprContext)_localctx).b.result;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				((AtomExprContext)_localctx).STRING = match(STRING);
				((AtomExprContext)_localctx).result =  StringLit.fromRepr((((AtomExprContext)_localctx).STRING!=null?((AtomExprContext)_localctx).STRING.getText():null));
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				((AtomExprContext)_localctx).CHAR = match(CHAR);
				((AtomExprContext)_localctx).result =  CharLit.fromRepr((((AtomExprContext)_localctx).CHAR!=null?((AtomExprContext)_localctx).CHAR.getText():null));
				}
				break;
			case CHARACTERES:
				enterOuterAlt(_localctx, 7);
				{
				setState(263);
				((AtomExprContext)_localctx).CHARACTERES = match(CHARACTERES);
				((AtomExprContext)_localctx).result =  new Variable((((AtomExprContext)_localctx).CHARACTERES!=null?((AtomExprContext)_localctx).CHARACTERES.getText():null));
				}
				break;
			case LBKT:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				match(LBKT);
				setState(266);
				((AtomExprContext)_localctx).es = exprList();
				setState(267);
				match(RBKT);
				((AtomExprContext)_localctx).result =  new ListExpr(((AtomExprContext)_localctx).es.exprs);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(270);
				match(LPAR);
				setState(271);
				((AtomExprContext)_localctx).e1 = expr();
				setState(272);
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
		public List<TerminalNode> COMMA() { return getTokens(TamagotchiCatParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TamagotchiCatParser.COMMA, i);
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
			setState(289);
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
			case FUN:
			case IF:
			case WHILE:
			case LPAR:
			case LBKT:
			case LBRC:
			case TRUE:
			case FALSE:
			case CHARACTERES:
			case FLOAT:
			case INTEGER:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				((ExprListContext)_localctx).e1 = expr();
				_localctx.exprs.add(((ExprListContext)_localctx).e1.result);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(280);
					match(COMMA);
					setState(281);
					((ExprListContext)_localctx).e2 = expr();
					_localctx.exprs.add(((ExprListContext)_localctx).e2.result);
					}
					}
					setState(288);
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
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((NumberContext)_localctx).INTEGER = match(INTEGER);
				((NumberContext)_localctx).result =  IntLit.of((((NumberContext)_localctx).INTEGER!=null?((NumberContext)_localctx).INTEGER.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
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
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(TRUE);
				((BoolContext)_localctx).result =  Bool.VERUM;
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
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

	public static class PrimitiveContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primitive);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_STRING:
			case DOUBLE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				string();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				bool();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SINGLE_STRING() { return getToken(TamagotchiCatParser.SINGLE_STRING, 0); }
		public TerminalNode DOUBLE_STRING() { return getToken(TamagotchiCatParser.DOUBLE_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_STRING || _la==DOUBLE_STRING) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6g\n\6\f\6\16\6j\13\6\5\6l\n\6\3\7\3\7\3\7\3\7\5\7r\n\7\3\7\3\7"+
		"\5\7v\n\7\3\7\3\7\3\7\5\7{\n\7\3\7\3\7\5\7\177\n\7\3\7\3\7\5\7\u0083\n"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00a6\n\13\f\13\16\13\u00a9\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00d1\n\r\f\r\16\r\u00d4\13\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e8"+
		"\n\16\f\16\16\16\u00eb\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00f6\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0116\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u011f\n\21\f\21\16\21\u0122\13\21\5\21\u0124\n\21\3\22"+
		"\3\22\3\22\3\22\5\22\u012a\n\22\3\23\3\23\3\23\3\23\5\23\u0130\n\23\3"+
		"\24\3\24\5\24\u0134\n\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(\2\4\4\2\32\32))\3\2,-\2\u014f\2*\3\2\2\2\4\64\3"+
		"\2\2\2\6K\3\2\2\2\b^\3\2\2\2\nk\3\2\2\2\fm\3\2\2\2\16\u0086\3\2\2\2\20"+
		"\u008f\3\2\2\2\22\u0094\3\2\2\2\24\u009f\3\2\2\2\26\u00aa\3\2\2\2\30\u00c6"+
		"\3\2\2\2\32\u00d5\3\2\2\2\34\u00f5\3\2\2\2\36\u0115\3\2\2\2 \u0123\3\2"+
		"\2\2\"\u0129\3\2\2\2$\u012f\3\2\2\2&\u0133\3\2\2\2(\u0135\3\2\2\2*+\5"+
		"\4\3\2+,\b\2\1\2,\3\3\2\2\2-.\5\6\4\2./\t\2\2\2/\60\b\3\1\2\60\63\3\2"+
		"\2\2\61\63\t\2\2\2\62-\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2"+
		"\2\64\65\3\2\2\2\65\5\3\2\2\2\66\64\3\2\2\2\678\7$\2\289\7#\2\29:\5\6"+
		"\4\2:;\b\4\1\2;L\3\2\2\2<=\5\f\7\2=>\b\4\1\2>L\3\2\2\2?@\5\16\b\2@A\b"+
		"\4\1\2AL\3\2\2\2BC\5\20\t\2CD\b\4\1\2DL\3\2\2\2EF\5\22\n\2FG\b\4\1\2G"+
		"L\3\2\2\2HI\5\b\5\2IJ\b\4\1\2JL\3\2\2\2K\67\3\2\2\2K<\3\2\2\2K?\3\2\2"+
		"\2KB\3\2\2\2KE\3\2\2\2KH\3\2\2\2L\7\3\2\2\2MN\7\n\2\2NO\7$\2\2OP\7\21"+
		"\2\2PQ\5\n\6\2QR\7\22\2\2RS\7#\2\2ST\5\6\4\2TU\b\5\1\2U_\3\2\2\2VW\7\n"+
		"\2\2WX\7\21\2\2XY\5\n\6\2YZ\7\22\2\2Z[\7#\2\2[\\\5\6\4\2\\]\b\5\1\2]_"+
		"\3\2\2\2^M\3\2\2\2^V\3\2\2\2_\t\3\2\2\2`l\3\2\2\2ab\7$\2\2bh\b\6\1\2c"+
		"d\7\31\2\2de\7$\2\2eg\b\6\1\2fc\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"il\3\2\2\2jh\3\2\2\2k`\3\2\2\2ka\3\2\2\2l\13\3\2\2\2mn\7\13\2\2no\5\6"+
		"\4\2oq\7\f\2\2pr\7)\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\5\6\4\2tv\7)\2"+
		"\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2w\u0082\b\7\1\2xz\7\r\2\2y{\7)\2\2zy\3"+
		"\2\2\2z{\3\2\2\2{|\3\2\2\2|~\5\6\4\2}\177\7)\2\2~}\3\2\2\2~\177\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\b\7\1\2\u0081\u0083\3\2\2\2\u0082x\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\7\1\2\u0085"+
		"\r\3\2\2\2\u0086\u0087\7\16\2\2\u0087\u0088\5\6\4\2\u0088\u008a\7\17\2"+
		"\2\u0089\u008b\7)\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\5\6\4\2\u008d\u008e\b\b\1\2\u008e\17\3\2\2\2\u008f"+
		"\u0090\7\25\2\2\u0090\u0091\5\4\3\2\u0091\u0092\7\26\2\2\u0092\u0093\b"+
		"\t\1\2\u0093\21\3\2\2\2\u0094\u0095\5\24\13\2\u0095\u009c\b\n\1\2\u0096"+
		"\u0097\7\33\2\2\u0097\u0098\5\24\13\2\u0098\u0099\b\n\1\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\23\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\26\f"+
		"\2\u00a0\u00a7\b\13\1\2\u00a1\u00a2\7\34\2\2\u00a2\u00a3\5\26\f\2\u00a3"+
		"\u00a4\b\13\1\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00a9\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\25\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00c4\b\f\1\2\u00ac\u00ad\7"+
		"\35\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\b\f\1\2\u00af\u00c5\3\2\2\2\u00b0"+
		"\u00b1\7\36\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\b\f\1\2\u00b3\u00c5\3"+
		"\2\2\2\u00b4\u00b5\7 \2\2\u00b5\u00b6\5\30\r\2\u00b6\u00b7\b\f\1\2\u00b7"+
		"\u00c5\3\2\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\b"+
		"\f\1\2\u00bb\u00c5\3\2\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00be\5\30\r\2\u00be"+
		"\u00bf\b\f\1\2\u00bf\u00c5\3\2\2\2\u00c0\u00c1\7!\2\2\u00c1\u00c2\5\30"+
		"\r\2\u00c2\u00c3\b\f\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00ac\3\2\2\2\u00c4"+
		"\u00b0\3\2\2\2\u00c4\u00b4\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00bc\3\2"+
		"\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\27\3\2\2\2\u00c6\u00c7"+
		"\5\32\16\2\u00c7\u00d2\b\r\1\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\5\32\16"+
		"\2\u00ca\u00cb\b\r\1\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd\7\4\2\2\u00cd\u00ce"+
		"\5\32\16\2\u00ce\u00cf\b\r\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00c8\3\2\2\2"+
		"\u00d0\u00cc\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5\34\17\2\u00d6"+
		"\u00e9\b\16\1\2\u00d7\u00d8\7\5\2\2\u00d8\u00d9\5\34\17\2\u00d9\u00da"+
		"\b\16\1\2\u00da\u00e8\3\2\2\2\u00db\u00dc\7\6\2\2\u00dc\u00dd\5\34\17"+
		"\2\u00dd\u00de\b\16\1\2\u00de\u00e8\3\2\2\2\u00df\u00e0\7\7\2\2\u00e0"+
		"\u00e1\5\34\17\2\u00e1\u00e2\b\16\1\2\u00e2\u00e8\3\2\2\2\u00e3\u00e4"+
		"\7\b\2\2\u00e4\u00e5\5\34\17\2\u00e5\u00e6\b\16\1\2\u00e6\u00e8\3\2\2"+
		"\2\u00e7\u00d7\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e3"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\33\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\5\36\20\2\u00ed\u00ee\b\17"+
		"\1\2\u00ee\u00f6\3\2\2\2\u00ef\u00f0\5\36\20\2\u00f0\u00f1\7\21\2\2\u00f1"+
		"\u00f2\5 \21\2\u00f2\u00f3\7\22\2\2\u00f3\u00f4\b\17\1\2\u00f4\u00f6\3"+
		"\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6\35\3\2\2\2\u00f7"+
		"\u00f8\7\4\2\2\u00f8\u00f9\5\36\20\2\u00f9\u00fa\b\20\1\2\u00fa\u0116"+
		"\3\2\2\2\u00fb\u00fc\7\t\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\b\20\1"+
		"\2\u00fe\u0116\3\2\2\2\u00ff\u0100\5\"\22\2\u0100\u0101\b\20\1\2\u0101"+
		"\u0116\3\2\2\2\u0102\u0103\5$\23\2\u0103\u0104\b\20\1\2\u0104\u0116\3"+
		"\2\2\2\u0105\u0106\7(\2\2\u0106\u0116\b\20\1\2\u0107\u0108\7\'\2\2\u0108"+
		"\u0116\b\20\1\2\u0109\u010a\7$\2\2\u010a\u0116\b\20\1\2\u010b\u010c\7"+
		"\23\2\2\u010c\u010d\5 \21\2\u010d\u010e\7\24\2\2\u010e\u010f\b\20\1\2"+
		"\u010f\u0116\3\2\2\2\u0110\u0111\7\21\2\2\u0111\u0112\5\6\4\2\u0112\u0113"+
		"\7\22\2\2\u0113\u0114\b\20\1\2\u0114\u0116\3\2\2\2\u0115\u00f7\3\2\2\2"+
		"\u0115\u00fb\3\2\2\2\u0115\u00ff\3\2\2\2\u0115\u0102\3\2\2\2\u0115\u0105"+
		"\3\2\2\2\u0115\u0107\3\2\2\2\u0115\u0109\3\2\2\2\u0115\u010b\3\2\2\2\u0115"+
		"\u0110\3\2\2\2\u0116\37\3\2\2\2\u0117\u0124\3\2\2\2\u0118\u0119\5\6\4"+
		"\2\u0119\u0120\b\21\1\2\u011a\u011b\7\31\2\2\u011b\u011c\5\6\4\2\u011c"+
		"\u011d\b\21\1\2\u011d\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011f\u0122\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0117\3\2\2\2\u0123\u0118\3\2\2\2\u0124!\3\2\2\2"+
		"\u0125\u0126\7&\2\2\u0126\u012a\b\22\1\2\u0127\u0128\7%\2\2\u0128\u012a"+
		"\b\22\1\2\u0129\u0125\3\2\2\2\u0129\u0127\3\2\2\2\u012a#\3\2\2\2\u012b"+
		"\u012c\7\27\2\2\u012c\u0130\b\23\1\2\u012d\u012e\7\30\2\2\u012e\u0130"+
		"\b\23\1\2\u012f\u012b\3\2\2\2\u012f\u012d\3\2\2\2\u0130%\3\2\2\2\u0131"+
		"\u0134\5(\25\2\u0132\u0134\5$\23\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2"+
		"\2\2\u0134\'\3\2\2\2\u0135\u0136\t\3\2\2\u0136)\3\2\2\2\34\62\64K^hkq"+
		"uz~\u0082\u008a\u009c\u00a7\u00c4\u00d0\u00d2\u00e7\u00e9\u00f5\u0115"+
		"\u0120\u0123\u0129\u012f\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}