package trainingday1.fifthtask;

public class PerfectNumber {
    public static final int[] PERFECT_NUMBERS = new int[]{6, 28, 496, 8128, 33550336};

    public boolean checkNumberForPerfection(int n) {
        for (int i = 0; i < PERFECT_NUMBERS.length; i++) {
            if (PERFECT_NUMBERS[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
