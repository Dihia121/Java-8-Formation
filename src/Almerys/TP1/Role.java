package Almerys.TP1;

import java.util.regex.Pattern;

public class Role {
    public final String name;

    public Role(String name) {
        if(name == null || name.isBlank())
            throw new IllegalArgumentException("name cannot be null or blank");
        if(!Pattern.matches("[A-Za-z0-9]+", name))
            throw new IllegalArgumentException("invalid role name");
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;
        return name.equalsIgnoreCase(role.name);
    }

    @Override
    public int hashCode() { return name.toLowerCase().hashCode(); }



}
