package tp1;

import tp1.visitor.QueryVisitor;

/**
 * Created with IntelliJ IDEA.
 * User: kevin
 * Date: 07/05/13
 * Time: 17:36
 * To change this template use File | Settings | File Templates.
 */
public class UnitaryCondition extends Condition {

    private final Operator operator;
    private final Statement<?> left;

    public UnitaryCondition(Operator operator, Statement<?> unary) {
        this.operator = operator;
        this.left = unary;
    }

    public Operator getOperator() {
        return operator;
    }

    public Statement<?> getRight() {
        return left;
    }

    @Override
    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
        left.accept(visitor);
    }
}
