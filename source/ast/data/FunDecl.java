package source.ast.data;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jefferson
 */
public class FunDecl extends Expr {

    private final String funName;
    private final List<String> formalArgs;
    private final Expr body;
    
    public FunDecl(String funName, List<String> formalArgs, Expr body) {
        super();
        this.funName = funName;
        this.formalArgs = formalArgs;
        this.body = body;
        _types.add("fundecl");
    }

    @Override
    public Expr eval(Context ctx) {
        Lambda f = new Lambda(formalArgs, body, ctx);
        ctx.set(funName, f);
        return f;
    }

    @Override
    public int compareTo(Expr t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String toString() {
        String args = formalArgs.stream()
                .collect(Collectors.joining(" ", "(", ")"));
        return String.format("(define %s %s %s)", funName, args, body);
    }

}
