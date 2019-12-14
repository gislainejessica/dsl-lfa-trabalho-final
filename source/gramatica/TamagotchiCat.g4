grammar TamagotchiCat;

@header {
package source.gramatica;
import source.ast.*;
}

programa returns [Expr result]
  : catlive=exprSeq    {$result = Block.from($catlive.exprs);}
;

exprSeq returns [List<Expr> exprs]
  @init {$exprs= new LinkedList<Expr>();}
    : (expr     (SEMI | NL) {$exprs.add($expr.result);}
    | (SEMI | NL)
      )* 
;

expr returns [Expr result]
  : CARACTERE RECEBE e1=expr  {$result = new Assign($CARACTERE.text, $e1.result);}
  | selecao                   {$result = $selecao.result;}
  | repeticao                 {$result = $repeticao.result;}
  | bloco                     {$result = $bloco.result;}
  | condicionais              {$result = $condicionais.result;}
  | fundecl                   {$result = $fundecl.result;}
;

fundecl returns [Expr result]
  : FUNC CARACTERE LPAR argumentos RPAR RECEBE expr
    {$result = new FunDecl($CARACTERE.text, $argumentos.args, $expr.result);}
;

argumentos returns [List<String> args]
  @init {$args = new ArrayList<>();}
    : /* nada */
    | CARACTERE           {$args.add($CARACTERE.text);}
      (VIRGULA CARACTERE  {$args.add($CARACTERE.text);})*
;

selecao returns [Expr result]
  @init {List<GuardedExpr> gs = new LinkedList<>();}
    : IF c1=expr STARTBLOCK NL? t1=expr ENDBLOCK NL? 
        {gs.add(new GuardedExpr($c1.result, $t1.result));} 
    |  (ELSE NL? t3=expr NL? 
        {gs.add(new GuardedExpr(Bool.VERDADE, $t3.result));}
      )?
      ENDBLOCK
        {$result = new Cond(gs);}
;

repeticao returns [Expr result]
  : WHILE e1=expr bloco 
    {$result = new While($e1.result, $bloco.result);}
;

bloco returns [Expr result]
  : STARTBLOCK exprSeq ENDBLOCK {$result = Block.from($exprSeq.exprs);}
;

condicionais returns [Expr result]
  : addExpr               {$result = $addExpr.result;}
    |E addExpr            {$result = new FunCall(Ops.AND, $result, $addExpr.result);}
    |IGUAL addExpr        {$result = new FunCall(Ops.IGUAL, $result, $addExpr.result;}
    |DIFF addExpr         {$result = new FunCall(Ops.DIFF, $result, $addExpr.result);}
    |MAIOR addExpr        {$result = new FunCall(Ops.MAIOR, $result, $addExpr.result);}
    |MENOR addExpr        {$result = new FunCall(Ops.MENOR, $result, $addExpr.result);}
    |MAIORIGUAL addExpr   {$result = new FunCall(Ops.MAIORIGUAL, $result, $addExpr.result);}
    |MENORIGUAL addExpr   {$result = new FunCall(Ops.MENORIGUAL, $result, $addExpr.result);}
;
    
addExpr returns [Expr result] 
  : multExpr       {$result = $multExpr.result;}
    ('+' multExpr  {$result = new FunCall(Ops.PLUS, $result, $multExpr.result);}
    |'-' multExpr  {$result = new FunCall(Ops.MINUS, $result, $multExpr.result);})*
;

multExpr returns [Expr result]
  : simpleExpr       {$result = $simpleExpr.result;}
;

simpleExpr returns [Expr result]
  : atomExpr {$result = $atomExpr.result;}
  | atomExpr LPAR listExpresao RPAR
    {
      Expr f = $atomExpr.result;
      $result = new FunCall(f, $listExpresao.exprs);
    }
;

atomExpr returns [Expr result]
  : '!' atomExpr              {$result = new FunCall(Ops.NOT, $atomExpr.result);}
  | numero                    {$result = $numero.result;}
  | bool                      {$result = $bool.result;}
  | STRING                    {$result = StringLit.fromRepr($STRING.text);}
  | CARACTERE                 {$result = new Variable($CARACTERE.text);}
  | LBKT listExpresao RBKT    {$result = new ListExpr($listExpresao.exprs);}
  | LPAR expr RPAR            {$result = $expr.result;}
;

listExpresao returns [List<Expr> exprs]
  @init { $exprs = new LinkedList<Expr>(); }
    : /* nada */
    | expr           {$exprs.add($expr.result);}
      (VIRGULA expr  {$exprs.add($expr.result);}
      )*
;

numero returns [Expr result]
  : INTEGER   {$result = Inteiro.of($INTEGER.text);}
;

bool returns [Expr result]
  : TRUE    {$result = Bool.FATO;}
  | FALSE   {$result = Bool.FAKE;}
;

FUNC: 'func';

IF: 'need';
ELSE: 'diverse';
WHILE: 'survive'; 

STARTBLOCK: '#';
ENDBLOCK: '$';

LPAR: '(';
RPAR: ')';
LBKT: '[';
RBKT: ']';

TRUE: 'fato';
FALSE: 'fake';

VIRGULA: ',';
SEMI: ';';

OU: '||';
E: '&&';
IGUAL: '==';
DIFF: '!=';

MAIORIGUAL: '>=';
MAIOR: '>';
MENORIGUAL: '<=';
MENOR: '<';
NOT: '!';
RECEBE: ':=';

CARACTERE: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;
fragment DIGIT: '0'..'9' ;
INTEGER: DIGIT+ ;

CHAR: '\'' (~[\r\n\\']) '\'' ;
STRING: '"' (~[\r\n\\"])* '"' ;
NL: '\n';
WS: (' ' | '\t' | '\r')+ -> skip ;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

