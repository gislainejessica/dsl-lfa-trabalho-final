package source.ast;

import java.util.List;

public class DefFunc extends Expr{
    
    private String nomeFunc;
    private List<Definicao> list;
    private Bloco bloco;
    
    public DefFunc(String nomeFunc, List paramFormal, Bloco bloco){
        this.bloco = bloco;
        this.list = paramFormal;
        this.nomeFunc = nomeFunc;
    }

    @Override
    public String toString() {
        return "DefFunc{" + "nomeFunc=" + nomeFunc + ", list=" + list + ", bloco=" + bloco + '}';
    }
       
}
