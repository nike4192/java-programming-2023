package tests.test3.shapes;

/* https://en.wikipedia.org/wiki/Ellipse */
public class Ellipse extends AbstractShape {
    private final double a;
    private final double b;

    public Ellipse(double a, double b) {
        if (a <= 0) {
            throw new IllegalArgumentException("a must be greater than 0");
        }
        if (b <= 0) {
            throw new IllegalArgumentException("b must be greater than 0");
        }
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    double calculateArea() {
        return Math.PI * a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2);
    }

    @Override
    void printInfo() {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
