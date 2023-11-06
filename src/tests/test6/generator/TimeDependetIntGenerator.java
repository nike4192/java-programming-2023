package tests.test6.generator;

public class TimeDependetIntGenerator implements IntGenerator {
    private int p;
    private int m;

    public TimeDependetIntGenerator(int p, int m) {
        if (p >= 10000) throw new IllegalArgumentException("prime should be less than 10000");

        this.p = p;
        this.m = m;
    }

    public int nextPositive() {
        long t = System.currentTimeMillis();
        return (int)(Math.round((double)m * (t % p) / p));
    }

    public int nextNegative() {
        return -nextPositive();
    }

    public String getName() {
        return String.format("TimeDependetIntGenerator[p = %d, m = %d]", p, m);
    }
}
