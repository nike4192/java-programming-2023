package tests.test6.generator;

public class RandomIntGenerator implements IntGenerator {
    private final int min;
    private final int max;

    public RandomIntGenerator(int min, int max) {
        if (max <= 0) throw new IllegalArgumentException("max should be greater than 0");
        if (min >= 0) throw new IllegalArgumentException("min should be less than 0");

        this.min = min;
        this.max = max;
    }

    public int nextPositive() {
        return (int)(Math.round(Math.random() * max));
    }

    public int nextNegative() {
        return (int)(Math.round(Math.random() * min));
    }

    public String getName() {
        return String.format("RandomIntGenerator[%d, %d]", min, max);
    }
}
