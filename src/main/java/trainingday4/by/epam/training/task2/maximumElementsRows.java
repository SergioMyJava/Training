package trainingday4.by.epam.training.task2;

public class maximumElementsRows {

    public static int[] maximumElementsSumInRows(int[][] gagged, int ascendingDescending) {
        int[] sumElem = new int[gagged.length];

        for (int i = 0; i < gagged.length; i++) {
            int max = gagged[i][0];
            for (int j = 0; j < gagged[i].length; j++) {
                if (gagged[i].length != 1) {
                    if (max < gagged[i][j]) {
                        max = gagged[i][j];
                    }
                } else {
                    max = gagged[i][0];
                }
                sumElem[i] = max;
            }

        }

        return bubbleSort(sumElem, ascendingDescending);
    }

    public static int[] bubbleSort(int[] arr, int ascendingDescending) {
        boolean isSort = false;

        while (!isSort) {
            for (int i = 0; i < arr.length - 1; i++) {
                int x = 1;
                if (ascendingDescending == 1) {
                    if (arr[i] < arr[i + 1]) {
                        x = arr[i];
                        arr[i + 1] = arr[i];
                        arr[i] = x;
                    }
                }
                if (ascendingDescending == 2) {
                    if (arr[i] > arr[i + 1]) {
                        x = arr[i + 1];
                        arr[i + 1] = arr[i];
                        arr[i] = x;
                    }
                }
                isSort = true;
            }

        }

        return arr;
    }

    public static void main(String[] args) {

    }
}
