package source.ast.data;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.joining;

/**
 *
 * @author jefferson
 */
public class Cond extends Expr {

    private final List<GuardedExpr> condList;
    
    public Cond(List<GuardedExpr> condList) {
        super();
        this.condList = condList;
        _types.add("cond");
    }
    
    @Override
    public Expr eval(Context ctx) {
        Expr result = Expr.UNIT;
        int i = 0;
        boolean finished = false;
        while (!finished && i < condList.size()) {
            GuardedExpr ge = condList.get(i);
            Expr cond = ge.guard.eval(ctx);
            if (cond.equals(Bool.VERUM)) {
                result = ge.expr.eval(ctx);
                finished = true;
            }
            i += 1;
        }
        return result;
    }

    @Override
    public String toString() {
        String gx = condList.stream().map(g -> g.toString()).collect(joining(" "));
        return String.format("(cond %s)", gx);
    }

    @Override
    public int compareTo(Expr o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
