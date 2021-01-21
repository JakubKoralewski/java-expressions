package pl.codelark.calculations.operators;

import pl.codelark.calculations.Expression;

public abstract class Operator extends Expression {

    public boolean isOperand() {
        return false;
    }

    public abstract String operatorToString();

    @Override
    public String toString() {
        return String.format("(%s)", this.operatorToString());
    }
}
