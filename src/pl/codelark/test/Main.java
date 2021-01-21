package pl.codelark.test;

import pl.codelark.calculations.Expression;
import pl.codelark.calculations.operands.Variable;
import pl.codelark.calculations.operators.*;
import pl.codelark.calculations.operands.Number;

public class Main {

    public static void main(String[] args) {
        Expression test1 = new Addition(
                new Number(3),
                new Number(5)
        );
        Main.test(test1, "(3 + 5)", 8.0);

        Expression test2 = new Product(
                new Division(
                        new Number(1),
                        new Subtraction(
                                new Number(2),
                                new Variable("x")
                        )
                ),
                new Number(7)
        );
        Main.test(test2, "((1 * ((2 + (- x)) ^ -1)) * 7)");
        Variable.delete("x");

        Expression test3 = new Division(
                new Negation(
                        new Subtraction(
                                new Product(
                                        new Number(3),
                                        new Number(11)
                                ),
                                new Number(1)
                        )
                ),
                new Addition(
                        new Number(7),
                        new Number(5)
                )
        );
        Main.test(test3, "((- ((3 * 11) + (- 1))) * ((7 + 5) ^ -1))", -2.6666666667);

//        Expression test4 =  SyntaxErrro bad parantheses
        Expression test5 = new Addition(
                new Exponent(
                        new Number(2),
                        new Number(5)
                ),
                new Product(
                        new Variable("x"),
                        new NaturalLogarithm(
                                new Variable("x")
                        )
                )
        );
        Main.test(test5, "((2^5) + (x * (ln(x))))");
    }

    private static void test(Expression input, String stringOutput, double output) {
        if (!Main.areEqualDouble(input.calc(), output, 5)) {
            throw new Error("Expected number: " + output + ", for input: \"" + input.toString() + "\". (" + input.calc() + ")");
        }
        Main.test(input, stringOutput);
    }

    public static boolean areEqualDouble(double a, double b, int precision) {
        return Math.abs(a - b) <= Math.pow(10, -precision);
    }

    private static void test(Expression input, String stringOutput) {
        if (!input.toString().strip().toLowerCase().equals(stringOutput.strip().toLowerCase())) {
            throw new Error("Expected string: \"" + stringOutput + "\" for input: " + input.toString());
        }
        System.out.println("ok: \"" + input.toString() + "\"");
    }
}
