package trainingday1.sixthTask;

public class HoursMinutesInGivenSeconds {

    public static String calculateHoursMinutes(int seconds) {
        if (seconds < 0) {
            return "Negative number entered.";
        } else {
            int hours = seconds / 3600;

//            if (hours > 24) {
//                return "Seconds more than a day.";
//            }
            int minutes = (seconds - (hours * 3600)) / 60;
            int second = seconds - (hours * 3600 + minutes * 60);
            return hours + ":" + minutes + ":" + second;
        }
    }

    public static void main(String[] args) {

    }
}
