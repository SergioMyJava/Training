package trainingday4.by.epam.training.task2.entities;

import trainingday4.by.epam.training.task2.service.Ascending;
import trainingday4.by.epam.training.task2.service.AscendingDesendingArr;
import trainingday4.by.epam.training.task2.service.Descending;

/**
 * flag 1 - ascending
 * flag 2 - descending
 */

public class MaximumElementsRows {
    private final AscendingDesendingArr ascending;
    private final AscendingDesendingArr descending;

    MaximumElementsRows() {
        ascending = new Ascending();
        descending = new Descending();
    }

    public int[] maximumElementsSumInRows(int[][] gagged, int ascendingDescending) {
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

    private int[] bubbleSort(int[] arr, int flag) {
        boolean isSort = false;

        while (!isSort) {
            for (int i = 0; i < arr.length - 1; i++) {
                int x;
                switch (flag) {
                    case 1:
                        isSort = ascending.swap(arr, i);
                        break;
                    case 2:
                        isSort = descending.swap(arr, i);
                        break;
                }
            }

        }

        return arr;
    }

    public static void main(String[] args) {

    }
}
