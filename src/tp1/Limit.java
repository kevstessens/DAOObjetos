package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

public class Limit implements Visitable {
    private final int limit;

    public Limit(int limit) {
        this.limit = limit;
    }

    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
    }

    public int getLimit() {
        return limit;
    }
}
