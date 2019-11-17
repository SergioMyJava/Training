package trainingday1.thirdtask;

public class AreaOfSquareInscribedInCircle {

    public double inscribedSquare(double outerSquare){
        return outerSquare/2;
    }
    public static void main (String[]args){
        AreaOfSquareInscribedInCircle test = new AreaOfSquareInscribedInCircle();
        System.out.println(test.inscribedSquare(1));
    }
}
