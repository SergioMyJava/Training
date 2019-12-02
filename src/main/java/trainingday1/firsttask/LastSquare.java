package trainingday1.firsttask;

public class LastSquare {

    public int calculation(int number) {
            int almostAnswer = number % 10;
            int answer =  (almostAnswer * almostAnswer) % 10;
            return answer;
    }

    public static void main(String[] args) {
    }
}
