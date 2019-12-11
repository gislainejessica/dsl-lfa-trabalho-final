package source.ast.data;

public class While extends Expr {

    private final Expr cond;
    private final Expr doExpr;
    
    public While(Expr cond, Expr doExpr) {
        super();
        this.cond = cond;
        this.doExpr = doExpr;
        _types.add("while");
    }

    @Override
    public Expr eval(Context ctx) {
        Expr result = Expr.UNIT;
        while (cond.eval(ctx).equals(Bool.VERUM)) {
            result = doExpr.eval(ctx);
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("(while %s %s)", cond, doExpr);
    }

    @Override
    public int compareTo(Expr o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
