package pl.codelark.calculations.operands;

import java.util.HashMap;
import java.util.Map;

public class MathConstant extends Operand {

    private static final Map<String, Double> constantMap =  new HashMap<>() {{
        put("pi", 3.14);
        put("e", 2.71828);
        put("phi", 1.618);
    }};

    private final double number;

    public MathConstant(String constant) {
        constant = constant.strip().toLowerCase();
        if(!MathConstant.constantMap.containsKey(constant)) {
            throw new Error("Unknown constant: " + constant);
        }
        this.number = MathConstant.constantMap.get(constant);
    }

    @Override
    public double calc() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%.3f", number);
    }
}
