package source.ast;

public class AtribuicaoValor extends Expr {
    private String variavel;
    private Id valor;
    private ExprSmp expr;

    public AtribuicaoValor(String variavel, Id valor) {
        this.variavel = variavel;
        this.valor = valor;        
    }

    public AtribuicaoValor(String variavel, ExprSmp expr) {
        this.variavel = variavel;
        this.expr = expr;
    }
    
    @Override
    public String toString() {
        return "AtribuicaoValor{" + "variavel=" + variavel + ", valor=" + valor + ", expr=" + expr + '}';
    }
        
}
