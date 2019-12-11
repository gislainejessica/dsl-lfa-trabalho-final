package source.ast.data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/**
 *
 * @author jefferson
 */
public class FloatLit extends Numeric<BigDecimal> {
    
    public static FloatLit of(double x) {
        BigDecimal g = new BigDecimal(String.valueOf(x));
        return new FloatLit(g);
    }

    public static FloatLit of(String t) {
        BigDecimal g = new BigDecimal(t);
        return new FloatLit(g);
    }

    public static FloatLit of(BigInteger d) {
        BigDecimal g = new BigDecimal(d);
        return new FloatLit(g);
    }

    public static FloatLit of(BigDecimal g) {
        return new FloatLit(g);
    }

    public FloatLit(BigDecimal value) {
        super(value);
        _types.add("float");
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof FloatLit) {
            FloatLit that = (FloatLit)other;
            return Objects.equals(this.value, that.value);
        }
        else return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.value);
        return hash;
    }
    
    @Override
    public int compareTo(Expr o) {
        if (o.types().contains("int")) {
            IntLit that = (IntLit)o;
            BigDecimal y = new BigDecimal(that.value);
            return this.value.compareTo(y);
        }
        else if (o.types().contains("float")) {
            FloatLit that = (FloatLit)o;
            return this.value.compareTo(that.value);
        }
        else {
            String msg = String.format(
                    "Comparação inválida entre 'float' e %s.", o.types());
            throw new TypeError(msg);            
        }
    }

    @Override
    public Expr negate() {
        return new FloatLit(value.negate());
    }

    @Override
    public Expr add(Expr other) {
        if (other.types().contains("int")) {
            BigDecimal y = new BigDecimal(((IntLit)other).value);
            BigDecimal z = this.value.add(y);
            return new FloatLit(z);
        }
        else if (other.types().contains("float")) {
            FloatLit that = (FloatLit)other;
            BigDecimal z = this.value.add(that.value);
            return new FloatLit(z);
        }
        else {
            String msg = String.format(
                    "Tipos incompatíveis: 'float' e %s.", other.types());
            throw new TypeError(msg);
        }
    }

    @Override
    public Expr subtract(Expr other) {
        if (other.types().contains("int")) {
            BigDecimal y = new BigDecimal(((IntLit)other).value);
            BigDecimal z = this.value.subtract(y);
            return new FloatLit(z);
        }
        else if (other.types().contains("float")) {
            FloatLit that = (FloatLit)other;
            BigDecimal z = this.value.subtract(that.value);
            return new FloatLit(z);
        }
        else {
            String msg = String.format(
                    "Tipos incompatíveis: 'float' e %s.", other.types());
            throw new TypeError(msg);
        }
    }

    @Override
    public Expr multiply(Expr other) {
        if (other.types().contains("int")) {
            BigDecimal y = new BigDecimal(((IntLit)other).value);
            BigDecimal z = this.value.multiply(y);
            return new FloatLit(z);
        }
        else if (other.types().contains("float")) {
            FloatLit that = (FloatLit)other;
            BigDecimal z = this.value.multiply(that.value);
            return new FloatLit(z);
        }
        else {
            String msg = String.format(
                    "Tipos incompatíveis: 'float' e %s.", other.types());
            throw new TypeError(msg);
        }
    }

    @Override
    public Expr divide(Expr other, int scale) {
        if (other.types().contains("int")) {
            BigDecimal y = new BigDecimal(((IntLit)other).value);
            BigDecimal z = this.value.divide(y, scale, RoundingMode.HALF_EVEN);
            return new FloatLit(z);
        }
        else if (other.types().contains("float")) {
            FloatLit that = (FloatLit)other;
            BigDecimal z = this.value.divide(that.value, scale, RoundingMode.HALF_EVEN);
            return new FloatLit(z);
        }
        else {
            String msg = String.format(
                    "Tipos incompatíveis: 'float' e %s.", other.types());
            throw new TypeError(msg);
        }
    }

    @Override
    public Expr quotient(Expr other) {
        if (other.types().contains("int")) {
            BigDecimal y = new BigDecimal(((IntLit)other).value);
            BigDecimal z = this.value.divideToIntegralValue(y);
            return new FloatLit(z);
        }
        else if (other.types().contains("float")) {
            FloatLit that = (FloatLit)other;
            BigDecimal z = this.value.divideToIntegralValue(that.value);
            return new FloatLit(z);
        }
        else {
            String msg = String.format(
                    "Tipos incompatíveis: 'float' e %s.", other.types());
            throw new TypeError(msg);
        }
    }

    @Override
    public Expr remainder(Expr other) {
        if (other.types().contains("int")) {
            BigDecimal y = new BigDecimal(((IntLit)other).value);
            BigDecimal z = this.value.remainder(y);
            return new FloatLit(z);
        }
        else if (other.types().contains("float")) {
            FloatLit that = (FloatLit)other;
            BigDecimal z = this.value.remainder(that.value);
            return new FloatLit(z);
        }
        else {
            String msg = String.format(
                    "Tipos incompatíveis: 'float' e %s.", other.types());
            throw new TypeError(msg);
        }
    }
    
}
