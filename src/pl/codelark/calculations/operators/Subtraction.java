package pl.codelark.calculations.operators;

import pl.codelark.calculations.Expression;

public class Subtraction extends Addition {

    public Subtraction(Expression expr1, Expression expr2) {
        super(expr1, new Negation(expr2));
    }
}
