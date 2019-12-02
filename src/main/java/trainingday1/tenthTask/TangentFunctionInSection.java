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
        if (firstPoint < secondPoint && step > 0) {
            toReturn = new ArrayList<String>();
            double point = firstPoint;
            while (point <= secondPoint) {
                double resalt = Math.tan(point);
                String toArray = "x=" + point + "F(x)=" + df.format(resalt);
                toReturn.add(toArray);
                point += step;
            }
            return toReturn;
        } else {
            System.out.print("Check the entered data: firstPoint < secondPoint && step > 0.");
            return null;
        }
    }

    public static void main(String[] args) {

    }
}
