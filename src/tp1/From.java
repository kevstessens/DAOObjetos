package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;
import java.util.List;


public class From implements Visitable {
    private final List<Table> fromTables;

    public From(List<Table> fromTables) {
        this.fromTables = fromTables;
    }

    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
        for (Table fromTable : fromTables) {
            fromTable.accept(visitor);
        }

    }

    public boolean isEmpty(){
        return fromTables==null || fromTables.isEmpty();
    }
}
