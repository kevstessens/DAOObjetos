package tp1;

import com.sun.istack.internal.NotNull;
import tp1.visitor.QueryVisitor;
import static tp1.Condition.*;


public class Column<T extends Comparable<T>> extends Value<T>{
    private final String columnName;

    public Column(@NotNull String columnName){
        this.columnName = columnName;
    }

    public Condition isNull() {
        return condition(Operator.IS_NULL, this);
    }

    public Condition isNotNull() {
        return condition(Operator.IS_NOT_NULL, this);
    }

    public Condition greaterThan(Value<Integer> value) {
        return condition(Operator.GREAT, this, value);
    }

    public Condition greaterEqualThan(Value<Integer> value) {
        return condition(Operator.GREAT, this, value);
    }

    public Condition lessThan(Value<Integer> value) {
        return condition(Operator.LESS, this, value);
    }

    public Condition equalTo(Value<Integer> value) {
        return condition(Operator.EQ, this, value);
    }

    public Condition ne(Value<Integer> value) {
        return condition(Operator.NE, this, value);
    }

    public String getName(){
        return columnName;
    }


    public void accept(QueryVisitor visitor){
        visitor.visit(this);
    }
}
