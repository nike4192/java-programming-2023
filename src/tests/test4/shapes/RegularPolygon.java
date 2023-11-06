package tests.test4.shapes;

/* https://en.wikipedia.org/wiki/Regular_polygon */
public class RegularPolygon extends AbstractShape {
    private final double side;  // s
    private final int edges;  // n

    public RegularPolygon(double side, int edges) {
        if (side <= 0) {
            throw new IllegalArgumentException("side must be greater than 0");
        }
        if (edges <= 1) {
            throw new IllegalArgumentException("edges must be greater than 1");
        }
        this.side = side;
        this.edges = edges;
    }

    public double getSide() {
        return side;
    }

    public double getEdges() {
        return edges;
    }

    public double calculateArea() {
        return 0.25 * edges * Math.pow(side, 2) / Math.tan(Math.PI / edges);
    }

    public double calculatePerimeter() {
        return side * edges;
    }

    void printInfo() {
        System.out.println("Side: " + side);
        System.out.println("Edges: " + edges);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
