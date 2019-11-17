package trainingday1.secondtask;

import java.time.LocalDate;

public class DaysInMonth {
    private final static int Day = 1;

    public int calculateDaysInMonth(int year, int month) {
            LocalDate date = LocalDate.of(year, month, Day);
            int answer = date.lengthOfMonth();
            return answer;
        }

        public static void main (String[]args){
            DaysInMonth test = new DaysInMonth();
            System.out.println(test.calculateDaysInMonth(-5, 15));
        }
    }
