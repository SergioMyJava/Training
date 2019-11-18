package trainingday1.tenthTask;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class TangentFunctionInSection {
    DecimalFormat df;
    List toReturn;

    TangentFunctionInSection() {
        df = new DecimalFormat("#0.00");
    }

    public List calculationFunction(double firstPoint, double secondPoint, double step) {
        toReturn = new ArrayList<String>();
        double point = firstPoint;
        while (point <= secondPoint) {
            double resalt = Math.tan(point);
            String toArray = "x=" + point + "F(x)=" + df.format(resalt);
            toReturn.add(toArray);
            point += step;
        }
        return toReturn;
    }

    public static void main(String[] args) {
        TangentFunctionInSection forTest = new TangentFunctionInSection();
        List test = forTest.calculationFunction(0.1, 3, 0.5);
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
    }
}
