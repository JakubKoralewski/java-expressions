package pl.codelark.calculations.operands;

import java.util.*;

public class Variable extends Operand {

    private static final Map<String, Double> variables = new TreeMap<String, Double>();

    public static boolean check(String var) {
        if (var == null) {
            throw new IllegalArgumentException("variable is null");
        }
        return variables.containsKey(var);
    }
    public static void add(String var) {
        if (var == null) {
            throw new IllegalArgumentException("variable is null");
        }
        if (! var.matches("\\p{Alpha}\\w*")) {
            throw new IllegalArgumentException("variable isn't a valid identifier");
        }
        if (check(var)) throw new IllegalStateException("variable " + var + " already exists");
        variables.put(var, 0.0);
    }
    public static void change(String zm, double licz) {
        if (! check(zm)) {
            throw new IllegalStateException("variable " + zm + " doesn't exist");
        }
        variables.replace(zm, licz);
    }
    public static void delete(String zm) {
        if (check(zm)) variables.remove(zm);
    }

    private final String variable;

    public Variable(String zm) {
        if (zm == null) throw new IllegalArgumentException("zmienna jest null");
        if (!zm.matches("\\p{Alpha}\\w*")) {
            throw new IllegalArgumentException("zmienna nie jest poprawnym identyfikatorem");
        }
        variable = zm;
    }

    @Override
    public double calc() {
        if (! check(variable)) {
            throw new IllegalStateException("zmienna " + variable + " nie istnieje");
        }
        return variables.get(variable);
    }

    @Override
    public String toString() {
        return variable;
    }
}
