package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kevin
 * Date: 4/19/13
 * Time: 4:58 PM
 * To change this template use File | Settings | File Templates.
 */

public class Table implements Visitable {

    private final List<Column> columns;
    private final String name;

    public Table(List<Column> columns, String name) {
        this.columns = columns;
        this.name = name;
    }
    public Table(String name) {
        this.columns = new ArrayList<Column>();
        this.name = name;
    }

    public StrColumn str(String columnName) {
        if (!columns.isEmpty()) {
            for (Column column : columns) {
                if (column.getName().equals(columnName)) {
                    return (StrColumn) column;
                }
            }
        }
        StrColumn column = new StrColumn(columnName);
        columns.add(column);
        return column;
    }

    public IntColumn number(String columnName) {
        if (!columns.isEmpty()) {
            for (Column column : columns) {
                if (column.getName().equals(columnName)) {
                    return (IntColumn) column;
                }
            }
        }
        IntColumn column = new IntColumn(columnName);
        columns.add(column);
        return column;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
    }
}
