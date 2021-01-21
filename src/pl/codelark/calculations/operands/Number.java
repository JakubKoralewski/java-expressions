package pl.codelark.calculations.operands;

public class Number extends Operand {

    private final double number;

    public Number(double number) {
        this.number = number;
    }

    @Override
    public double calc() {
        return number;
    }

    @Override
    public String toString() {
        if ((number == Math.floor(number)) && !Double.isInfinite(number)) {
            // integer type
            return String.format("%s", (int)number);
        }

        return String.format("%.3f", number);
    }
}
