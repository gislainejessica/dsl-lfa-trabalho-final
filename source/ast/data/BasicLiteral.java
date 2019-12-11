package source.ast.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jefferson
 */
public abstract class BasicLiteral<T> extends Literal {

    public final T value;
    
    protected BasicLiteral(T value) {
        super();
        this.value = value;
        _types.add("basic");
    }
    
    @Override
    public String toString() {
        return value.toString();
    }

}
