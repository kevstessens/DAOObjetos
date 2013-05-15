package tp1.visitor;

import tp1.*;

/**
 * Created with IntelliJ IDEA.
 * User: kevin
 * Date: 26/04/13
 * Time: 08:28
 * To change this template use File | Settings | File Templates.
 */
public class JsonVisitor implements QueryVisitor {


    @Override
    public void visit(SqlQuery sqlQuery) {
            //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(Column column) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(Table table) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(Const constant) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(Value value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(Condition condition) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(Select select) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(From from) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(Where where) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(GroupBy groupBy) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(OrderBy orderBy) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(Limit limit) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void visit(Offset offset) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
