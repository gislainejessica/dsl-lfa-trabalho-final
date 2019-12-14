package source.ast;

import java.util.Objects;

public class Inteiro  {
    public Integer value = 0;

    public Inteiro(Integer value) {
        this.value = value;
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Inteiro) {
            Inteiro that = (Inteiro)other;
            return Objects.equals(this.value, that.value);
        }
        else return false;
    }
    
}
