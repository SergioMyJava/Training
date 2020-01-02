package trainingday4.by.epam.training.simplearrayconsole.service.additionalfeaturesarray;

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

    private boolean chekForPrime(int input) {

        if (input == 1 || input == 0) {
            return false;
        }
        if (input == 2) {
            return true;
        }
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}