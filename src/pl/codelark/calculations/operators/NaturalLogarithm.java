package pl.codelark.calculations.operators;

import pl.codelark.calculations.Expression;

public class NaturalLogarithm extends Operator1 {

    public NaturalLogarithm(Expression expr1) {
        super(expr1);
    }

    @Override
    public double calc() {
        return Math.log(arg1.calc());
    }

    @Override
    public String operatorToString() {
        return String.format("ln(%s)", arg1);
    }
}
