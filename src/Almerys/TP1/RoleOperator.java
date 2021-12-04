package Almerys.TP1;

import java.util.Arrays;
import java.util.Objects;

public abstract class RoleOperator implements RoleExpression{
    protected RoleExpression[] operands;

    public RoleOperator(RoleExpression... operands) {
        if(operands == null)
            throw new IllegalArgumentException("Operands cannot be null");
        if(Arrays.stream(operands).anyMatch(Objects::isNull)) //check if stream contains null anyMatch(x->x==null)
            throw new IllegalArgumentException("Operands cannot contain null");
        this.operands = operands;

    }
}
