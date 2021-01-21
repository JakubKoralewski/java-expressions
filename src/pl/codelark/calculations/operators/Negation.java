package pl.codelark.calculations.operators;

import pl.codelark.calculations.Expression;

public class Negation extends Operator1 {

    public Negation(Expression a1) {
        super(a1);
    }

    @Override
    public double calc() {
        return -arg1.calc();
    }
    @Override
    public String operatorToString() {
        return String.format("- %s", arg1);
    }
}
