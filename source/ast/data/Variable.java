package source.ast.data;

public class Variable extends Expr {

    private final String name;
    
    public Variable(String name) {
        super();
        this.name = name;
        _types.add("var");
    }

    @Override
    public Expr eval(Context ctx) {
        if (ctx.contains(name)) {
            return ctx.get(name);
        }
        else {
            String msg = String.format("Variável não definida: %s.", name);
            throw new RuntimeException(msg);
        }
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Expr o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
