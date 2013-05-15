package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

/**
 * Created with IntelliJ IDEA.
 * User: kevin
 * Date: 09/05/13
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
public class Where implements Visitable {
    private final Condition condition;

    public Where(Condition condition) {
        this.condition = condition;
    }

    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
        condition.accept(visitor);
    }
}
