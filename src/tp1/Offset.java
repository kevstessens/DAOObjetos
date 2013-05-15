package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

public class Offset implements Visitable {
    private final int offset;

    public Offset(int offset) {
        this.offset = offset;
    }

    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
    }

    public boolean isEmpty(){
        return offset==0;
    }

    public int getOffset() {
        return offset;
    }
}
