package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;
import java.util.List;

public class OrderBy implements Visitable {
    private final List<Column> orderByColumns;

    public OrderBy(List<Column> orderByColumns) {
        this.orderByColumns = orderByColumns;
    }

    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
        for (Column orderByColumn : orderByColumns) {
            orderByColumn.accept(visitor);
        }
    }

    public boolean isEmpty() {
        return orderByColumns==null || orderByColumns.isEmpty();
    }
}
