package source.ast;

public class OperadorComparacao extends Expr {
    
    private String opc;

    public OperadorComparacao(String opc) {
        this.opc = opc;
    }

    @Override
    public String toString() {
        return "OperadorComparacao{" + "opc=" + opc + '}';
    }
    
    
    
}
