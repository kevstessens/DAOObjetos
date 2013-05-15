package tp1;

import tp1.visitor.QueryVisitor;

/**
 * Created with IntelliJ IDEA.
 * User: kevin
 * Date: 07/05/13
 * Time: 17:36
 * To change this template use File | Settings | File Templates.
 */
public class BinaryCondition extends Condition {

    private final Statement<?> left;
    private final Statement<?> right;
    private final Operator operator;

    public BinaryCondition(Operator operator, Statement<?> left, Statement<?> right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public Operator getOperator() {
        return operator;
    }

    public Statement<?> getLeft() {
        return left;
    }

    public Statement<?> getRight() {
        return right;
    }

    @Override
    public void accept(QueryVisitor visitor) {
        left.accept(visitor);
        visitor.visit(this);
        right.accept(visitor);
    }
}
