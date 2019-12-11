package source.ast;

import java.util.List;

public class ChamadaFuncao extends Expr{
    
    private String nomeFunc;
    private List<Id> list;
    
    public ChamadaFuncao(String nomeFunc, List list){
        this.nomeFunc = nomeFunc;
        this.list = list;
    }

    @Override
    public String toString() {
        return "ChamadaFuncao{" + "nomeFunc=" + nomeFunc + ", list=" + list + '}';
    }
    
}
