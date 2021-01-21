package pl.codelark.calculations;

public abstract class Expression implements Calculatable {

    // metoda sumująca wyrażenia
    public static double sum(Expression... expr) {
        double s = 0.0;
        for (Expression w: expr) {
            s += w.calc();
        }
        return s;
    }
    // metoda mnożąca wyrażenia
    public static double product(Expression... expr) {
        double il = 1.0;
        for (Expression w: expr) {
            il *= w.calc();
        }
        return il;
    }

    public abstract boolean isOperand();

    @Override
    public boolean equals(Object ob) {
        if(ob instanceof Expression) {
            return calc() == ((Expression)ob).calc();
        } else {
            throw new Error("Can't compare with not Expression");
        }
    }
}
