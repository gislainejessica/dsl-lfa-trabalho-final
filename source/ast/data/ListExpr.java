package source.ast.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author jefferson
 */
public class ListExpr extends Expr {

    private final List<Expr> exprList;
    
    public ListExpr(List<Expr> exprList) {
        super();
        this.exprList = exprList;
        _types.add("lexpr");
    }

    @Override
    public Expr eval(Context ctx) {
        List<Expr> litList = new ArrayList<>();
        for (Expr e: exprList) {
            Expr x = e.eval(ctx);
            litList.add(x);
        }
        return ListLit.fromJavaList(litList);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof ListExpr) {
            ListExpr that = (ListExpr)other;
            return Arrays.equals(this.exprList.toArray(), that.exprList.toArray());
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.exprList);
        return hash;
    }
    
    @Override
    public String toString() {
        return exprList.stream()
                .map(x -> x.toString())
                .collect(Collectors.joining(", ", "[", "]"));
    }

    @Override
    public int compareTo(Expr o) {
        if (o instanceof ListExpr) {
            ListExpr that = (ListExpr)o;
            Comparable[] a1 = (Comparable[])this.exprList.toArray();
            Comparable[] a2 = (Comparable[])that.exprList.toArray();
            //return Arrays.compare(a2, a2);
            return 1;
        }
        else {
            String msg = String.format("Comparação inválida entre 'lexpr' e %s.", o.types());
            throw new TypeError(msg);
        }        
    }
        
}
