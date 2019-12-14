package trainingday4.by.epam.training.simplearrayconsole.service;

import java.util.LinkedList;
import java.util.List;

public class PrimeNumbers {

    public List getPrimeNumbers(int[] arr) {
        if (arr != null) {
            LinkedList primeNumber = null;
            for (int i = 0; i < arr.length; i++) {
                if (chekForPrime(arr[i])) {
                    if (primeNumber == null) {
                        primeNumber = new LinkedList();
                    }
                    primeNumber.add(arr[i]);
                }
            }
            return primeNumber;
        }
        return null;
    }

    public boolean chekForPrime(int input) {
        boolean isComposite = false;
        int i;
        if(input == 1){
            return false;
        }
        for (i = 2; i < input; i++) {
            if (input % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            return false;
        } else {
            return true;
        }
    }
}
