package trainingday1.thirdtask;

public class AreaOfSquareInscribedInCircle {

    public int inscribedSquare(int outerSquare){
        return outerSquare/2;
    }
    public static void main (String[]args){
        AreaOfSquareInscribedInCircle test = new AreaOfSquareInscribedInCircle();
        System.out.println(test.inscribedSquare(1));
    }
}
