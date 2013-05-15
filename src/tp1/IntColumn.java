package tp1;
import static tp1.Condition.condition;
public class IntColumn extends Column<Integer> {

    public IntColumn(String name){
        super(name);
    }

    public Condition greaterThan(Value<Integer> value) {
        return condition(Operator.GREAT, this, value);
    }
    public Condition lessThan(Value<Integer> value) {
        return condition(Operator.LESS, this, value);
    }
    public Condition between(Value<Integer> left, Value<Integer> right) {
        return greaterThan(left).and(lessThan(right));
    }

    public Condition equalTo(Value<Integer> value) {
        return condition(Operator.EQ, this, value);
    }

    public Condition ne(Value<Integer> value) {
        return condition(Operator.NE, this, value);
    }
}
