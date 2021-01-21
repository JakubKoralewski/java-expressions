package pl.codelark.calculations.operators;

import pl.codelark.calculations.Expression;

public class Inverse extends Operator1 {

    public Inverse(Expression expr) {
        super(expr);
    }

    @Override
    public double calc() {
        double d = arg1.calc();
        if (d == 0) throw new ArithmeticException("inverse of 0");
        return 1 / d;
    }

    @Override
    public String operatorToString() {
        if (arg1.isOperand()) return String.format("1 / %s", arg1);
        else return String.format("%s ^ -1", arg1);
    }
}
