package pl.codelark.calculations.operators;

import pl.codelark.calculations.Expression;

public class Division extends Product {

    public Division(Expression expr1, Expression expr2) {
        super(expr1, new Inverse(expr2));
    }
}
