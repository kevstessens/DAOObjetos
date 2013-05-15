package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: keevstessens
 * Date: 26/04/13
 * Time: 15:25
 * To change this template use File | Settings | File Templates.
 */
public enum Operator {
    AND("and"),
    OR("or"),
    LESS("<"),
    GREAT(">"),
    EQ("="),
    NE("!="), STARTS("starts"), CONTAINS("contains"),  IS_NULL("is null"), IS_NOT_NULL("is not null"), NOT("not");
    private final String name;

    private Operator(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
