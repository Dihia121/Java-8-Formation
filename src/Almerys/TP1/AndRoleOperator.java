package Almerys.TP1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AndRoleOperator extends RoleOperator {

    public AndRoleOperator(RoleExpression left, RoleExpression right) {
        super(left, right);
    }

    @Override
    public Predicate<Roles> toPredicate() {
        return Arrays.stream(operands)
                .map(RoleExpression::toPredicate)
                .reduce(Predicate::and)
                .orElseThrow(IllegalStateException::new);
    }

    @Override
    public String stringify() {
        return Arrays.stream(operands)
                .map(RoleExpression::stringify)
                .collect(Collectors.joining(" && ", "(", ")"));
    }
}
