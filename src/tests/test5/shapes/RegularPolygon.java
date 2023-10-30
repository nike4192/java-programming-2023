package tests.test5.shapes;

/* 2. Уровень B */
/* https://en.wikipedia.org/wiki/Regular_polygon */
public class RegularPolygon extends AbstractShape {
    private double side;  // s
    private int edges;  // n

    /* 3. Создайте конструкторы */
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

    /* 3. Создайте геттеры */
    public double getSide() {
        return side;
    }

    /* 3. Создайте геттеры */
    public double getEdges() {
        return edges;
    }

    /* 3. Создайте сеттеры */
    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    /* 3. Создайте сеттеры */
    public void setEdges(int edges) {
        if (edges > 0) {
            this.edges = edges;
        }
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
