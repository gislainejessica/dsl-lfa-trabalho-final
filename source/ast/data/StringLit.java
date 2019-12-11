package source.ast.data;

import static com.mycompany.dartmaven.data.TestUtils.escape;
import static com.mycompany.dartmaven.data.TestUtils.quote;
import static com.mycompany.dartmaven.data.TestUtils.unescape;
import static com.mycompany.dartmaven.data.TestUtils.unquote;

/**
 *
 * @author jefferson
 */
public class StringLit extends BasicLiteral<String> {

    public static Expr of(String t) {
        return new StringLit(t);
    }
    
    public StringLit(String value) {
        super(value);
        _types.add("str");
    }
    
    public static StringLit fromRepr(String t) {
        String s = unescape(unquote(t, '\"'));
        StringLit stringLit = new StringLit(s);
        return stringLit;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof StringLit) {
            StringLit that = (StringLit)other;
            return this.value.equals(that.value);
        }
        else return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * value.hashCode() + hash;
        return hash;
    }
   
    @Override
    public int compareTo(Expr o) {
        if (o.types().contains("str")) {
            StringLit that = (StringLit)o;
            return this.value.compareTo(that.value);
        }
        else {
            String msg = String.format(
                    "Comparação inválida entre 'str' e %s.", o.types());
            throw new TypeError(msg);                 
        }
    }
    
    @Override
    public String repr() {
        return quote(escape(value), '\"');
    }
    
}
