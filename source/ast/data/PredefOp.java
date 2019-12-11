package source.ast.data;

public abstract class PredefOp extends Applicable {

    private final String name;
    
    public PredefOp(String name) {
        super();
        this.name = name;
        _types.add("sysfunc");
    }
    
    @Override
    public Expr eval(Context ctx) {
        return this;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Expr other) {
        throw new UnsupportedOperationException("Not supported yet.");        
    }
    
}
