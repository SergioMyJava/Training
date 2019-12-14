package trainingday4.by.epam.training.simplearrayconsole.service;

import java.util.LinkedList;
import java.util.List;

public class ThreeDigitNumbers {

    public List getThreeDigitNumbers(int[] arr){
        List forReturn = null;
        for(int i = 0;i < arr.length; i++){
            if(checkNumber(arr[i])){
                if(forReturn == null){
                    forReturn = new LinkedList();
                }
                forReturn.add(arr[i]);
            }
        }
        return forReturn;
    }

    public boolean checkNumber(int number){
        if (number / 100 > 9 || number / 100 == 0) {
            return false;
        }
        if (number/100 != number%10 && number/100 != ((number/10)%10) && number/100 != number%10 && ((number/10)%10) != number%10) {
            return true;
        }
        return false;
    }
}
