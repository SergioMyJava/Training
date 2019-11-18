package trainingday1.seventhtask;

public class FarthestPointFromCenter {

    public String calculateFarPoint(int x1, int y1, int x2, int y2) {
        if (distance(x1, y1) > distance(x2, y2)) {
            return "Closer point (" + x2 + "," + y2 + ")";
        } else
            return "Closer point (" + x1 + "," + y1 + ")";
    }

    public int distance(int x1, int y1) {
        return (x1 * x1 + y1 * y1);
    }

    public static void main(String[] args) {

    }
}
