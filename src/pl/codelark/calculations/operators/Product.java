package pl.codelark.calculations.operators;

import pl.codelark.calculations.Expression;

public class Product extends Operator2 {

    public Product(Expression expr1, Expression expr2) {
        super(expr1, expr2);
    }

    @Override
    public double calc() {
        return arg1.calc() * arg2.calc();
    }

    @Override
    public String operatorToString() {
        return String.format("%s * %s", arg1, arg2);
    }
}
