package source.ast.data;

public class GuardedExpr {

    public final Expr guard;
    public final Expr expr;

    public GuardedExpr(Expr guard, Expr expr) {
        this.guard = guard;
        this.expr = expr;
    }
    
    @Override
    public String toString() {
        return String.format("(%s %s)", guard, expr);
    }
    
}
