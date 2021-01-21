package pl.codelark.calculations.operands;

import pl.codelark.calculations.Expression;

public abstract class Operand extends Expression {
    @Override
    public boolean isOperand() {
        return true;
    }
}
