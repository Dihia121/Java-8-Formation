package Almerys.TP1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Roles {
    private final Set<Role> roles;

    public Roles(Set<Role> roles) {
       this.roles = roles;
    }

    public boolean contains(Role role) {
        return this.roles.contains(role);
    }

    public static Roles of(Role... roles) { //Array Ex:{1, 2,3,...} s'adapte a ce q j veu
        return new Roles(Arrays.stream(roles)
                .filter(role -> role != null)
                .collect(Collectors.toSet()));
    }

    public static Roles of(String... roleNames) {
        return new Roles(Arrays.stream(roleNames)
                .filter(roleName -> roleName != null && !roleName.isBlank())
                .map(roleName -> new Role(roleName))
                .collect(Collectors.toSet()));
    }

}
