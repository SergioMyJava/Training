package trainingday1.fifthtask;

public class PerfectNumber {
    public static final int[] perfectNamber = new int[]{6, 28, 496, 8128, 33550336};

    public boolean checkNumberForPerfection(int n){
        for(int i = 0;i<perfectNamber.length;i++){
            if(perfectNamber[i] == n){
                return true;
            }
        }
        return false;
    }

    public static void main (String[]args){

    }
}
