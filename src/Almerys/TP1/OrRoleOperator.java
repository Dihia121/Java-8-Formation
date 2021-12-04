package Almerys.TP1;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OrRoleOperator extends RoleOperator{
    public OrRoleOperator(RoleExpression left, RoleExpression right) {
        super(left, right);
    }

    @Override
    public Predicate<Roles> toPredicate() {
        return Arrays.stream(operands)
                .map(RoleExpression::toPredicate)
                .reduce(Predicate::or)
                .orElseThrow(IllegalStateException::new);
    }

    @Override
    public String stringify() {
        return Arrays.stream(operands)
                .map(RoleExpression::stringify)
                .collect(Collectors.joining(" || ", "(", ")"));
    }
}
