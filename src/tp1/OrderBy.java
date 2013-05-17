package tp1;

import com.sun.istack.internal.NotNull;
import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

import java.util.ArrayList;
import java.util.List;

public class OrderBy implements Visitable {
    @NotNull
    private final List<Column> orderByColumns;

    public OrderBy(@NotNull List<Column> orderByColumns) {
        this.orderByColumns = orderByColumns;
    }

    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
        ArrayList<String> cols = new ArrayList();
        for (Column orderByColumn : orderByColumns) {
            cols.add(orderByColumn.getName());
        }
        visitor.visit(cols);
    }

}
