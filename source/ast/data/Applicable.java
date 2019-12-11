package source.ast.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jefferson
 */
public abstract class Applicable extends Expr {
    
    protected Applicable() {
        super();
        _types.add("applicable");        
    }
    
    public abstract Expr apply(List<Expr> argList);

}
