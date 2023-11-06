package tests.test6.equation;

public class App {
    public static void main(String[] args) {
        demoQuadraticEquation();
    }

    public static void demoQuadraticEquation() {
        QuadraticEquation[] equations = {
            new QuadraticEquation(1, 2, 3),
            new QuadraticEquation(0, 2, 3),
            new QuadraticEquation(1, 0, 3),
            new QuadraticEquation(1, 2, 0),
            new QuadraticEquation(1, -1, 0),
            new QuadraticEquation(1, 1, 1),
            new QuadraticEquation(0, 0, 0),
        };

        for (QuadraticEquation equation : equations) {
            System.out.printf("%-20s", equation);
            System.out.printf("%12s %n",
                equation.isQuadraticEquation() ? "is quadratic" :
                equation.isLinearEquation() ? "is linear" :
                "is constant");
        }
    }
}
