package tests.test5.shapes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static final String PRINTLN_DELIMITER = "--------";

    public static void main(String[] args) {
        /* 6. Создайте массив ссылочного типа суперкласса, куда поместите объекты подклассов (вместо массива LinkedHasMap)*/
        Map<String, AbstractShape> shapes = new LinkedHashMap<>();

        shapes.put("Square", new Square(5));
        shapes.put("Regular Pentagon", new RegularPolygon(2.4, 5));

        /* 6. Выполните в цикле вызов метода у элементов массива, чтобы продемострировать возможности полиморфизма (вызов самой специфической версии метода) */
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
