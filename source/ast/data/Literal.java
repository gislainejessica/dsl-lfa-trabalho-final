package source.ast.data;

/**
 *
 * @author jefferson
 */
public abstract class Literal extends Expr {
    
    protected Literal() {
        super();
        _types.add("literal");
    }

    @Override
    public Expr eval(Context ctx) {
        return this;
    }
    
}
