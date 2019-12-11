package source.ast;

import java.util.List;

public class If extends Expr{
    
    private Condicao cond;
    private List<Expr> ifExpr;
    private List<Expr> ElseExpr;

    public If(Condicao cond, List<Expr> ifExpr, List<Expr> ElseExpr) {
        this.cond = cond;
        this.ifExpr = ifExpr;
        this.ElseExpr = ElseExpr;
    }

    @Override
    public String toString() {
        return "If{" + "cond=" + cond + ", ifExpr=" + ifExpr + ", ElseExpr=" + ElseExpr + '}';
    }
    
    
    
    
}
