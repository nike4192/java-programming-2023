package tests.test6.equation;

import java.text.DecimalFormat;
import java.util.ArrayList;

public record QuadraticEquation(double a, double b, double c) {
    public QuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0 && c != 0) {
            throw new IllegalArgumentException("equation is wrong");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isQuadraticEquation() {
        return a != 0;
    }

    public boolean isLinearEquation() {
        return !isQuadraticEquation() && b != 0;
    }

    public String toString() {
        ArrayList<String> pieces = new ArrayList<>();

        DecimalFormat format = new DecimalFormat("0.#");

        if (a != 0) pieces.add((Math.abs(a) != 1 ? format.format(a) : a > 0 ? "" : "-") + "x^2");
        if (b != 0) pieces.add((Math.abs(b) != 1 ? format.format(b) : b > 0 ? "" : "-") + "x");
        pieces.add(format.format(c));

        return String.join(" + ", pieces).replaceAll("\\+ -", "- ") + " = 0";
    }
}
