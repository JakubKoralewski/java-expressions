package pl.codelark.calculations.operators;

import pl.codelark.calculations.Expression;

public abstract class Operator2 extends Operator1 {

    protected Expression arg2;

    public Operator2(Expression a1, Expression a2) {
        super(a1);
        if (a2 == null) {
            throw new IllegalArgumentException("second argument was null");
        }
        arg2 = a2;
    }
}
