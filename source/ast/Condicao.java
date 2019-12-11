package source.ast;

public class Condicao {
    
    private String var;
    private OperadorComparacao opc;
    private Valor val;

    public Condicao(String var, OperadorComparacao opc, Valor val) {
        this.var = var;
        this.opc = opc;
        this.val = val;
    }

    @Override
    public String toString() {
        return "Condicao{" + "var=" + var + ", opc=" + opc + ", val=" + val + '}';
    }
    
    
    
    
}
