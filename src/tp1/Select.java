package tp1;

import com.sun.istack.internal.NotNull;
import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

import java.util.ArrayList;
import java.util.List;

public class Select implements Visitable {
    @NotNull
    private final List<Column> selectColumns;

    public Select(List<Column> selectColumns) {
        this.selectColumns = selectColumns;
    }

    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
        ArrayList<String> cols = new ArrayList();
        for (Column selectColumn : selectColumns) {
            cols.add(selectColumn.getName());
        }
        visitor.visit(cols);
    }

    public List<Column> getSelectColumns() {
        return selectColumns;
    }

}
