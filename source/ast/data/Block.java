package source.ast.data;

import java.util.List;
import java.util.stream.Collectors;


public class Block extends Expr {

    private final List<Expr> exprList;
    
    public Block(List<Expr> exprList) {
        super();
        this.exprList = exprList;
        _types.add("block");
    }
    
    public static Expr from(List<Expr> es) {
        if (es.isEmpty()) {
            return Expr.UNIT;
        }
        else if (es.size() == 1) {
            return es.get(0);
        }
        else {
            return new Block(es);
        }
    }

    @Override
    public Expr eval(Context ctx) {
        Expr result = Expr.UNIT;
        for (Expr e: exprList) {
            result = e.eval(ctx);
        }
        return result;
    }
    
    @Override
    public String toString() {
        String t = exprList.stream()
                .map(x -> x.toString())
                .collect(Collectors.joining(" "));
        return String.format("(begin %s)", t);
    }

    @Override
    public String repr() {
        String t = exprList.stream()
                .map(x -> x.repr())
                .collect(Collectors.joining(" "));
        return String.format("(begin %s)", t);
    }

    @Override
    public int compareTo(Expr o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
