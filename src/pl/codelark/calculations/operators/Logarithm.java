package pl.codelark.calculations.operators;

import pl.codelark.calculations.Expression;

public class Logarithm extends Operator2 {

    public Logarithm(Expression expr1, Expression expr2) {
        super(expr1, expr2);
    }

    @Override
    public double calc() {
        var base = arg1.calc();
        var num = arg2.calc();
        return Math.log(base) / Math.log(num);
    }

    @Override
    public String operatorToString() {
        return String.format("log_%s(%s)", arg1, arg2);
    }
}
