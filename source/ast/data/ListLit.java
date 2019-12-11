package source.ast.data;

import java.util.List;
import java.util.Objects;

public class ListLit extends Literal {

    public static final ListLit NIL = new ListLit(null, null) {
        
        @Override
        public Expr head() {
            throw new UnsupportedOperationException("NIL: head é inválido.");
        }

        @Override
        public ListLit tail() {
            throw new UnsupportedOperationException("NIL: tail é inválido.");
        }
    };

    private final Expr _head;
    private final ListLit _tail;

    protected ListLit(Expr head, ListLit tail) {
        super();
        this._head = head;
        this._tail = tail;
        _types.add("list");
    }
    
    public static ListLit cons(Expr head, ListLit tail) {
        return new ListLit(head, tail);
    }
    
    public static ListLit fromJavaList(List<Expr> exprList) {
        ListLit acc = NIL;
        int i = exprList.size() - 1;
        while (i >= 0) {
            Expr x = exprList.get(i);
            acc = cons(x, acc);
            i -= 1;
        }
        return acc;
    }

    public Expr head() {
        return _head;
    }

    public ListLit tail() {
        return _tail;
    }
    
    public Expr get(int n) {
        if (n <= 0) {
            return head();
        }
        else {
            return tail().get(n-1);
        }
    }

    public int length() {
        ListLit curr = this;
        int len = 0;
        while (curr != NIL) {
            len += 1;
            curr = curr._tail;
        }
        return len;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof ListLit) {
            ListLit that = (ListLit)other;
            return Objects.equals(this._head, that._head) 
                    && Objects.equals(this._tail, that._tail);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this._head);
        hash = 13 * hash + Objects.hashCode(this._tail);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListLit acc = this;
        while (acc != NIL) {
            if (acc != this) sb.append(", ");
            sb.append(acc._head.toString());
            acc = acc._tail;
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String repr() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListLit acc = this;
        while (acc != NIL) {
            if (acc != this) sb.append(", ");
            sb.append(acc._head.repr());
            acc = acc._tail;
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int compareTo(Expr o) {
        if (o.types().contains("list")) {
            ListLit that = (ListLit)o;
            if (this == NIL && that == NIL) {
                return 0;
            }
            else if (that == NIL) {
                return 1;
            }
            else if (this == NIL) {
                return -1;
            }
            else {
                int c = this._head.compareTo(that._head);
                if (c != 0) {
                    return c;
                }
                else {
                    return this._tail.compareTo(that._tail);
                }
            }
        }
        else {
            String msg = String.format("Comparação inválida entre 'list' e %s.", o.types());
            throw new TypeError(msg);
        }
    }

}
