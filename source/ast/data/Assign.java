package source.ast.data;

public class Assign extends Expr {

    private final String varName;
    private final Expr rhs;
    
    public Assign(String varName, Expr rhs) {
        this.varName = varName;
        this.rhs = rhs;
        _types.add("assign");
    }

    @Override
    public Expr eval(Context ctx) {
        if (!ctx.contains(varName)) {
            ctx.set(varName, Expr.UNIT);
        }
        Expr result = rhs.eval(ctx);
        ctx.set(varName, result);
        return result;
    }
    
    @Override
    public String toString() {
        return String.format("(set %s %s)", varName, rhs);
    }

    @Override
    public int compareTo(Expr o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
