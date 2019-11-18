package trainingday1.tenthTask;

import java.text.DecimalFormat;

public class TangentFunctionInSection {
    DecimalFormat df;

    TangentFunctionInSection() {
        df = new DecimalFormat("#0.00");
    }

    public void calculationFunction(double firstPoint, double secondPoint, double step) {
        double point = firstPoint;
        while (point <= secondPoint) {
            double resalt = Math.sin(point) / Math.cos(point);
            System.out.println("x = " + point + "    F(x) = " + df.format(resalt));
            point += step;
        }
    }

    public static void main(String[] args) {
        TangentFunctionInSection forTest = new TangentFunctionInSection();
        forTest.calculationFunction(1, 5, 1);
    }
}
