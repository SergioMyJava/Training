package trainingday4.by.epam.training.task2;

public class sumelementsrowsofmatrix {

    public static int[] sumelementsrows(int[][] gagged, int ascendingDescending) {
        int[] sumElen = new int[gagged.length];

        for (int i = 0; i < gagged.length; i++) {
            int sum = 0;
            for (int j = 0; j < gagged[i].length; j++) {
                sum += gagged[i][j];
            }
            sumElen[i] = sum;
        }

        return bubbleSort(sumElen, ascendingDescending);
    }

    public static int[] bubbleSort(int[] arr, int ascendingDescending) {
        boolean isSort = false;

        while (!isSort) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (ascendingDescending == 1) {
                    isSort = ascending(arr, i);
                }
                if (ascendingDescending == 2) {
                    isSort = descending(arr, i);
                }
            }
        }
        return arr;
    }

    public static boolean ascending(int[] a, int i) {
        if (a[i] < a[i + 1]) {
            a[i + 1] = a[i] + a[i + 1];
            a[i] = a[i + 1] - a[i];
            a[i + 1] = a[i + 1] - a[i];
            return false;
        }
        return true;
    }

    public static boolean descending(int[] a, int i) {
        if (a[i] > a[i + 1]) {
            a[i] = a[i] + a[i + 1];
            a[i + 1] = a[i] - a[i + 1];
            a[i] = a[i] - a[i + 1];
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] te = new int[][]{{0},
                {1, 2, 3, 4},
                {12, 34, 45, 56},
                {1, 2, 3, 4, 5, 5}};
        int[] enter = sumelementsrows(te, 2);
        for (int i = 0; i < enter.length; i++) {
            System.out.println(enter[i] + " ");
        }
    }
}
