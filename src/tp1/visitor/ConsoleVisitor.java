package tp1.visitor;

import tp1.*;

import java.util.List;

public class ConsoleVisitor implements QueryVisitor {

    private String createSVFromList(List<?> list, String first, String separator, String end) {
        String stringList = "" + first;
        for (int i = 0; i < list.size() - 1; i++) {
            stringList += list.get(i).toString() + separator;
        }
        if (!list.isEmpty()) {
            stringList += list.get(list.size() - 1).toString();
        }
        stringList += end;
        return stringList;
    }

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
        if (!groupBy.isEmpty()) {

            System.out.println("\nGROUPBY");
        }
    }

    @Override
    public void visit(OrderBy orderBy) {
        if (!orderBy.isEmpty()) {
            System.out.println("\nORDERBY");
        }
    }

    @Override
    public void visit(Limit limit) {
        if (!limit.isEmpty()) {
            System.out.println("\nLIMIT\n"+limit.getLimit());
        }
    }

    @Override
    public void visit(Offset offset) {
        if (!offset.isEmpty()) {
            System.out.println("OFFSET\n"+ offset.getOffset());
        }
    }

}
