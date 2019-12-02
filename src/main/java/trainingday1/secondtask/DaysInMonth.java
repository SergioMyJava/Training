package trainingday1.secondtask;

import java.time.LocalDate;

public class DaysInMonth {
    private final static int Day = 1;

    public int calculateDaysInMonthWithLocalDate(int year, int month) {
        if (year > 0 && year <= 2400 && month > 0 && month <= 12) {
            LocalDate date = LocalDate.of(year, month, Day);
            int answer = date.lengthOfMonth();
            return answer;
        }
        System.out.print("The date is not entered correctly. Check: year is greater than 0 less then 2.400, " +
                "month is greater than 0 is less than or equal to 12.");
        return -1;
    }

    public int calculateDaysInMonth(int year, int month) {
        if (year > 0 && year <= 2400 && month > 0 && month <= 12) {
            int checkLeapYear = year % 4;
            int day = 0;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = 31;
                    break;
                case 2:
                    if (checkLeapYear == 0 && year != 1700 && year != 1800 && year != 1700 && year != 1000 && year != 2300 && year != 2200) {
                        day = 29;
                    } else {
                        day = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    break;

            }
            return day;
        }
        System.out.print("The date is not entered correctly. Check: year is greater than 0 less then 2.400, " +
                "month is greater than 0 is less than or equal to 12.");
        return -1;
    }

    public static void main(String[] args) {

    }
}
