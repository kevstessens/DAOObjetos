package tp1;

import static tp1.Condition.*;


public class StrColumn extends Column<String>{

    public StrColumn(String name){
        super(name);
    }


    public Condition equals(Value<String> value) {
        return condition(Operator.EQ, this, value);
    }

    public Condition startsWith(Value<String> value) {
        return condition(Operator.STARTS, this, value);
    }

    public Condition contains(Value<String> value) {
        return condition(Operator.CONTAINS, this, value);
    }




}
