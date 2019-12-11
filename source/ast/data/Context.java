package source.ast.data;

import java.util.HashMap;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author jefferson
 */
public class Context {

    private final HashMap<String, Expr> map;
    private final Optional<Context> parent;
    
    public Context(Optional<Context> parent) {
        this.map = new HashMap<>();
        this.parent = parent;
    }

    public void set(String name, Expr value) {
        map.put(name, value);
    }

    public Expr get(String name) {
        if (map.containsKey(name)) {
            return map.get(name);        
        }
        else if (parent.isPresent()) {
            return parent.get().get(name);
        }
        else {
            return null;
        }
    }
    
    public boolean contains(String name) {
        if (map.containsKey(name)) {
            return true;
        }
        else if (parent.isPresent()) {
            return parent.get().contains(name);
        }
        else {
            return false;
        }
    }
    
    public Set<String> keySet() {
        Set<String> keys = map.keySet();
        if (parent.isPresent()) {
            Set<String> parentKeys = parent.get().keySet();
            keys.addAll(parentKeys);
        }
        return keys;
    }

}
