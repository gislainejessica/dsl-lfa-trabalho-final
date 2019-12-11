package source.ast;

public class Tipagem {
    private String nome;

    public Tipagem(String nome) {
        this.nome = nome;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Tipagem{" + "nome=" + nome + '}';
    }
    
}
