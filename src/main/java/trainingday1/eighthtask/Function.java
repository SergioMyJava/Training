package trainingday1.eighthtask;

public class Function {

    public double functionSolution(double x) {
        double y = 0.0;
        if (x >= 3) {
            y = -(x * x) + 3 * x + 9;
            return y;
        }

        if (x < 3)
            y = (1 / (x * x * x - 6));
        return y;

    }

    public static void main(String[] args) {

    }
}
