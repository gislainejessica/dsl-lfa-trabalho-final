package source.ast.data;

import static source.ast.data.TestUtils.escape;
import static source.ast.data.TestUtils.quote;
import static source.ast.data.TestUtils.unescape;
import static source.ast.data.TestUtils.unquote;

public class CharLit extends BasicLiteral<Character> {

    public static Expr of(char c) {
        return new CharLit(c);
    }

    public CharLit(Character value) {
        super(value);
        _types.add("char");
    }

    public static CharLit fromRepr(String t) {
        String s = unescape(unquote(t, '\''));
        CharLit charLit = new CharLit(s.charAt(0));
        return charLit;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof CharLit) {
            CharLit that = (CharLit)other;
            return this.value.equals(that.value);
        }
        else return false;
    }

    @Override
    public int compareTo(Expr o) {
        if (o.types().contains("char")) {
            CharLit that = (CharLit)o;
            return this.value.compareTo(that.value);
        }
        else {
            String msg = String.format(
                    "Comparação inválida entre 'char' e %s.", o.types());
            throw new TypeError(msg);                 
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * value.hashCode() + hash;
        return hash;
    }
    
    @Override
    public String repr() {
        return quote(escape(value.toString()), '\'');
    }
    
}
