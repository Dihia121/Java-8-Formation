package Almerys.TP1;

public class Feature {
    public final String name;

    public RoleExpression roleExpression;

    public Feature(String name) { this(name, null);}

    public Feature(String name, RoleExpression roleExpression) {
        if(name == null || name.isBlank())
            throw new IllegalArgumentException("name cannot be null or blank");
        this.name = name;
        this.roleExpression = roleExpression;
    }

    public boolean isEnabled(Roles roles) {
        if(roles == null)
            throw new IllegalArgumentException("name roles be null");
        if(roleExpression == null)
            return true;
        return roleExpression.toPredicate().test(roles);
    }
}
