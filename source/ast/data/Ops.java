package source.ast.data;

import java.io.Console;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jefferson
 */
public class Ops {
    
    public static String ARITY_ERROR_MSG = 
            "Número de argumentos incorreto. Experado: %s. Recebido: %d.";
    
    public static String VAR_ARITY_ERROR_MSG = 
            "Número de argumentos incorreto. Experado: %s..%s. Recebido: %d.";
    
    private static int _scale = 5;
    
    public static int getScale() {
        return _scale;
    }
    
    public static void setScale(int scale) {
        _scale = scale;
    }    
    
    public static void assertArity(List<Expr> argList, Integer arity) {
        int nargs = argList.size();
        if (nargs != arity) {
            String msg = String.format(ARITY_ERROR_MSG, arity, nargs);
            throw new IllegalArgumentException(msg);
        }
    }

    public static void assertArity(List<Expr> argList, Integer minArity, Integer maxArity) {
        int nargs = argList.size();
        if (nargs < minArity || nargs > maxArity) {
            String msg = String.format(VAR_ARITY_ERROR_MSG, minArity, maxArity, nargs);
            throw new IllegalArgumentException(msg);
        }
    }
    
    public static void assertTypes(List<Expr> argList, String... types) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Expr arg: argList) {
            String t = types[i];
            if (arg.types() == null ? t != null : !arg.types().contains(t)) {
                String msg = String.format("Esperado: %s; Recebido: %s %s.\n", t, arg, arg.types());
                sb.append(msg);
            }
            i = i+1 >= types.length ? i : i+1;
        }
        if (sb.length() > 0) {
            throw new IllegalArgumentException("Tipos inválidos. " + sb.toString());
        }
    }

    public static boolean checkTypes(List<Expr> argList, String... types) {
        boolean ok = true;
        int i = 0;
        for (Expr arg: argList) {
            String t = types[i];
            ok &= arg.types().contains(t);
            i = i+1 >= types.length ? i : i+1;
        }
        return ok;
    }

    public static Applicable PLUS = new PredefOp("+") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            assertTypes(argList, "numeric", "numeric");
            Numeric x = (Numeric)argList.get(0);
            Numeric y = (Numeric)argList.get(1);
            Expr z = x.add(y);
            return z;
        }        
    };
    
    public static Applicable MINUS = new PredefOp("-") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            assertTypes(argList, "numeric", "numeric");
            Numeric x = (Numeric)argList.get(0);
            Numeric y = (Numeric)argList.get(1);
            Expr z = x.subtract(y);
            return z;
        }        
    };
    
    public static Applicable TIMES = new PredefOp("*") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            assertTypes(argList, "numeric", "numeric");
            Numeric x = (Numeric)argList.get(0);
            Numeric y = (Numeric)argList.get(1);
            Expr z = x.multiply(y);
            return z;
        } 
    };
    
    public static Applicable DIVIDE = new PredefOp("/") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            assertTypes(argList, "numeric", "numeric");
            Numeric x = (Numeric)argList.get(0);
            Numeric y = (Numeric)argList.get(1);
            Expr z = x.divide(y, _scale);
            return z;
        }        
    };
    
    public static Applicable IDIV = new PredefOp("//") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            assertTypes(argList, "numeric", "numeric");
            Numeric x = (Numeric)argList.get(0);
            Numeric y = (Numeric)argList.get(1);
            Expr z = x.quotient(y);
            return z;
        }        
    };
    
    public static Applicable MOD = new PredefOp("%") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            assertTypes(argList, "numeric", "numeric");
            Numeric x = (Numeric)argList.get(0);
            Numeric y = (Numeric)argList.get(1);
            Expr z = x.remainder(y);
            return z;
        }        
    };
    
    public static Applicable UMINUS = new PredefOp("-") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            assertTypes(argList, "numeric");
            Numeric x = (Numeric)argList.get(0);
            Expr z = x.negate();
            return z;
        }
    };


    // =========================================================================
    // Operadores relacionais
    // =========================================================================
    
    public static Applicable EQU = new PredefOp("==") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            Expr x = argList.get(0);
            Expr y = argList.get(1);
            if (x.types().contains("numeric") && y.types().contains("numeric")) {
                return x.compareTo(y) == 0 ? Bool.VERUM : Bool.FALSUM;
            }
            else {
                return x.equals(y) ? Bool.VERUM : Bool.FALSUM;                
            }
        }        
    };

    public static Applicable NEQ = new PredefOp("!=") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            Expr x = argList.get(0);
            Expr y = argList.get(1);
            if (x.types().contains("numeric") && y.types().contains("numeric")) {
                return x.compareTo(y) == 0 ? Bool.FALSUM : Bool.VERUM;
            }
            else {
                return x.equals(y) ? Bool.FALSUM : Bool.VERUM;
            }
        }
    };

    public static Applicable GEQ = new PredefOp(">=") {
        @Override
        public Expr apply(List<Expr> argList) {            
            assertArity(argList, 2);
            Expr x = argList.get(0);
            Expr y = argList.get(1);
            return x.compareTo(y) >= 0 ? Bool.VERUM : Bool.FALSUM;
        }        
    };
    
    public static Applicable LEQ = new PredefOp("<=") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            Expr x = argList.get(0);
            Expr y = argList.get(1);
            return x.compareTo(y) <= 0 ? Bool.VERUM : Bool.FALSUM;
        }        
    };
    
    public static Applicable GT = new PredefOp(">") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            Expr x = argList.get(0);
            Expr y = argList.get(1);
            return x.compareTo(y) > 0 ? Bool.VERUM : Bool.FALSUM;
        }
    };
    
    public static Applicable LT = new PredefOp("<") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            Expr x = argList.get(0);
            Expr y = argList.get(1);
            return x.compareTo(y) < 0 ? Bool.VERUM : Bool.FALSUM;
        }
    };
    
    public static Applicable AND = new PredefOp("&&") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            assertTypes(argList, "bool", "bool");
            Bool x = (Bool)argList.get(0);
            Bool y = (Bool)argList.get(1);
            return x.value && y.value ? Bool.VERUM : Bool.FALSUM;
        }
    };
    
    public static Applicable OR = new PredefOp("||") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            assertTypes(argList, "bool", "bool");
            Bool x = (Bool)argList.get(0);
            Bool y = (Bool)argList.get(1);
            return x.value || y.value ? Bool.VERUM : Bool.FALSUM;
        }
    };
    
    public static Applicable NOT = new PredefOp("!") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            assertTypes(argList, "bool");
            Bool x = (Bool)argList.get(0);
            return x.value ? Bool.FALSUM : Bool.VERUM;
        }
    };
        
    
    public static Applicable ABS = new PredefOp("abs") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            assertTypes(argList, "numeric");
            Expr x = argList.get(0);
            if (x.types().contains("int")) {
                IntLit i = (IntLit)x;
                return new IntLit(i.value.abs());
            }
            else if (x.types().contains("float")) {
                FloatLit g = (FloatLit)x;
                return new FloatLit(g.value.abs());
            }
            else {
                throw new RuntimeException("Tipo desconhecido.");
            }
        }
    };
    
   /** 
    public static Applicable SQRT = new PredefOp("sqrt") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            assertTypes(argList, "numeric");
            Expr x = argList.get(0);
            if (x.types().contains("int")) {
                IntLit i = (IntLit)x;
                FloatLit g = FloatLit.of(i.value);
                BigDecimal r = g.value.sqrt(MathContext.DECIMAL128);
                return FloatLit.of(r);
            }
            else if (x.types().contains("float")) {
                FloatLit g = (FloatLit)x;
                BigDecimal r = g.value.sqrt(MathContext.DECIMAL128);
                return FloatLit.of(r);
            }
            else {
                throw new RuntimeException("Tipo desconhecido.");
            }
        }
    };
    
    */
    public static Applicable PRINT = new PredefOp("print") {
        @Override
        public Expr apply(List<Expr> argList) {
            int n = 0;
            for (Expr e: argList) {
                String t = String.valueOf(e);
                if (n > 0) System.out.print(" ");
                System.out.print(t);
                n += 1;
            }
            return Expr.UNIT;
        } 
    };
    
        
    public static Applicable PRINTLN = new PredefOp("println") {
        @Override
        public Expr apply(List<Expr> argList) {
            int n = 0;
            for (Expr e: argList) {
                String t = String.valueOf(e);
                if (n > 0) System.out.print(" ");
                System.out.print(t);
                n += 1;
            }
            System.out.println();
            return Expr.UNIT;
        } 
    };
    
    
    public static Applicable FORMAT = new PredefOp("format") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1, Integer.MAX_VALUE);
            assertTypes(argList, "str", "expr");
            StringLit s = (StringLit)argList.get(0);
            String fmt = s.value;
            Object[] args = argList.stream().skip(1).toArray();
            String t = String.format(fmt, args);
            return new StringLit(t);
        } 
    };
    
    
    public static Applicable READLN = new PredefOp("readln") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 0);
            Console con = System.console();
            String t = con.readLine();
            return StringLit.of(t);
        } 
    };


    public static Applicable SPLIT = new PredefOp("split") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            assertTypes(argList, "str", "str");
            StringLit t = (StringLit)argList.get(0);
            StringLit d = (StringLit)argList.get(1);
            String delim = String.format("[%s]+", d.value);
            String[] ts = t.value.split(delim);
            List<Expr> es = Arrays.asList(ts).stream()
                    .map(t1 -> StringLit.of(t1))
                    .collect(Collectors.toList());
            return ListLit.fromJavaList(es);
        } 
    };


    // ========================================================================
    // Funções de conversão
    
    public static Applicable TOINT = new PredefOp("toint") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            if (checkTypes(argList, "int")) {
                return argList.get(0);
            }
            else if (checkTypes(argList, "float")) {
                FloatLit g = (FloatLit)argList.get(0);
                int j = g.value.intValue();
                return IntLit.of(j);
            }
            else if (checkTypes(argList, "char")) {
                CharLit c = (CharLit)argList.get(0);
                int j = (int)c.value;
                return IntLit.of(j);
            }
            else if (checkTypes(argList, "str")) {
                StringLit t = (StringLit)argList.get(0);
                int j = Integer.parseInt(t.value);
                return IntLit.of(j);
            }
            else if (checkTypes(argList, "bool")) {
                Bool b = (Bool)argList.get(0);
                int j = b.value ? 1 : 0;
                return IntLit.of(j);
            }
            else {
                String msg = String.format(
                        "Não é possivel converter %s para 'int'.", 
                        argList.get(0).types());
                throw new TypeError(msg);
            }
        } 
    };
    
    
    public static Applicable TOFLOAT = new PredefOp("tofloat") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            if (checkTypes(argList, "int")) {
                IntLit d = (IntLit)argList.get(0);
                return FloatLit.of(d.value);
            }
            else if (checkTypes(argList, "float")) {
                return argList.get(0);
            }
            else if (checkTypes(argList, "char")) {
                CharLit c = (CharLit)argList.get(0);
                int j = (int)c.value;
                return FloatLit.of(j);
            }
            else if (checkTypes(argList, "str")) {
                StringLit t = (StringLit)argList.get(0);
                double x = Double.parseDouble(t.value);
                return FloatLit.of(x);
            }
            else if (checkTypes(argList, "bool")) {
                Bool b = (Bool)argList.get(0);
                int j = b.value ? 1 : 0;
                return FloatLit.of(j);
            }
            else {
                String msg = String.format(
                        "Não é possivel converter %s para 'float'.", 
                        argList.get(0).types());
                throw new TypeError(msg);
            }
        } 
    };
    

    public static Applicable TOCHAR = new PredefOp("tochar") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            if (checkTypes(argList, "int")) {
                IntLit d = (IntLit)argList.get(0);
                char c = (char)d.value.intValue();
                return CharLit.of(c);
            }
            else if (checkTypes(argList, "float")) {
                FloatLit g = (FloatLit)argList.get(0);
                char c = (char)g.value.intValue();
                return CharLit.of(c);
            }
            else if (checkTypes(argList, "char")) {
                return argList.get(0);
            }
            else if (checkTypes(argList, "str")) {
                StringLit t = (StringLit)argList.get(0);
                return CharLit.of(t.value.charAt(0));
            }
            else if (checkTypes(argList, "bool")) {
                Bool b = (Bool)argList.get(0);
                int j = b.value ? 1 : 0;
                char c = (char)j;
                return CharLit.of(c);
            }
            else {
                String msg = String.format(
                        "Não é possivel converter %s para 'char'.", 
                        argList.get(0).types());
                throw new TypeError(msg);
            }
        } 
    };
    

    public static Applicable TOSTR = new PredefOp("tostr") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            String t = argList.get(0).toString();
            return StringLit.of(t);
        } 
    };
    

    public static Applicable TOBOOL = new PredefOp("tobool") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            if (checkTypes(argList, "int")) {
                IntLit d = (IntLit)argList.get(0);
                boolean b = d.value.intValue() != 0;
                return Bool.of(b);
            }
            else if (checkTypes(argList, "float")) {
                FloatLit g = (FloatLit)argList.get(0);
                boolean b = g.value.intValue() != 0;
                return Bool.of(b);
            }
            else if (checkTypes(argList, "char")) {
                CharLit c = (CharLit)argList.get(0);
                boolean b = c.value != (char)0;                
                return Bool.of(b);
            }
            else if (checkTypes(argList, "str")) {
                StringLit t = (StringLit)argList.get(0);
                Boolean b = Boolean.parseBoolean(t.value);
                return Bool.of(b);
            }
            else if (checkTypes(argList, "bool")) {
                return argList.get(0);
            }
            else if (checkTypes(argList, "list")) {
                ListLit l = (ListLit)argList.get(0);
                Boolean b = (l != ListLit.NIL);
                return Bool.of(b);
            }
            else {
                String msg = String.format(
                        "Não é possivel converter %s para 'bool'.", 
                        argList.get(0).types());
                throw new TypeError(msg);
            }
        } 
    };
    

    // ========================================================================
    // Funções sobre listas

    public static Applicable CONS = new PredefOp("cons") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            assertTypes(argList, "expr", "list");
            Expr h = argList.get(0);
            ListLit t = (ListLit)argList.get(1);
            return ListLit.cons(h, t);
        } 
    };
    
    public static Applicable LIST = new PredefOp("list") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 0, Integer.MAX_VALUE);
            return ListLit.fromJavaList(argList);
        } 
    };
        
    public static Applicable FIRST = new PredefOp("first") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            assertTypes(argList, "list");
            ListLit l = (ListLit)argList.get(0);
            return l.head();
        } 
    };
    
    public static Applicable REST = new PredefOp("rest") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            assertTypes(argList, "list");
            ListLit l = (ListLit)argList.get(0);
            return l.tail();
        } 
    };
    
    public static Applicable LENGTH = new PredefOp("length") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 1);
            if (argList.get(0).types().contains("list")) {
                ListLit l = (ListLit)argList.get(0);
                int len = l.length();
                return IntLit.of(len);
            }
            else if (argList.get(0).types().contains("str")) {
                StringLit t = (StringLit)argList.get(0);
                int len = t.value.length();
                return IntLit.of(len);
            }
            else {
                String msg = String.format(
                        "'length' não é aplicável a %s.", argList.get(0).types());
                throw new TypeError(msg);
            }
        }  
    };
    
    public static Applicable NTH = new PredefOp("nth") {
        @Override
        public Expr apply(List<Expr> argList) {
            assertArity(argList, 2);
            if (checkTypes(argList, "int", "str")) {
                IntLit n = (IntLit)argList.get(0);
                StringLit t = (StringLit)argList.get(1);
                char c = t.value.charAt(n.value.intValue());
                return CharLit.of(c);
            }
            else if (checkTypes(argList, "int", "list")) {
                IntLit n = (IntLit)argList.get(0);
                ListLit l = (ListLit)argList.get(1);
                Expr x = l.get(n.value.intValue());
                return x;
            }
            else {
                String msg = String.format(
                        "Esperado 'int' e ('str' ou 'list'). Encontrado (%s e %s).", 
                        argList.get(0).types(), argList.get(1).types());
                throw new TypeError(msg);
            }
        }  
    };
    
}
