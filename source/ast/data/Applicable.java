package source.ast.data;

import java.util.List;

public abstract class Applicable extends Expr {
    
    protected Applicable() {
        super();
        _types.add("applicable");        
    }
    
    public abstract Expr apply(List<Expr> argList);

}
