package source.ast;

import java.util.List;

public class ExprSmp extends Expr{
    private Id termo;
    private List<Operacoes> operacoes;

    public ExprSmp(Id termo, List<Operacoes> operacoes) {
        this.termo = termo;
        this.operacoes = operacoes;
    }

    @Override
    public String toString() {
        return "ExprSmp{" + "termo=" + termo + ", operacoes=" + operacoes + '}';
    }
    
}
