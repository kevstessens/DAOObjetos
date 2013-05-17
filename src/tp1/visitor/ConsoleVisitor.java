package tp1.visitor;

import tp1.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConsoleVisitor implements QueryVisitor {

    @Override
    public void visit(SqlQuery sqlQuery) {

    }

    @Override
    public void visit(Column column) {
        System.out.print(column.getName() + " ");
    }

    @Override
    public void visit(Table table) {
        System.out.print(table.getName() + " ");
    }

    @Override
    public void visit(Const constant) {
        System.out.print(constant.getValue().toString() + " ");

    }

    @Override
    public void visit(Value value) {
        System.out.print(value.getValue().toString() + " ");

    }

    @Override
    public void visit(Condition condition) {
        System.out.print(condition.getOperator() + " ");
    }

    @Override
    public void visit(Select select) {
        System.out.println("\nSELECT");

    }


    @Override
    public void visit(From from) {
        System.out.println("\nFROM");
    }

    @Override
    public void visit(Where where) {
        System.out.println("\nWHERE");
    }

    @Override
    public void visit(GroupBy groupBy) {
            System.out.println("\nGROUPBY");
    }

    @Override
    public void visit(OrderBy orderBy) {
            System.out.println("\nORDERBY");
    }

    @Override
    public void visit(Limit limit) {
            System.out.println("\nLIMIT\n"+limit.getLimit());
    }

    @Override
    public void visit(Offset offset) {
            System.out.println("OFFSET\n"+ offset.getOffset());
    }

    @Override
    public void visit(ArrayList list) {
        System.out.println(list.toString().replace("[", "").replace("]", ""));
    }

}
