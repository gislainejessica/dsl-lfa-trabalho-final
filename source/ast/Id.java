package source.ast;

public class Id {

    private Object id;
    
    public Id(Object o) {
        this.id = o;
    }

    @Override
    public String toString() {
        return "Id{" + "id=" + id + '}';
    }
    
    
}
