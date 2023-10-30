package tests.test5.shapes;

/* 2. Уровень C */
public class Square extends RegularPolygon {

    /* 3. Создайте конструкторы */
    public Square(double side) {
        super(side, 4);  // 3. продемонстрируйте вызов родительских конструкторов
    }

    /* 5. В подклассах необходимо реализовать методы, которые переопределяют методы, объявленные в суперклассах */
    public final void setEdges(int edges) {
        throw new IllegalArgumentException("you can't change edges on Square");
    }

    /* 5. В подклассах необходимо реализовать методы, которые переопределяют методы, объявленные в суперклассах */
    public double calculateArea() {
        /* 4. В подклассах должны быть методы, которые обращаются к методам суперкласса */
        double side = super.getSide();
        return side * side;
    }

    void printInfo() {
        System.out.println("Side: " + getSide());
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
