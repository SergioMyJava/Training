package trainingday1.secondtask;

import java.time.LocalDate;

public class DaysInMonth {
    private final static int Day = 1;

    public static int calculateDaysInMonth(int year, int month) throws IllegalArgumentException{
        if(year > 0 && month>0 && month <= 12 ) {
            LocalDate date = LocalDate.of(year, month, Day);
            int answer = date.lengthOfMonth();
            return answer;
        }
        System.out.print("The date is not entered correctly. Check: year is greater than 0, " +
                "month is greater than 0 is less than or equal to 12.");
        return -1;
    }

    public static void main(String[] args) {
System.out.print(calculateDaysInMonth(100000000,12));
    }
}
