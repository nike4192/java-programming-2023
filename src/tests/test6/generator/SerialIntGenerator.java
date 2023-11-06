package tests.test6.generator;

public class SerialIntGenerator implements IntGenerator {
    private static int counter = 0;

    public int nextPositive() {
        return ++counter;
    }

    public int nextNegative() {
        return -nextPositive();
    }

    public String getName() {
        return String.format("SerialIntGenerator[counter = %d]", counter);
    }
}
