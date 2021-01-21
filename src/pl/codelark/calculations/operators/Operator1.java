package pl.codelark.calculations.operators;

import pl.codelark.calculations.Expression;

public abstract class Operator1 extends Operator {

    protected Expression arg1;

    public Operator1(Expression a1) {
        if (a1 == null) {
            throw new IllegalArgumentException("first argument was null");
        }
        arg1 = a1;
    }
}
