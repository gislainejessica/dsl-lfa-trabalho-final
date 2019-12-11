package source.ast;

public class Operador {
    
    
    private String op;
    
    public Operador(String op){
        this.op = op;
    }
    
    @Override
    public String toString() {
        return "Operador{" + "op=" + op + '}';
    }
    
    
}
