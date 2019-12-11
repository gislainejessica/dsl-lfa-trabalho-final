grammar TamagotchiCat;

@header {
package source.gramatica;
import source.ast.*;
}

progr returns [Expr result]
    : es=exprSeq    {$result = Block.from($es.exprs);}
    ;

exprSeq returns [List<Expr> exprs]
@init {
       $exprs= new LinkedList<Expr>();
       }
    : (e1=expr     (SEMI | NL) {$exprs.add($e1.result);}
      |/* vazio */ (SEMI | NL)
      )* 
    ;

expr returns [Expr result]
    : CHARACTERES GETS e1=expr  {$result = new Assign($CHARACTERES.text, $e1.result);}
    | i1=ifExpr           {$result = $i1.result;}
    | w1=whileExpr        {$result = $w1.result;}
    | b1=blockExpr        {$result = $b1.result;}
    | x1=bexpr            {$result = $x1.result;}
    | d1=fundecl          {$result = $d1.result;}
    ;

fundecl returns [Expr result]
    : FUN CHARACTERES LPAR fa=formalArgs RPAR GETS e1=expr
      {$result = new FunDecl($CHARACTERES.text, $fa.args, $e1.result);}
    | FUN LPAR fa=formalArgs RPAR GETS e1=expr
      {$result = Lambda.declare($fa.args, $e1.result);}
    ;

formalArgs returns [List<String> args]
@init {
       $args = new ArrayList<>();
       }
    : /* vazia */
    | CHARACTERES         {$args.add($CHARACTERES.text);}
      (COMMA CHARACTERES  {$args.add($CHARACTERES.text);}
      )*
    ;

ifExpr returns [Expr result]
@init {
       List<GuardedExpr> gs = new LinkedList<>();
       }
    : IF c1=expr THEN NL? t1=expr NL?
      {gs.add(new GuardedExpr($c1.result, $t1.result));} 
      (ELSE NL? t3=expr NL?
      {
       gs.add(new GuardedExpr(Bool.VERUM, $t3.result));
      }
      )?
      {$result = new Cond(gs);}

    ;

whileExpr returns [Expr result]
    : WHILE c1=expr STARTBLOCK NL? d1=expr   
      {$result = new While($c1.result, $d1.result);}
    ;

blockExpr returns [Expr result]
    : LBRC es=exprSeq RBRC
      {$result = Block.from($es.exprs);}
    ;

bexpr returns [Expr result]
    : d1=disjExpr        {$result = $d1.result;}
      (OR d2=disjExpr  {$result = new FunCall(Ops.OR, $result, $d2.result);})*
    ;

disjExpr returns [Expr result]
    : c1=conjExpr        {$result = $c1.result;}
      (AND c2=conjExpr  {$result = new FunCall(Ops.AND, $result, $c2.result);})*
    ;

conjExpr returns [Expr result]
    : a1=addExpr        {$result = $a1.result;}
      (EQU a2=addExpr   {$result = new FunCall(Ops.EQU, $result, $a2.result);}
      |NEQ a2=addExpr   {$result = new FunCall(Ops.NEQ, $result, $a2.result);}
      |GT a2=addExpr    {$result = new FunCall(Ops.GT, $result, $a2.result);}
      |LT a2=addExpr    {$result = new FunCall(Ops.LT, $result, $a2.result);}
      |GEQ a2=addExpr   {$result = new FunCall(Ops.GEQ, $result, $a2.result);}
      |LEQ a2=addExpr   {$result = new FunCall(Ops.LEQ, $result, $a2.result);}
      )?
    ;
    
addExpr returns [Expr result] 
    : a1=multExpr       {$result = $a1.result;}
      ('+' a2=multExpr  {$result = new FunCall(Ops.PLUS, $result, $a2.result);}
      |'-' a2=multExpr  {$result = new FunCall(Ops.MINUS, $result, $a2.result);}
      )*
    ;

multExpr returns [Expr result]
    : a1=simpleExpr       {$result = $a1.result;}
      ('*' a2=simpleExpr  {$result = new FunCall(Ops.TIMES, $result, $a2.result);}
      |'/' a2=simpleExpr  {$result = new FunCall(Ops.DIVIDE, $result, $a2.result);}
      |'//' a2=simpleExpr {$result = new FunCall(Ops.IDIV, $result, $a2.result);}
      |'%' a2=simpleExpr  {$result = new FunCall(Ops.MOD, $result, $a2.result);}
      )*
    ;


simpleExpr returns [Expr result]
    : a1=atomExpr {$result = $a1.result;}
    | a1=atomExpr LPAR es=exprList RPAR
      {
       Expr f = $a1.result;
       $result = new FunCall(f, $es.exprs);
      }
    ;

atomExpr returns [Expr result]
    : '-' a1=atomExpr       {$result = new FunCall(Ops.UMINUS, $a1.result);}
    | '!' a1=atomExpr       {$result = new FunCall(Ops.NOT, $a1.result);}
    | n=number              {$result = $n.result;}
    | b=bool                {$result = $b.result;}
    | STRING                {$result = StringLit.fromRepr($STRING.text);}
    | CHAR                  {$result = CharLit.fromRepr($CHAR.text);}
    | CHARACTERES                 {$result = new Variable($CHARACTERES.text);}
    | LBKT es=exprList RBKT {$result = new ListExpr($es.exprs);}
    | LPAR e1=expr RPAR     {$result = $e1.result;}
    ;

exprList returns [List<Expr> exprs]
@init {
       $exprs = new LinkedList<Expr>();
       }
    : /* vazio */
    | e1=expr         {$exprs.add($e1.result);}
      (COMMA e2=expr  {$exprs.add($e2.result);})*
    ;

number returns [Expr result]
    : INTEGER   {$result = IntLit.of($INTEGER.text);}
    | FLOAT     {$result = FloatLit.of($FLOAT.text);}
    ;

bool returns [Expr result]
    : TRUE    {$result = Bool.VERUM;}
    | FALSE   {$result = Bool.FALSUM;}
    ;

FUN: 'fun';


IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
STARTBLOCK: ':';
ENDBLOCK: '$';
LPAR: '(';
RPAR: ')';
LBKT: '[';
RBKT: ']';
LBRC: '{';
RBRC: '}';
TRUE: 'true';
FALSE: 'false';
COMMA: ',';
SEMI: ';';
OR: '||';
AND: '&&';
EQU: '==';
NEQ: '!=';
GEQ: '>=';
GT: '>';
LEQ: '<=';
LT: '<';
GETS: '=';

CHARACTERES: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
     ;

fragment DIGIT: '0'..'9'
              ;

FLOAT: DIGIT+ '.' DIGIT+
     ;

INTEGER: DIGIT+
       ;

fragment ESCAPE: '\\' [btnrf"'\\]
               ;

fragment UCHAR: '\\u' DIGIT DIGIT DIGIT DIGIT
              ;

CHAR: '\'' (~[\r\n\\'] | ESCAPE | UCHAR) '\''
    ;

STRING: '"' (~[\r\n\\"] | ESCAPE | UCHAR)* '"'
      ;

NL: '\n';

WS: (' ' | '\t' | '\r')+ -> skip
  ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;


primitive
    : string
    | bool
    ;

string
    : SINGLE_STRING
    | DOUBLE_STRING
    ;

SINGLE_STRING
    : '\'' ~('\'')+ '\''
    ;

DOUBLE_STRING
    : '"' ~('"')+ '"'
    ;

CHARACTERESIFIER
    :   [A-Za-z0-9]+
    ;
