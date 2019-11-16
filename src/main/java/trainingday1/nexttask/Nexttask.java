package trainingday1.nexttask;

import java.time.LocalDate;
import java.util.Scanner;
import static trainingday1.util.ScannerUtil.getScanner;

public class Nexttask {
    private int year;
    private int month;
    private final int day = 1;

    public void start() {
        System.out.println("Enter year. Press 'Q' to exit!");
        Scanner readDate = getScanner();
        String year = readDate.nextLine();

        if (year.equals("Q") || year.equals("q")) {
            readDate.close();
        } else {
            checkYear(year);
        }

        System.out.println("Enter month. Press 'Q' to exit!");
        String month = readDate.nextLine();

        if (year.equals("Q") || year.equals("q")) {
            readDate.close();
        } else {
            checkMonth(month);
        }

        System.out.println("In your chosen month " + calculate() + " дней.");

    }

    private void checkYear(String year) {
        try {
            int yearInt = Integer.parseInt(year);
            this.year = yearInt;

        } catch (Exception e) {
            System.out.println("Вы ввели не число!");
            start();
        }
    }

    private void checkMonth(String month) {
        try {
            int monthInt = Integer.parseInt(month);
            this.month = monthInt;

        } catch (Exception e) {
            System.out.println("Вы ввели не число!");
            start();
        }
    }

    private int calculate() {
        LocalDate date = LocalDate.of(year, month, day);
        int answer = date.lengthOfMonth();
        return answer;
    }

    public static void main(String[] args) {
        Nexttask test = new Nexttask();
        test.start();
    }
}
