package source.ast;

public class Definicao {
    private Tipagem tipo;
    private String variavel;
    private Id valor;

    public Definicao(Tipagem tipo, String variavel) {
        this.tipo = tipo;
        this.variavel = variavel;
    }

    public Definicao(Tipagem tipo, String variavel, Id valor) {
        this.tipo = tipo;
        this.variavel = variavel;
        this.valor = valor;
    }    

    @Override
    public String toString() {
        return "Definicao{" + "tipo=" + tipo + ", variavel=" + variavel + ", valor=" + valor + '}';
    }
    
}
