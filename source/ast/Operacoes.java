package source.ast;

public class Operacoes {
    private Operador op;
    private Id id;

    public Operacoes(Operador op, Id id) {
        this.op = op;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Operacoes{" + "op=" + op + ", id=" + id + '}';
    }
    
}
