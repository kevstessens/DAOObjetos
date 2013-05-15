package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

import java.util.List;


public class SqlQuery implements Visitable {
    private final Select select;
    private final From from;
    private final Where where;
    private final OrderBy orderBy;
    private final GroupBy groupBy;
    private final Limit limit;
    private final Offset offset;

    SqlQuery(List<Column> selectColumns, List<Table> fromTables, Condition condition,List<Column> orderByColumns, List<Column> groupByColumns, int limit, int offset) {
        this.select = new Select(selectColumns);
        this.from = new From(fromTables);
        this.where = new Where(condition);
        this.orderBy = new OrderBy(orderByColumns);
        this.groupBy = new GroupBy(groupByColumns);
        this.limit = new Limit(limit);
        this.offset = new Offset(offset);

    }

    private String createSVFromList(List<?> list, String first, String separator, String end) {
       String stringList = ""+ first;
        for (int i=0; i< list.size()-1; i++) {
            stringList += list.get(i).toString() + separator;
        }
        if(!list.isEmpty()){
            stringList += list.get(list.size()-1).toString();
        }
        stringList += end;
        return  stringList;
    }

    @Override
    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
        select.accept(visitor);
        from.accept(visitor);
        where.accept(visitor);
        orderBy.accept(visitor);
        groupBy.accept(visitor);
        limit.accept(visitor);
        offset.accept(visitor);
    }

}
