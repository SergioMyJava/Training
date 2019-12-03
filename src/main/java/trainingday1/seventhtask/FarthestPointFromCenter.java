package trainingday1.seventhtask;

public class FarthestPointFromCenter {

    public static int[] calculateFarPoint(int x1, int y1, int x2, int y2) {
        int[] pointForReturn = new int[2];
        if (distance(x1, y1) > distance(x2, y2)) {
            pointForReturn[0] = x1;
            pointForReturn[1] = y1;

            return pointForReturn;
        } else
            pointForReturn[0] = x2;
            pointForReturn[1] = y2;
        return pointForReturn;
    }

    private static int distance(int x, int y) {
        return (x * x + y * y);
    }

    public static void main(String[] args) {
int [] test = calculateFarPoint(12,3,34,23);
for(int i =0;i<test.length;i++){
    System.out.print(test[i]+" ");
}

        System.out.print(test.equals(new int[]{34,23}));
    }
}
