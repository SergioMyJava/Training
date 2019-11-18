package trainingday1.ninthtask;

import java.text.DecimalFormat;

public class CalculationCircumferenceCircle {
    DecimalFormat df;

    CalculationCircumferenceCircle() {
        df = new DecimalFormat("#.00");
    }

    public String calculation(double R) {
        if (R <= 0) {
            return " You cannot enter a negative radius or null.";
        }
        double circumference = 2 * R * Math.PI;
        double circleArea = R * R * Math.PI;
        return "Circumference = " + df.format(circumference) + " Circle area = " + df.format(circleArea);
    }

    public static void main(String[] args) {

    }
}
