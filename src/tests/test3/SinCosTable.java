package tests.test3;

public final class SinCosTable {
    private SinCosTable() {}

    public static double RAD2DEG = 180 / Math.PI;

    public static void print(double startAngle, double endAngle, double step) {
        System.out.printf(
            "Sin Cos Table [%d, %d, %d]\n",
            (int)(startAngle * RAD2DEG),
            (int)(endAngle * RAD2DEG),
            (int)(step * RAD2DEG)
        );

        System.out.println("angle cos(a) sin(a)");

        for (double a = startAngle; a < endAngle + step; a +=step) {  // + step, cause lost precision
            double cosa = Math.cos(a);
            double sina = Math.sin(a);

            System.out.printf(
                "%-5d %1.4f %1.4f\n",
                (int)(a * RAD2DEG),
                cosa,
                sina
            );
        }
    }
}
