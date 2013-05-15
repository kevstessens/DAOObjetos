package tp1.visitor;

import tp1.*;

/**
 * Created with IntelliJ IDEA.
 * User: kevin
 * Date: 26/04/13
 * Time: 08:27
 * To change this template use File | Settings | File Templates.
 */
public interface QueryVisitor {

    public void visit(SqlQuery sqlQuery);

    public void visit(Column column);

    public void visit(Table table);

    public void visit(Const constant);

    public void visit(Value value);

    public void visit(Condition condition);

    public void visit(Select select);

    void visit(From from);

    void visit(Where where);

    void visit(GroupBy groupBy);

    void visit(OrderBy orderBy);

    void visit(Limit limit);

    void visit(Offset offset);
}
