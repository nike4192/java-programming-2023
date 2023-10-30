package tests.test2;

public class Main {
    public static void main(String[] args) {
        /* 1 */
        System.out.println("1 Task\n");
        SinCosTable.print(0, Math.PI / 2, Math.PI / 180);
        System.out.println();

        /* 2 */
        System.out.println("2 Task\n");
        double[][] m = {
            { 0.1, 0.2, 0.3 },
            { 0.4, 0.5, 0.6 },
            { 0.7, 0.8, 1.9 },
        };

        long[][] rm = MatrixUtils.round(m);
        MatrixUtils.print(rm);

        /* Additional task */
        System.out.println("Additional task\n");
        double[][] m2 = MatrixUtils.generateRandom(3, 4);
        System.out.println("Random Matrix:\n");
        MatrixUtils.print(m2);
        double[][] m3 = MatrixUtils.calculateSinCos(m2);
        System.out.println("Sin Cos Matrix:\n");
        MatrixUtils.print(m3);
    }
}
