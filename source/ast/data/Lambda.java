package source.ast.data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Lambda extends Applicable {
    
    public static LambdaDecl declare(List<String> formalArgs, Expr body) {
        return new LambdaDecl(formalArgs, body);
    }

    private final List<String> formalArgs;
    private final Expr body;
    private final Context context;
    
    public Lambda(List<String> formalArgs, Expr body, Context context) {
        super();
        this.formalArgs = formalArgs;
        this.body = body;
        this.context = context;
        _types.add("lambda");
    }

    @Override
    public Expr apply(List<Expr> argList) {
        if (formalArgs.size() != argList.size()) {
            String msg = String.format(
                    "Número de argumento incorreto. Esperados: %d. Recebidos: %d.", 
                    formalArgs.size(), argList.size());
            throw new RuntimeException(msg);
        }
        
        Context ctx1 = new Context(Optional.of(context));
        for (int i = 0; i < formalArgs.size(); i++) {
            String var = formalArgs.get(i);
            Expr value = argList.get(i);
            ctx1.set(var, value);
        }
        
        Expr result = body.eval(ctx1);
        return result;
    }

    @Override
    public Expr eval(Context ctx) {
        return this;
    }

    @Override
    public String toString() {
        String args = formalArgs.stream()
                .collect(Collectors.joining(" ", "(", ")"));
        return String.format("(lambda %s %s)", args, body.toString());
    }

    @Override
    public int compareTo(Expr t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
