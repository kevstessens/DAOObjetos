package tp1;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class SqlQueryBuilder {
    private List<Column> selectColumns;
    private List<Table> fromTables;
    private Condition whereClause;
    private List<Column> orderByColumns;
    private List<Column> groupByColumns;
    private int limit;
    private int offset;

    private SqlQueryBuilder() {
        selectColumns = new ArrayList<>();
    }

    public static SqlQueryBuilder sqlQuery() {
        return new SqlQueryBuilder();
    }

    @NotNull
    public SqlQueryBuilder select(Column... columns) {
        selectColumns = asList(columns);
        return this;
    }

    @NotNull
    public SqlQueryBuilder from(@Nullable Table... tables) {
        fromTables = asList(tables);
        return this;
    }

    @NotNull
    public SqlQueryBuilder where(@NotNull final Condition condition) {
        whereClause = condition;
        return this;
    }

    @NotNull
    public SqlQueryBuilder orderBy(Column... columns) {
        orderByColumns = asList(columns);
        return this;
    }

    @NotNull
    public SqlQueryBuilder groupBy(Column... columns) {
        groupByColumns = asList(columns);
        return this;
    }

    @NotNull
    public SqlQueryBuilder limit(int limit) {
        if (limit < 0)
            throw new NumberFormatException();
        else {
            this.limit = limit;
            return this;
        }
    }

    @NotNull
    public SqlQueryBuilder offset(int offset) {
        if (offset < 0)
            throw new NumberFormatException();
        else {
            this.offset = offset;
            return this;
        }
    }

    public SqlQuery build() throws Exception {
        return  new SqlQuery(selectColumns, fromTables, whereClause, orderByColumns, groupByColumns, limit, offset );

    }

}
