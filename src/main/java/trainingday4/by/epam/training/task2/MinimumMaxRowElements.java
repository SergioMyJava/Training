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

    }
}

