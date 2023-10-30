package tests.test3.shapes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static final String PRINTLN_DELIMITER = "--------";

    public static void main(String[] args) {
        Map<String, AbstractShape> shapes = new LinkedHashMap<>();

        shapes.put("Square", new RegularPolygon(5, 4));
        shapes.put("Regular Pentagon", new RegularPolygon(2.4, 5));
        shapes.put("Circle", new Ellipse(1, 1));
        shapes.put("Ellipse", new Ellipse(3, 6));

        for(Map.Entry<String, AbstractShape> entry : shapes.entrySet()) {
            String shapeName = entry.getKey();
            AbstractShape shape = entry.getValue();

            System.out.println(shapeName);
            shape.printInfo();
            Main.printDelimiter();
        }
    }

    public static void printDelimiter() {
        System.out.println(PRINTLN_DELIMITER);
    }
}
