package source.ast;

import java.util.List;

public class While extends Expr{
    
    private Condicao cond;
    private List<Expr> expr;

    public While(Condicao cond, List<Expr> expr) {
        this.cond = cond;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "While{" + "cond=" + cond + ", expr=" + expr + '}';
    }
    
    
    
}
