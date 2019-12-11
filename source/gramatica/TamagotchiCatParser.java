package source.gramatica;

// Generated from /home/gislaine/dsl-lfa-trabalho-final/source/gramatica/TamagotchiCat.g4 by ANTLR 4.7.1

//package source.gramatica;
import java.util.LinkedList;
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
		T__0=1, T__1=2, TipoInteger=3, TipoString=4, TipoFloat=5, TipoBoolean=6, 
		INT=7, FLOAT=8, BOOLEAN=9, ATRIBUICAO=10, IGUAL=11, MENORIGUAL=12, MAIORIGUAL=13, 
		DIFERENTE=14, MAIOR=15, MENOR=16, TERMINAL=17, LPAR=18, RPAR=19, LCOL=20, 
		RCOL=21, SOMA=22, SUB=23, DIV=24, MULT=25, ASP=26, IF=27, ELSE=28, WHILE=29, 
		PRINT=30, VARIAVEL=31, STRING=32, DEF_FUNCAO=33, CHAMADA_FUNCAO=34, NOME_FUNCAO=35, 
		VIRGULA=36, WS=37, SINGLE_STRING=38, DOUBLE_STRING=39, IDENTIFIER=40;
	public static final int
		RULE_prog = 0, RULE_bloco = 1, RULE_definicao = 2, RULE_expressao = 3, 
		RULE_operacoes = 4, RULE_expressao_simples = 5, RULE_atribuicao_valor = 6, 
		RULE_definicao_funcao = 7, RULE_chamada_funcao = 8, RULE_parametro_funcao = 9, 
		RULE_parametros_formal = 10, RULE_parametros_real = 11, RULE_funcao_print = 12, 
		RULE_expressao_condicional = 13, RULE_estrutura_repeticao = 14, RULE_id = 15, 
		RULE_condicao = 16, RULE_operadorcomparacao = 17, RULE_operador = 18, 
		RULE_tipagem = 19, RULE_valor = 20, RULE_primitive = 21, RULE_string = 22, 
		RULE_bool = 23;
	public static final String[] ruleNames = {
		"prog", "bloco", "definicao", "expressao", "operacoes", "expressao_simples", 
		"atribuicao_valor", "definicao_funcao", "chamada_funcao", "parametro_funcao", 
		"parametros_formal", "parametros_real", "funcao_print", "expressao_condicional", 
		"estrutura_repeticao", "id", "condicao", "operadorcomparacao", "operador", 
		"tipagem", "valor", "primitive", "string", "bool"
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
	public static class ProgContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			bloco();
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
		public Bloco result;
		public DefinicaoContext d;
		public ExpressaoContext e;
		public List<DefinicaoContext> definicao() {
			return getRuleContexts(DefinicaoContext.class);
		}
		public DefinicaoContext definicao(int i) {
			return getRuleContext(DefinicaoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);

		           ArrayList<Definicao> def = new ArrayList<>();
		           ArrayList<Expr> exp = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				((BlocoContext)_localctx).d = definicao();
				def.add(((BlocoContext)_localctx).d.result);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TipoInteger) | (1L << TipoString) | (1L << TipoFloat) | (1L << TipoBoolean))) != 0) );
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << CHAMADA_FUNCAO))) != 0)) {
				{
				{
				setState(57);
				((BlocoContext)_localctx).e = expressao();
				exp.add(((BlocoContext)_localctx).e.result);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((BlocoContext)_localctx).result =  new Bloco(def,exp);
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

	public static class DefinicaoContext extends ParserRuleContext {
		public Definicao result;
		public TipagemContext t;
		public Token var;
		public IdContext value;
		public IdContext id;
		public TerminalNode TERMINAL() { return getToken(TamagotchiCatParser.TERMINAL, 0); }
		public TipagemContext tipagem() {
			return getRuleContext(TipagemContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(TamagotchiCatParser.VARIAVEL, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(TamagotchiCatParser.ATRIBUICAO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicao);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(67);
				((DefinicaoContext)_localctx).t = tipagem();
				setState(68);
				((DefinicaoContext)_localctx).var = match(VARIAVEL);
				setState(69);
				match(TERMINAL);
				}
				((DefinicaoContext)_localctx).result =  new Definicao(((DefinicaoContext)_localctx).t.result,(((DefinicaoContext)_localctx).var!=null?((DefinicaoContext)_localctx).var.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(73);
				((DefinicaoContext)_localctx).t = tipagem();
				setState(74);
				((DefinicaoContext)_localctx).var = match(VARIAVEL);
				setState(75);
				match(ATRIBUICAO);
				setState(76);
				((DefinicaoContext)_localctx).value = ((DefinicaoContext)_localctx).id = id();
				setState(77);
				match(TERMINAL);
				}
				((DefinicaoContext)_localctx).result =  new Definicao(((DefinicaoContext)_localctx).t.result,(((DefinicaoContext)_localctx).var!=null?((DefinicaoContext)_localctx).var.getText():null),((DefinicaoContext)_localctx).id.result);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Expr result;
		public Expressao_condicionalContext ec;
		public Funcao_printContext p;
		public Estrutura_repeticaoContext er;
		public Definicao_funcaoContext d;
		public Chamada_funcaoContext c;
		public Expressao_simplesContext e;
		public Atribuicao_valorContext a;
		public Expressao_condicionalContext expressao_condicional() {
			return getRuleContext(Expressao_condicionalContext.class,0);
		}
		public Funcao_printContext funcao_print() {
			return getRuleContext(Funcao_printContext.class,0);
		}
		public Estrutura_repeticaoContext estrutura_repeticao() {
			return getRuleContext(Estrutura_repeticaoContext.class,0);
		}
		public Definicao_funcaoContext definicao_funcao() {
			return getRuleContext(Definicao_funcaoContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public Expressao_simplesContext expressao_simples() {
			return getRuleContext(Expressao_simplesContext.class,0);
		}
		public Atribuicao_valorContext atribuicao_valor() {
			return getRuleContext(Atribuicao_valorContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressao);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((ExpressaoContext)_localctx).ec = expressao_condicional();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).ec.result;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((ExpressaoContext)_localctx).p = funcao_print();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).p.result;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((ExpressaoContext)_localctx).er = estrutura_repeticao();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).er.result;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				((ExpressaoContext)_localctx).d = definicao_funcao();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).d.result;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				((ExpressaoContext)_localctx).c = chamada_funcao();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).c.result;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				((ExpressaoContext)_localctx).e = expressao_simples();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).e.result;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				((ExpressaoContext)_localctx).a = atribuicao_valor();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).a.result;
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

	public static class OperacoesContext extends ParserRuleContext {
		public Operacoes result;
		public OperadorContext op;
		public IdContext v;
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OperacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacoes; }
	}

	public final OperacoesContext operacoes() throws RecognitionException {
		OperacoesContext _localctx = new OperacoesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operacoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((OperacoesContext)_localctx).op = operador();
			setState(107);
			((OperacoesContext)_localctx).v = id();
			((OperacoesContext)_localctx).result =  new Operacoes(((OperacoesContext)_localctx).op.result,((OperacoesContext)_localctx).v.result);
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

	public static class Expressao_simplesContext extends ParserRuleContext {
		public ExprSmp result;
		public IdContext i;
		public OperacoesContext op;
		public TerminalNode TERMINAL() { return getToken(TamagotchiCatParser.TERMINAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<OperacoesContext> operacoes() {
			return getRuleContexts(OperacoesContext.class);
		}
		public OperacoesContext operacoes(int i) {
			return getRuleContext(OperacoesContext.class,i);
		}
		public Expressao_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_simples; }
	}

	public final Expressao_simplesContext expressao_simples() throws RecognitionException {
		Expressao_simplesContext _localctx = new Expressao_simplesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressao_simples);

		           ArrayList<Operacoes> sttList = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((Expressao_simplesContext)_localctx).i = id();
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				((Expressao_simplesContext)_localctx).op = operacoes();
				sttList.add(((Expressao_simplesContext)_localctx).op.result);
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0) );
			setState(118);
			match(TERMINAL);
			((Expressao_simplesContext)_localctx).result =  new ExprSmp(((Expressao_simplesContext)_localctx).i.result,sttList);
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

	public static class Atribuicao_valorContext extends ParserRuleContext {
		public AtribuicaoValor result;
		public Token var;
		public IdContext val;
		public Expressao_simplesContext exp;
		public TerminalNode ATRIBUICAO() { return getToken(TamagotchiCatParser.ATRIBUICAO, 0); }
		public TerminalNode TERMINAL() { return getToken(TamagotchiCatParser.TERMINAL, 0); }
		public TerminalNode VARIAVEL() { return getToken(TamagotchiCatParser.VARIAVEL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expressao_simplesContext expressao_simples() {
			return getRuleContext(Expressao_simplesContext.class,0);
		}
		public Atribuicao_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_valor; }
	}

	public final Atribuicao_valorContext atribuicao_valor() throws RecognitionException {
		Atribuicao_valorContext _localctx = new Atribuicao_valorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribuicao_valor);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((Atribuicao_valorContext)_localctx).var = match(VARIAVEL);
				setState(122);
				match(ATRIBUICAO);
				setState(123);
				((Atribuicao_valorContext)_localctx).val = id();
				setState(124);
				match(TERMINAL);
				((Atribuicao_valorContext)_localctx).result =  new AtribuicaoValor((((Atribuicao_valorContext)_localctx).var!=null?((Atribuicao_valorContext)_localctx).var.getText():null),((Atribuicao_valorContext)_localctx).val.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((Atribuicao_valorContext)_localctx).var = match(VARIAVEL);
				setState(128);
				match(ATRIBUICAO);
				setState(129);
				((Atribuicao_valorContext)_localctx).exp = expressao_simples();
				((Atribuicao_valorContext)_localctx).result =  new AtribuicaoValor((((Atribuicao_valorContext)_localctx).var!=null?((Atribuicao_valorContext)_localctx).var.getText():null),((Atribuicao_valorContext)_localctx).exp.result);
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

	public static class Definicao_funcaoContext extends ParserRuleContext {
		public DefFunc result;
		public Token n;
		public Parametros_formalContext p;
		public BlocoContext b;
		public TerminalNode DEF_FUNCAO() { return getToken(TamagotchiCatParser.DEF_FUNCAO, 0); }
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public TerminalNode LCOL() { return getToken(TamagotchiCatParser.LCOL, 0); }
		public TerminalNode RCOL() { return getToken(TamagotchiCatParser.RCOL, 0); }
		public TerminalNode NOME_FUNCAO() { return getToken(TamagotchiCatParser.NOME_FUNCAO, 0); }
		public Parametros_formalContext parametros_formal() {
			return getRuleContext(Parametros_formalContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Definicao_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao_funcao; }
	}

	public final Definicao_funcaoContext definicao_funcao() throws RecognitionException {
		Definicao_funcaoContext _localctx = new Definicao_funcaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definicao_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DEF_FUNCAO);
			setState(135);
			((Definicao_funcaoContext)_localctx).n = match(NOME_FUNCAO);
			setState(136);
			match(LPAR);
			setState(137);
			((Definicao_funcaoContext)_localctx).p = parametros_formal();
			setState(138);
			match(RPAR);
			setState(139);
			match(LCOL);
			setState(140);
			((Definicao_funcaoContext)_localctx).b = bloco();
			setState(141);
			match(RCOL);
			((Definicao_funcaoContext)_localctx).result =  new DefFunc((((Definicao_funcaoContext)_localctx).n!=null?((Definicao_funcaoContext)_localctx).n.getText():null), ((Definicao_funcaoContext)_localctx).p.args, ((Definicao_funcaoContext)_localctx).b.result);
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

	public static class Chamada_funcaoContext extends ParserRuleContext {
		public ChamadaFuncao result;
		public Token n;
		public Parametros_realContext p;
		public TerminalNode CHAMADA_FUNCAO() { return getToken(TamagotchiCatParser.CHAMADA_FUNCAO, 0); }
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public TerminalNode TERMINAL() { return getToken(TamagotchiCatParser.TERMINAL, 0); }
		public TerminalNode NOME_FUNCAO() { return getToken(TamagotchiCatParser.NOME_FUNCAO, 0); }
		public Parametros_realContext parametros_real() {
			return getRuleContext(Parametros_realContext.class,0);
		}
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chamada_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(CHAMADA_FUNCAO);
			setState(145);
			((Chamada_funcaoContext)_localctx).n = match(NOME_FUNCAO);
			setState(146);
			match(LPAR);
			setState(147);
			((Chamada_funcaoContext)_localctx).p = parametros_real();
			setState(148);
			match(RPAR);
			setState(149);
			match(TERMINAL);
			((Chamada_funcaoContext)_localctx).result =  new ChamadaFuncao((((Chamada_funcaoContext)_localctx).n!=null?((Chamada_funcaoContext)_localctx).n.getText():null), ((Chamada_funcaoContext)_localctx).p.args);
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

	public static class Parametro_funcaoContext extends ParserRuleContext {
		public Definicao result;
		public TipagemContext t;
		public Token var;
		public TipagemContext tipagem() {
			return getRuleContext(TipagemContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(TamagotchiCatParser.VARIAVEL, 0); }
		public Parametro_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro_funcao; }
	}

	public final Parametro_funcaoContext parametro_funcao() throws RecognitionException {
		Parametro_funcaoContext _localctx = new Parametro_funcaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametro_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((Parametro_funcaoContext)_localctx).t = tipagem();
			setState(153);
			((Parametro_funcaoContext)_localctx).var = match(VARIAVEL);
			((Parametro_funcaoContext)_localctx).result =  new Definicao(((Parametro_funcaoContext)_localctx).t.result, (((Parametro_funcaoContext)_localctx).var!=null?((Parametro_funcaoContext)_localctx).var.getText():null));
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

	public static class Parametros_formalContext extends ParserRuleContext {
		public List<Definicao> args;
		public Parametro_funcaoContext parametro_funcao;
		public List<Parametro_funcaoContext> parametro_funcao() {
			return getRuleContexts(Parametro_funcaoContext.class);
		}
		public Parametro_funcaoContext parametro_funcao(int i) {
			return getRuleContext(Parametro_funcaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(TamagotchiCatParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(TamagotchiCatParser.VIRGULA, i);
		}
		public Parametros_formalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_formal; }
	}

	public final Parametros_formalContext parametros_formal() throws RecognitionException {
		Parametros_formalContext _localctx = new Parametros_formalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametros_formal);

		    ((Parametros_formalContext)_localctx).args =  new LinkedList<Definicao>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TipoInteger) | (1L << TipoString) | (1L << TipoFloat) | (1L << TipoBoolean))) != 0)) {
				{
				setState(156);
				((Parametros_formalContext)_localctx).parametro_funcao = parametro_funcao();
				_localctx.args.add(((Parametros_formalContext)_localctx).parametro_funcao.result);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(158);
					match(VIRGULA);
					setState(159);
					((Parametros_formalContext)_localctx).parametro_funcao = parametro_funcao();
					_localctx.args.add(((Parametros_formalContext)_localctx).parametro_funcao.result);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Parametros_realContext extends ParserRuleContext {
		public List<Id> args;
		public IdContext id;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(TamagotchiCatParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(TamagotchiCatParser.VIRGULA, i);
		}
		public Parametros_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_real; }
	}

	public final Parametros_realContext parametros_real() throws RecognitionException {
		Parametros_realContext _localctx = new Parametros_realContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametros_real);

		    ((Parametros_realContext)_localctx).args =  new LinkedList<Id>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << VARIAVEL) | (1L << STRING))) != 0)) {
				{
				setState(169);
				((Parametros_realContext)_localctx).id = id();
				_localctx.args.add(((Parametros_realContext)_localctx).id.result);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(171);
					match(VIRGULA);
					setState(172);
					((Parametros_realContext)_localctx).id = id();
					_localctx.args.add(((Parametros_realContext)_localctx).id.result);
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Funcao_printContext extends ParserRuleContext {
		public FuncaoPrint result;
		public IdContext i;
		public TerminalNode PRINT() { return getToken(TamagotchiCatParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public TerminalNode TERMINAL() { return getToken(TamagotchiCatParser.TERMINAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Funcao_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_print; }
	}

	public final Funcao_printContext funcao_print() throws RecognitionException {
		Funcao_printContext _localctx = new Funcao_printContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcao_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(PRINT);
			setState(183);
			match(LPAR);
			setState(184);
			((Funcao_printContext)_localctx).i = id();
			setState(185);
			match(RPAR);
			setState(186);
			match(TERMINAL);
			((Funcao_printContext)_localctx).result =  new FuncaoPrint(((Funcao_printContext)_localctx).i.result);
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

	public static class Expressao_condicionalContext extends ParserRuleContext {
		public If result;
		public CondicaoContext c;
		public ExpressaoContext i;
		public ExpressaoContext e;
		public TerminalNode IF() { return getToken(TamagotchiCatParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public List<TerminalNode> LCOL() { return getTokens(TamagotchiCatParser.LCOL); }
		public TerminalNode LCOL(int i) {
			return getToken(TamagotchiCatParser.LCOL, i);
		}
		public List<TerminalNode> RCOL() { return getTokens(TamagotchiCatParser.RCOL); }
		public TerminalNode RCOL(int i) {
			return getToken(TamagotchiCatParser.RCOL, i);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(TamagotchiCatParser.ELSE, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Expressao_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_condicional; }
	}

	public final Expressao_condicionalContext expressao_condicional() throws RecognitionException {
		Expressao_condicionalContext _localctx = new Expressao_condicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressao_condicional);

		           ArrayList<Expr> If = new ArrayList<>();
		           ArrayList<Expr> Else = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IF);
			setState(190);
			match(LPAR);
			setState(191);
			((Expressao_condicionalContext)_localctx).c = condicao();
			setState(192);
			match(RPAR);
			setState(193);
			match(LCOL);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				((Expressao_condicionalContext)_localctx).i = expressao();
				If.add(((Expressao_condicionalContext)_localctx).i.result);
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << CHAMADA_FUNCAO))) != 0) );
			setState(201);
			match(RCOL);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(202);
				match(ELSE);
				setState(203);
				match(LCOL);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(204);
					((Expressao_condicionalContext)_localctx).e = expressao();
					Else.add(((Expressao_condicionalContext)_localctx).e.result);
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << CHAMADA_FUNCAO))) != 0) );
				setState(211);
				match(RCOL);
				}
			}

			((Expressao_condicionalContext)_localctx).result =  new If(((Expressao_condicionalContext)_localctx).c.result, If, Else);
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

	public static class Estrutura_repeticaoContext extends ParserRuleContext {
		public While result;
		public CondicaoContext c;
		public ExpressaoContext e;
		public TerminalNode WHILE() { return getToken(TamagotchiCatParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(TamagotchiCatParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TamagotchiCatParser.RPAR, 0); }
		public TerminalNode LCOL() { return getToken(TamagotchiCatParser.LCOL, 0); }
		public TerminalNode RCOL() { return getToken(TamagotchiCatParser.RCOL, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Estrutura_repeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura_repeticao; }
	}

	public final Estrutura_repeticaoContext estrutura_repeticao() throws RecognitionException {
		Estrutura_repeticaoContext _localctx = new Estrutura_repeticaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_estrutura_repeticao);

		           ArrayList<Expr> expr = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(WHILE);
			setState(218);
			match(LPAR);
			setState(219);
			((Estrutura_repeticaoContext)_localctx).c = condicao();
			setState(220);
			match(RPAR);
			setState(221);
			match(LCOL);
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				((Estrutura_repeticaoContext)_localctx).e = expressao();
				expr.add(((Estrutura_repeticaoContext)_localctx).e.result);
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << CHAMADA_FUNCAO))) != 0) );
			setState(229);
			match(RCOL);
			((Estrutura_repeticaoContext)_localctx).result =  new While(((Estrutura_repeticaoContext)_localctx).c.result, expr);
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

	public static class IdContext extends ParserRuleContext {
		public Id result;
		public Token VARIAVEL;
		public ValorContext valor;
		public TerminalNode VARIAVEL() { return getToken(TamagotchiCatParser.VARIAVEL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_id);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				((IdContext)_localctx).VARIAVEL = match(VARIAVEL);
				((IdContext)_localctx).result = new Id ((((IdContext)_localctx).VARIAVEL!=null?((IdContext)_localctx).VARIAVEL.getText():null));
				}
				break;
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				((IdContext)_localctx).valor = valor();
				((IdContext)_localctx).result = new Id (((IdContext)_localctx).valor.result);
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

	public static class CondicaoContext extends ParserRuleContext {
		public Condicao result;
		public Token var;
		public OperadorcomparacaoContext opc;
		public ValorContext val;
		public TerminalNode VARIAVEL() { return getToken(TamagotchiCatParser.VARIAVEL, 0); }
		public OperadorcomparacaoContext operadorcomparacao() {
			return getRuleContext(OperadorcomparacaoContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(239);
			((CondicaoContext)_localctx).var = match(VARIAVEL);
			setState(240);
			((CondicaoContext)_localctx).opc = operadorcomparacao();
			setState(241);
			((CondicaoContext)_localctx).val = valor();
			}
			((CondicaoContext)_localctx).result =   new Condicao((((CondicaoContext)_localctx).var!=null?((CondicaoContext)_localctx).var.getText():null), ((CondicaoContext)_localctx).opc.result, ((CondicaoContext)_localctx).val.result);
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

	public static class OperadorcomparacaoContext extends ParserRuleContext {
		public OperadorComparacao result;
		public Token i;
		public Token d;
		public Token maior;
		public Token menor;
		public Token menorIgual;
		public Token maiorIgual;
		public TerminalNode IGUAL() { return getToken(TamagotchiCatParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(TamagotchiCatParser.DIFERENTE, 0); }
		public TerminalNode MAIOR() { return getToken(TamagotchiCatParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(TamagotchiCatParser.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(TamagotchiCatParser.MENORIGUAL, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(TamagotchiCatParser.MAIORIGUAL, 0); }
		public OperadorcomparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorcomparacao; }
	}

	public final OperadorcomparacaoContext operadorcomparacao() throws RecognitionException {
		OperadorcomparacaoContext _localctx = new OperadorcomparacaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operadorcomparacao);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				((OperadorcomparacaoContext)_localctx).i = match(IGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).i!=null?((OperadorcomparacaoContext)_localctx).i.getText():null));
				}
				break;
			case DIFERENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				((OperadorcomparacaoContext)_localctx).d = match(DIFERENTE);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).d!=null?((OperadorcomparacaoContext)_localctx).d.getText():null));
				}
				break;
			case MAIOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				((OperadorcomparacaoContext)_localctx).maior = match(MAIOR);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).maior!=null?((OperadorcomparacaoContext)_localctx).maior.getText():null));
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				((OperadorcomparacaoContext)_localctx).menor = match(MENOR);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).menor!=null?((OperadorcomparacaoContext)_localctx).menor.getText():null));
				}
				break;
			case MENORIGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				((OperadorcomparacaoContext)_localctx).menorIgual = match(MENORIGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).menorIgual!=null?((OperadorcomparacaoContext)_localctx).menorIgual.getText():null));
				}
				break;
			case MAIORIGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				((OperadorcomparacaoContext)_localctx).maiorIgual = match(MAIORIGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).maiorIgual!=null?((OperadorcomparacaoContext)_localctx).maiorIgual.getText():null));
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

	public static class OperadorContext extends ParserRuleContext {
		public Operador result;
		public Token s;
		public Token sub;
		public Token d;
		public Token m;
		public TerminalNode SOMA() { return getToken(TamagotchiCatParser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(TamagotchiCatParser.SUB, 0); }
		public TerminalNode DIV() { return getToken(TamagotchiCatParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(TamagotchiCatParser.MULT, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operador);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				((OperadorContext)_localctx).s = match(SOMA);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).s!=null?((OperadorContext)_localctx).s.getText():null));
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				((OperadorContext)_localctx).sub = match(SUB);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).sub!=null?((OperadorContext)_localctx).sub.getText():null));
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				((OperadorContext)_localctx).d = match(DIV);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).d!=null?((OperadorContext)_localctx).d.getText():null));
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				((OperadorContext)_localctx).m = match(MULT);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).m!=null?((OperadorContext)_localctx).m.getText():null));
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

	public static class TipagemContext extends ParserRuleContext {
		public Tipagem result;
		public Token tipo_integer;
		public Token tipo_string;
		public Token tipo_float;
		public Token tipo_boolean;
		public TerminalNode TipoInteger() { return getToken(TamagotchiCatParser.TipoInteger, 0); }
		public TerminalNode TipoString() { return getToken(TamagotchiCatParser.TipoString, 0); }
		public TerminalNode TipoFloat() { return getToken(TamagotchiCatParser.TipoFloat, 0); }
		public TerminalNode TipoBoolean() { return getToken(TamagotchiCatParser.TipoBoolean, 0); }
		public TipagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipagem; }
	}

	public final TipagemContext tipagem() throws RecognitionException {
		TipagemContext _localctx = new TipagemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tipagem);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TipoInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				((TipagemContext)_localctx).tipo_integer = match(TipoInteger);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_integer!=null?((TipagemContext)_localctx).tipo_integer.getText():null));
				}
				break;
			case TipoString:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				((TipagemContext)_localctx).tipo_string = match(TipoString);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_string!=null?((TipagemContext)_localctx).tipo_string.getText():null));
				}
				break;
			case TipoFloat:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				((TipagemContext)_localctx).tipo_float = match(TipoFloat);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_float!=null?((TipagemContext)_localctx).tipo_float.getText():null));
				}
				break;
			case TipoBoolean:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				((TipagemContext)_localctx).tipo_boolean = match(TipoBoolean);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_boolean!=null?((TipagemContext)_localctx).tipo_boolean.getText():null));
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

	public static class ValorContext extends ParserRuleContext {
		public Valor result;
		public Token i;
		public Token s;
		public Token f;
		public Token b;
		public TerminalNode INT() { return getToken(TamagotchiCatParser.INT, 0); }
		public TerminalNode STRING() { return getToken(TamagotchiCatParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(TamagotchiCatParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(TamagotchiCatParser.BOOLEAN, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valor);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				((ValorContext)_localctx).i = match(INT);
				((ValorContext)_localctx).result =  new Valor(Integer.parseInt((((ValorContext)_localctx).i!=null?((ValorContext)_localctx).i.getText():null)));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				((ValorContext)_localctx).s = match(STRING);
				((ValorContext)_localctx).result =  new Valor((((ValorContext)_localctx).s!=null?((ValorContext)_localctx).s.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				((ValorContext)_localctx).f = match(FLOAT);
				((ValorContext)_localctx).result =  new Valor(Float.parseFloat((((ValorContext)_localctx).f!=null?((ValorContext)_localctx).f.getText():null)));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				((ValorContext)_localctx).b = match(BOOLEAN);
				((ValorContext)_localctx).result =  new Valor(Boolean.parseBoolean((((ValorContext)_localctx).b!=null?((ValorContext)_localctx).b.getText():null)));
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
		enterRule(_localctx, 42, RULE_primitive);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_STRING:
			case DOUBLE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				string();
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
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
		enterRule(_localctx, 44, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\3\6\38\n\3\r\3\16\39\3\3\3\3\3\3\7\3?\n\3\f\3\16\3"+
		"B\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\6\7"+
		"u\n\7\r\7\16\7v\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0087\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a5"+
		"\n\f\f\f\16\f\u00a8\13\f\5\f\u00aa\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b2"+
		"\n\r\f\r\16\r\u00b5\13\r\5\r\u00b7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00c8\n\17\r\17\16\17"+
		"\u00c9\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00d2\n\17\r\17\16\17\u00d3"+
		"\3\17\3\17\5\17\u00d8\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\6\20\u00e4\n\20\r\20\16\20\u00e5\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00f0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0104\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010e\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0118\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0122\n\26\3\27\3\27\5\27\u0126\n\27\3\30\3\30\3\31\3\31\3\31\2"+
		"\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\3\2()\3\2"+
		"\3\4\2\u0136\2\62\3\2\2\2\4\67\3\2\2\2\6S\3\2\2\2\bj\3\2\2\2\nl\3\2\2"+
		"\2\fp\3\2\2\2\16\u0086\3\2\2\2\20\u0088\3\2\2\2\22\u0092\3\2\2\2\24\u009a"+
		"\3\2\2\2\26\u00a9\3\2\2\2\30\u00b6\3\2\2\2\32\u00b8\3\2\2\2\34\u00bf\3"+
		"\2\2\2\36\u00db\3\2\2\2 \u00ef\3\2\2\2\"\u00f1\3\2\2\2$\u0103\3\2\2\2"+
		"&\u010d\3\2\2\2(\u0117\3\2\2\2*\u0121\3\2\2\2,\u0125\3\2\2\2.\u0127\3"+
		"\2\2\2\60\u0129\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64\65\5\6\4\2\65\66"+
		"\b\3\1\2\668\3\2\2\2\67\64\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:@\3"+
		"\2\2\2;<\5\b\5\2<=\b\3\1\2=?\3\2\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3"+
		"\2\2\2AC\3\2\2\2B@\3\2\2\2CD\b\3\1\2D\5\3\2\2\2EF\5(\25\2FG\7!\2\2GH\7"+
		"\23\2\2HI\3\2\2\2IJ\b\4\1\2JT\3\2\2\2KL\5(\25\2LM\7!\2\2MN\7\f\2\2NO\5"+
		" \21\2OP\7\23\2\2PQ\3\2\2\2QR\b\4\1\2RT\3\2\2\2SE\3\2\2\2SK\3\2\2\2T\7"+
		"\3\2\2\2UV\5\34\17\2VW\b\5\1\2Wk\3\2\2\2XY\5\32\16\2YZ\b\5\1\2Zk\3\2\2"+
		"\2[\\\5\36\20\2\\]\b\5\1\2]k\3\2\2\2^_\5\20\t\2_`\b\5\1\2`k\3\2\2\2ab"+
		"\5\22\n\2bc\b\5\1\2ck\3\2\2\2de\5\f\7\2ef\b\5\1\2fk\3\2\2\2gh\5\16\b\2"+
		"hi\b\5\1\2ik\3\2\2\2jU\3\2\2\2jX\3\2\2\2j[\3\2\2\2j^\3\2\2\2ja\3\2\2\2"+
		"jd\3\2\2\2jg\3\2\2\2k\t\3\2\2\2lm\5&\24\2mn\5 \21\2no\b\6\1\2o\13\3\2"+
		"\2\2pt\5 \21\2qr\5\n\6\2rs\b\7\1\2su\3\2\2\2tq\3\2\2\2uv\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wx\3\2\2\2xy\7\23\2\2yz\b\7\1\2z\r\3\2\2\2{|\7!\2\2|}\7"+
		"\f\2\2}~\5 \21\2~\177\7\23\2\2\177\u0080\b\b\1\2\u0080\u0087\3\2\2\2\u0081"+
		"\u0082\7!\2\2\u0082\u0083\7\f\2\2\u0083\u0084\5\f\7\2\u0084\u0085\b\b"+
		"\1\2\u0085\u0087\3\2\2\2\u0086{\3\2\2\2\u0086\u0081\3\2\2\2\u0087\17\3"+
		"\2\2\2\u0088\u0089\7#\2\2\u0089\u008a\7%\2\2\u008a\u008b\7\24\2\2\u008b"+
		"\u008c\5\26\f\2\u008c\u008d\7\25\2\2\u008d\u008e\7\26\2\2\u008e\u008f"+
		"\5\4\3\2\u008f\u0090\7\27\2\2\u0090\u0091\b\t\1\2\u0091\21\3\2\2\2\u0092"+
		"\u0093\7$\2\2\u0093\u0094\7%\2\2\u0094\u0095\7\24\2\2\u0095\u0096\5\30"+
		"\r\2\u0096\u0097\7\25\2\2\u0097\u0098\7\23\2\2\u0098\u0099\b\n\1\2\u0099"+
		"\23\3\2\2\2\u009a\u009b\5(\25\2\u009b\u009c\7!\2\2\u009c\u009d\b\13\1"+
		"\2\u009d\25\3\2\2\2\u009e\u009f\5\24\13\2\u009f\u00a6\b\f\1\2\u00a0\u00a1"+
		"\7&\2\2\u00a1\u00a2\5\24\13\2\u00a2\u00a3\b\f\1\2\u00a3\u00a5\3\2\2\2"+
		"\u00a4\u00a0\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u009e\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00ac\5 \21\2\u00ac\u00b3\b\r\1"+
		"\2\u00ad\u00ae\7&\2\2\u00ae\u00af\5 \21\2\u00af\u00b0\b\r\1\2\u00b0\u00b2"+
		"\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ab\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00b9\7 \2\2\u00b9\u00ba"+
		"\7\24\2\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd\7\23\2"+
		"\2\u00bd\u00be\b\16\1\2\u00be\33\3\2\2\2\u00bf\u00c0\7\35\2\2\u00c0\u00c1"+
		"\7\24\2\2\u00c1\u00c2\5\"\22\2\u00c2\u00c3\7\25\2\2\u00c3\u00c7\7\26\2"+
		"\2\u00c4\u00c5\5\b\5\2\u00c5\u00c6\b\17\1\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d7\7\27\2\2\u00cc\u00cd\7\36\2\2\u00cd"+
		"\u00d1\7\26\2\2\u00ce\u00cf\5\b\5\2\u00cf\u00d0\b\17\1\2\u00d0\u00d2\3"+
		"\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\27\2\2\u00d6\u00d8\3"+
		"\2\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\b\17\1\2\u00da\35\3\2\2\2\u00db\u00dc\7\37\2\2\u00dc\u00dd\7\24"+
		"\2\2\u00dd\u00de\5\"\22\2\u00de\u00df\7\25\2\2\u00df\u00e3\7\26\2\2\u00e0"+
		"\u00e1\5\b\5\2\u00e1\u00e2\b\20\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00e0\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\7\27\2\2\u00e8\u00e9\b\20\1\2\u00e9\37\3\2"+
		"\2\2\u00ea\u00eb\7!\2\2\u00eb\u00f0\b\21\1\2\u00ec\u00ed\5*\26\2\u00ed"+
		"\u00ee\b\21\1\2\u00ee\u00f0\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00ec\3"+
		"\2\2\2\u00f0!\3\2\2\2\u00f1\u00f2\7!\2\2\u00f2\u00f3\5$\23\2\u00f3\u00f4"+
		"\5*\26\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\22\1\2\u00f6#\3\2\2\2\u00f7"+
		"\u00f8\7\r\2\2\u00f8\u0104\b\23\1\2\u00f9\u00fa\7\20\2\2\u00fa\u0104\b"+
		"\23\1\2\u00fb\u00fc\7\21\2\2\u00fc\u0104\b\23\1\2\u00fd\u00fe\7\22\2\2"+
		"\u00fe\u0104\b\23\1\2\u00ff\u0100\7\16\2\2\u0100\u0104\b\23\1\2\u0101"+
		"\u0102\7\17\2\2\u0102\u0104\b\23\1\2\u0103\u00f7\3\2\2\2\u0103\u00f9\3"+
		"\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00ff\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104%\3\2\2\2\u0105\u0106\7\30\2\2\u0106\u010e\b\24\1"+
		"\2\u0107\u0108\7\31\2\2\u0108\u010e\b\24\1\2\u0109\u010a\7\32\2\2\u010a"+
		"\u010e\b\24\1\2\u010b\u010c\7\33\2\2\u010c\u010e\b\24\1\2\u010d\u0105"+
		"\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\'\3\2\2\2\u010f\u0110\7\5\2\2\u0110\u0118\b\25\1\2\u0111\u0112\7\6\2"+
		"\2\u0112\u0118\b\25\1\2\u0113\u0114\7\7\2\2\u0114\u0118\b\25\1\2\u0115"+
		"\u0116\7\b\2\2\u0116\u0118\b\25\1\2\u0117\u010f\3\2\2\2\u0117\u0111\3"+
		"\2\2\2\u0117\u0113\3\2\2\2\u0117\u0115\3\2\2\2\u0118)\3\2\2\2\u0119\u011a"+
		"\7\t\2\2\u011a\u0122\b\26\1\2\u011b\u011c\7\"\2\2\u011c\u0122\b\26\1\2"+
		"\u011d\u011e\7\n\2\2\u011e\u0122\b\26\1\2\u011f\u0120\7\13\2\2\u0120\u0122"+
		"\b\26\1\2\u0121\u0119\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011d\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0122+\3\2\2\2\u0123\u0126\5.\30\2\u0124\u0126\5"+
		"\60\31\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126-\3\2\2\2\u0127"+
		"\u0128\t\2\2\2\u0128/\3\2\2\2\u0129\u012a\t\3\2\2\u012a\61\3\2\2\2\26"+
		"9@Sjv\u0086\u00a6\u00a9\u00b3\u00b6\u00c9\u00d3\u00d7\u00e5\u00ef\u0103"+
		"\u010d\u0117\u0121\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}