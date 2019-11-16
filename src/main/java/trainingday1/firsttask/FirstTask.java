package trainingday1.firsttask;

import java.util.Scanner;
import static trainingday1.util.ScannerUtil.getScanner;

public class FirstTask {
    public void start() {
        System.out.println("Enter a number and get the square of the last digit. Press 'Q' to exit!");
        Scanner readNumber = getScanner();
        String str = readNumber.nextLine();
        if (str.equals("Q") || str.equals("q")) {
            readNumber.close();
        } else {
            checkNumber(str);
            start();
        }
    }

    public void calculation(int number) {
        int almostAnswer = Math.abs(number) % 10;
        int answer = Math.abs(almostAnswer * almostAnswer) % 10;
        System.out.println("Ответ : " + answer);
    }

    public void checkNumber(String fromScanner) {
        try {
            int number = Integer.parseInt(fromScanner);
            calculation(number);
        } catch (Exception e) {
            System.out.println("Вы ввели не число!");
        }
    }

    public static void main(String[] args) {
        FirstTask a = new FirstTask();
        a.start();
    }
}
