package trainingday4.by.epam.training.task2;

public class MinimumMaxRowElements {

    public static int[][] MinitoMaxElementsInRow(int[][] gagged) {

        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 0; i < gagged.length - 1; i++) {
                if (gagged[i].length > gagged[i + 1].length) {
                    int[] a = gagged[i];
                    gagged[i] = gagged[i + 1];
                    gagged[i + 1] = a;
                    isSort = false;
                }
            }
        }
        return gagged;
    }

    public static int[][] MaxtoMinElementsInRow(int[][] gagged) {

        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 0; i < gagged.length - 1; i++) {
                int firstLenth = gagged[i].length;
                int nextLenth = gagged[i + 1].length;
                if (firstLenth < nextLenth) {
                    int[] a = gagged[i];
                    gagged[i] = gagged[i + 1];
                    gagged[i + 1] = a;
                    isSort = false;
                }
            }
        }
        return gagged;
    }

    public static void main(String[] args) {
        int[][] te = new int[][]{{0},
                {1, 2, 3, 4},
                {12, 34, 45},
                {1, 2, 3, 4, 5, 5}};
        int[][] enter = MaxtoMinElementsInRow(te);
        for (int i = 0; i < enter.length; i++) {
            for (int y = 0; y < enter[i].length; y++) {
                System.out.print(enter[i][y] + " ");
            }
            System.out.println();
        }
    }
}

