package Almerys.TP1;

import java.util.function.Predicate;

public interface RoleExpression {
    Predicate<Roles> toPredicate();

    String stringify();
}
