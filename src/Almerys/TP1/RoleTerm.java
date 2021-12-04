package Almerys.TP1;

import java.util.function.Predicate;

public class RoleTerm implements RoleExpression{

    private final Role role;

    public RoleTerm(Role role) {
        if( role == null)
            throw new IllegalArgumentException("cannot be null");
        this.role = role;
    }

    @Override
    public Predicate<Roles> toPredicate() {
        return roles -> roles.contains(role);
    }

    @Override
    public String stringify() {
        return role.name;
    }
}
