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
        return String.format("(While %s %s)", cond, doExpr);
    }

    @Override
    public int compareTo(Expr arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
