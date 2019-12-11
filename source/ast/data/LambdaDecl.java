package source.ast.data;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jefferson
 */
public class LambdaDecl extends Expr {

    private final List<String> formalArgs;
    private final Expr body;
    
    public LambdaDecl(List<String> formalArgs, Expr body) {
        super();
        this.formalArgs = formalArgs;
        this.body = body;
        _types.add("lambdadecl");
    }

    @Override
    public Expr eval(Context ctx) {
        Lambda lambda = new Lambda(formalArgs, body, ctx);
        return lambda;
    }

    @Override
    public int compareTo(Expr o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        String args = formalArgs.stream()
                .collect(Collectors.joining(" ", "(", ")"));
        return String.format("(lambda %s %s)", args, body.toString());
    }

}
