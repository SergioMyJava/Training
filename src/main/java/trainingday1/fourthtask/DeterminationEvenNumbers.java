package trainingday1.fourthtask;

public class DeterminationEvenNumbers {

    public boolean definitionEven(int firstNumber, int secondNumber, int thirdNumber, int foursNumber) {
        int numberEven = 0;
        int[] number = {firstNumber, secondNumber, thirdNumber, foursNumber};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                numberEven++;
                continue;
            }
        }
        if(numberEven>=2){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args){
        DeterminationEvenNumbers t = new DeterminationEvenNumbers();
        System.out.println(t.definitionEven(4,6,8,10));
    }
}
