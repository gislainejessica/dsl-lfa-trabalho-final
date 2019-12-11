package source.ast.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import static java.util.stream.Collectors.joining;

/**
 *
 * @author jefferson
 */
public class FunCall extends Expr {

    private final Expr callable;
    private final List<Expr> argList;
    
    public FunCall(Expr callable, List<Expr> argList) {
        super();
        this.callable = callable;
        this.argList = argList;
        _types.add("funcall");
    }
    
    public FunCall(Expr callable, Expr... argList) {
        this(callable, Arrays.asList(argList));
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof FunCall) {
            FunCall that = (FunCall)other;
            return Objects.equals(this.callable, that.callable) 
                    && Objects.equals(this.argList, that.argList);
        }
        else return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.callable);
        hash = 97 * hash + Objects.hashCode(this.argList);
        return hash;
    }
    
    @Override
    public String toString() {
        String args = argList.stream().map(x -> x.toString()).collect(joining(" "));
        return String.format("(%s %s)", callable.toString(), args);
    }

    @Override
    public Expr eval(Context ctx) {
        
        Expr fn = callable.eval(ctx);
        if (!fn.types().contains("applicable")) {
            String msg = String.format("Expressão não é aplicável: %s.", callable);
            throw new TypeError(msg);
        }
        Applicable f = (Applicable)fn;                
        ArrayList<Expr> args = new ArrayList<>(argList.size());
        for (Expr arg: argList) {
            Expr x = arg.eval(ctx);
            args.add(x);
        }
        return f.apply(args);
    }

    @Override
    public int compareTo(Expr o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
