package source.ast.data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

public class IntLit extends Numeric<BigInteger> {

    public static IntLit of(int x) {
        BigInteger d = new BigInteger(String.valueOf(x));
        return new IntLit(d);
    }
    
    public static IntLit of(String t) {
        BigInteger d = new BigInteger(t);
        return new IntLit(d);
    }
    
    public static IntLit of(BigInteger d) {
        return new IntLit(d);
    }
    
    public IntLit(BigInteger value) {
        super(value);
        _types.add("int");
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof IntLit) {
            IntLit that = (IntLit)other;
            return Objects.equals(this.value, that.value);
        }
        else return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return 7 * value.hashCode() + hash;
    }

    @Override
    public int compareTo(Expr o) {
        if (o.types().contains("int")) {
            IntLit that = (IntLit)o;
            return this.value.compareTo(that.value);
        }
        else if (o.types().contains("float")) {
            FloatLit that = (FloatLit)o;
            BigDecimal x = new BigDecimal(this.value);
            return x.compareTo(that.value);
        }
        else {
            String msg = String.format(
                    "Comparação inválida entre 'int' e %s.", o.types());
            throw new TypeError(msg);            
        }
    }

    @Override
    public Expr negate() {
        return new IntLit(value.negate());
    }

    @Override
    public Expr add(Expr other) {
        if (other.types().contains("int")) {
            IntLit that = (IntLit)other;
            BigInteger z = this.value.add(that.value);
            return new IntLit(z);
        }
        else if (other.types().contains("float")) {
            FloatLit y = (FloatLit)other;
            BigDecimal x = new BigDecimal(this.value);
            BigDecimal z = x.add(y.value);
            return new FloatLit(z);
        }
        else {
            String msg = String.format("Tipos incompatíveis: 'int' e %s.", other.types());
            throw new TypeError(msg);
        }
    }

    @Override
    public Expr subtract(Expr other) {
        if (other.types().contains("int")) {
            IntLit that = (IntLit)other;
            BigInteger z = this.value.subtract(that.value);
            return new IntLit(z);
        }
        else if (other.types().contains("float")) {
            FloatLit y = (FloatLit)other;
            BigDecimal x = new BigDecimal(this.value);
            BigDecimal z = x.subtract(y.value);
            return new FloatLit(z);
        }
        else {
            String msg = String.format("Tipos incompatíveis: 'int' e %s.", other.types());
            throw new TypeError(msg);
        }
    }

    @Override
    public Expr multiply(Expr other) {
        if (other.types().contains("int")) {
            IntLit that = (IntLit)other;
            BigInteger z = this.value.multiply(that.value);
            return new IntLit(z);
        }
        else if (other.types().contains("float")) {
            FloatLit y = (FloatLit)other;
            BigDecimal x = new BigDecimal(this.value);
            BigDecimal z = x.multiply(y.value);
            return new FloatLit(z);
        }
        else {
            String msg = String.format("Tipos incompatíveis: 'int' e %s.", other.types());
            throw new TypeError(msg);
        }
    }

    @Override
    public Expr divide(Expr other, int scale) {
        if (other.types().contains("int")) {
            BigDecimal x = new BigDecimal(this.value);
            BigDecimal y = new BigDecimal(((IntLit)other).value);
            BigDecimal z = x.divide(y, scale, RoundingMode.HALF_EVEN);
            return new FloatLit(z);
        }
        else if (other.types().contains("float")) {
            BigDecimal x = new BigDecimal(this.value);
            FloatLit y = (FloatLit)other;
            BigDecimal z = x.divide(y.value, scale, RoundingMode.HALF_EVEN);
            return new FloatLit(z);
        }
        else {
            String msg = String.format("Tipos incompatíveis: 'int' e %s.", other.types());
            throw new TypeError(msg);
        }
    }

    @Override
    public Expr quotient(Expr other) {
        if (other.types().contains("int")) {
            IntLit that = (IntLit)other;
            BigInteger z = this.value.divide(that.value);
            return new IntLit(z);
        }
        else if (other.types().contains("float")) {
            BigDecimal x = new BigDecimal(this.value);
            FloatLit y = (FloatLit)other;
            BigDecimal z = x.divideToIntegralValue(y.value);
            return new FloatLit(z);
        }
        else {
            String msg = String.format("Tipos incompatíveis: 'int' e %s.", other.types());
            throw new TypeError(msg);
        }
    }

    @Override
    public Expr remainder(Expr other) {
        if (other.types().contains("int")) {
            IntLit that = (IntLit)other;
            BigInteger z = this.value.remainder(that.value);
            return new IntLit(z);
        }
        else if (other.types().contains("float")) {
            BigDecimal x = new BigDecimal(this.value);
            FloatLit y = (FloatLit)other;
            BigDecimal z = x.remainder(y.value);
            return new FloatLit(z);
        }
        else {
            String msg = String.format("Tipos incompatíveis: 'int' e %s.", other.types());
            throw new TypeError(msg);
        }
    }
    
}
