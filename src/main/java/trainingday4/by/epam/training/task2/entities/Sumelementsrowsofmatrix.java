package trainingday4.by.epam.training.task2.entities;

import trainingday4.by.epam.training.task2.service.Ascending;
import trainingday4.by.epam.training.task2.service.AscendingDesendingArr;
import trainingday4.by.epam.training.task2.service.Descending;

public class Sumelementsrowsofmatrix {
    private final AscendingDesendingArr ascending;
    private final AscendingDesendingArr descending;

    Sumelementsrowsofmatrix() {
        ascending = new Ascending();
        descending = new Descending();
    }

    public int[] sumelementsrows(int[][] gagged, int flag) {
        int[] sumElen = new int[gagged.length];

        for (int i = 0; i < gagged.length; i++) {
            int sum = 0;
            for (int j = 0; j < gagged[i].length; j++) {
                sum += gagged[i][j];
            }
            sumElen[i] = sum;
        }

        return bubbleSort(sumElen, flag);
    }

    private int[] bubbleSort(int[] arr, int flag) {
        boolean isSort = false;

        while (!isSort) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (flag == 1) {
                    isSort = ascending.swap(arr, i);
                }
                if (flag == 2) {
                    isSort = descending.swap(arr, i);
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {

    }
}
