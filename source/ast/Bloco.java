package source.ast;

import java.util.List;

public class Bloco {
    
    private List<Definicao> def;
    private List<Expr> expr;
    
    public Bloco(List<Definicao> def, List<Expr> expr){
        this.def = def;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "Bloco{" + "def=" + def + ", expr=" + expr + '}';
    }

   
}
