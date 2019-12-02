package trainingday1.thirdtask;

public class AreaOfSquareInscribedInCircle {

    public double inscribedSquare(double outerSquare) {
        if (outerSquare > 0) {
            return outerSquare / 2;
        } else {
            System.out.print("Check the entered data: the area cannot be negative.");
            return -1;
        }
    }

    public static void main(String[] args) {

    }
}
