package tests.test3;

public final class MatrixUtils {
    private MatrixUtils() {}

    public static double[][] generateRandom(int rows, int columns) {
        double[][] m = new double[rows][columns];
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = Math.random();
            }
        }
        return m;
    }

    public static double[][] calculateSinCos(double[][] matrix) {
        double[][] result = new double[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = new double[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                double c = matrix[i][j];
                result[i][j] = (i + j) % 2 == 0 ? Math.sin(c) : Math.cos(c);
            }
        }
        return result;
    }

    public static long[][] round(double[][] matrix) {
        long[][] result = new long[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = new long[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = Math.round(matrix[i][j]);
            }
        }
        return result;
    }

    public static void print(long[][] matrix) {
        for (long[] row : matrix) {
            for (long cell : row) {
                System.out.printf("%-5d", cell);
            }
            System.out.println("\n");
        }
    }

    public static void print(double[][] matrix) {
        for (double[] row : matrix) {
            for (double cell : row) {
                System.out.printf("%-7.4f", cell);
            }
            System.out.println("\n");
        }
    }
}
