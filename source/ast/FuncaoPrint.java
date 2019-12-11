package source.ast;

public class FuncaoPrint extends Expr {
    private Object id;

    public FuncaoPrint(Object id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FuncaoPrint{" + "id=" + id + '}';
    }
    
    
}
