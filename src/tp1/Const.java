package tp1;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

/**
 * Created with IntelliJ IDEA.
 * User: kevin
 * Date: 4/19/13
 * Time: 5:01 PM
 * To change this template use File | Settings | File Templates.
 *
 */
public class Const<T> extends Value<T>{
    private T str;

    private Const(T str) {
        this.str = str;
    }

    public static Const<String> cons(@NotNull String str) {
        return new Const<String>(str);
    }

    public static Const<Integer> cons(@NotNull Integer integer) {
        return new Const<Integer>(integer);
    }

    @Override
    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
    }

    public T getValue(){
        return str;
    }

}
