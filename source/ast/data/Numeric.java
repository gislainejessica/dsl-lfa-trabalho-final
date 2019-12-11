package source.ast.data;

public abstract class Numeric<T> extends BasicLiteral<T> {

    protected Numeric(T value) {
        super(value);
        _types.add("numeric");
    }

    public abstract Expr negate();
    
    public abstract Expr add(Expr other);
    
    public abstract Expr subtract(Expr other);
    
    public abstract Expr multiply(Expr other);
    
    public abstract Expr divide(Expr other, int scale);
    
    public abstract Expr quotient(Expr other);
    
    public abstract Expr remainder(Expr other);
    
}
