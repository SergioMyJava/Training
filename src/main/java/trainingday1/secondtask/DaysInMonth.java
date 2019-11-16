package trainingday1.secondtask;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

import static trainingday1.util.ScannerUtil.getScanner;

public class DaysInMonth {
    private final int day = 1;

    public int calculateDaysInMonth(int year, int month) {
            LocalDate date = LocalDate.of(year, month, day);
            int answer = date.lengthOfMonth();
            return answer;

        }

        public static void main (String[]args){
            DaysInMonth test = new DaysInMonth();
            System.out.println(test.calculateDaysInMonth(-5, 15));
        }
    }
