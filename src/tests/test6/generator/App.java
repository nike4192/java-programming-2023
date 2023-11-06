package tests.test6.generator;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        demoIntGenerator(10);
    }

    public static void demoIntGenerator(int numbersCount) throws InterruptedException {

        IntGenerator[] generators = {
            new RandomIntGenerator(-100, 100),
            new TimeDependetIntGenerator(9999, 100),
            new SerialIntGenerator()
        };

        for (IntGenerator generator: generators) {
            String[] tempRandNumbers = new String[numbersCount];
            for (int i = 0; i < numbersCount; i++) {
                if (generator instanceof TimeDependetIntGenerator) {
                    TimeUnit.MILLISECONDS.sleep(100);
                }
                tempRandNumbers[i] = String.format("%d", i % 2 == 0
                    ? generator.nextPositive()
                    : generator.nextNegative()
                );
            }
            System.out.printf("%-45s", generator.getName());
            System.out.println(String.join(", ", tempRandNumbers));
        }
    }
}
