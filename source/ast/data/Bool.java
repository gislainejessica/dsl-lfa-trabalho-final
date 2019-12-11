package source.ast.data;

public class Bool extends BasicLiteral<Boolean> {
    
    public static final Bool of(Boolean value) {
        return value ? VERUM : FALSUM;
    }
    
    public static final Bool VERUM = new Bool(true);
    public static final Bool FALSUM = new Bool(false);
    
    private Bool(Boolean value) {
        super(value);
        _types.add("bool");
    }
    
    @Override
    public String toString() {
        return value ? "#t" : "#f";
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Bool) {
            Bool that = (Bool)o;
            return this.value.equals(that.value);
        }
        else {
            return false;
        }
    }

    @Override
    public int compareTo(Expr o) {
        if (o instanceof Bool) {
            Bool that = (Bool)o;
            if (this.value.equals(that.value)) {
                return 0;
            }
            else if (this.value == false) {
                return -1;
            }
            else {
                return 1;
            }
        }
        else {
            String msg = String.format("Comparação inválida entre 'bool' e %s.", o.types());
            throw new TypeError(msg);
        }
    }
    
    
    public Bool and(Expr other) {
        if (other instanceof Bool) {
            Bool that = (Bool)other;
            if (this.value) return that;
            else return this;
        }
        else {
            String msg = String.format("Tipos incompatíveis: 'bool' e %s", other.types());
            throw new TypeError(msg);
        }
    }
    
    
    public Bool or(Expr other) {
        if (other instanceof Bool) {
            Bool that = (Bool)other;
            if (this.value) return this;
            else return that;
        }
        else {
            String msg = String.format("Tipos incompatíveis: 'bool' e %s", other.types());
            throw new TypeError(msg);
        }
    }
    
    
    public Bool not() {
        return this.value ? FALSUM : VERUM;
    }
}
