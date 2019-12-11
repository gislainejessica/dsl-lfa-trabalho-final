package source.ast.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Expr implements Comparable<Expr> {
    
    public static final Expr UNIT = new Expr() {
        @Override
        public Expr eval(Context ctx) {
            return this;
        }
        
        @Override
        public String toString() {
            return "{}";
        }

        @Override
        public int compareTo(Expr o) {
            throw new TypeError("Unit não pode ser compoarado a outros valores.");
        }
    };
    
    protected final List<String> _types;
    
    protected Expr() {
        _types = new ArrayList<>();
        _types.add("expr");
    }    
    
    public abstract Expr eval(Context ctx);
    
    public String repr() {
        return toString();
    }
        
    public List<String> types() {
        return Collections.unmodifiableList(_types);
    }
    
    public void addType(String t) {
        _types.add(t);
    }
    
}
