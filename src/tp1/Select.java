package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;
import java.util.List;

public class Select implements Visitable {
    private final List<Column> selectColumns;

    public Select(List<Column> selectColumns) {
        this.selectColumns = selectColumns;
    }

    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
        if (!isEmpty()) {
            for (Column selectColumn : selectColumns) {
                selectColumn.accept(visitor);
            }
        }
    }

    public boolean isEmpty() {
        return selectColumns == null || selectColumns.isEmpty();
    }
}
