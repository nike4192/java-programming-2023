package tests.test6;

import static tests.test6.equation.App.*;
import static tests.test6.generator.App.*;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("[QuadraticEquation]\n");
        demoQuadraticEquation();

        System.out.println();

        System.out.println("[IntGenerator]\n");
        demoIntGenerator(10);
    }
}
