package trainingday4.by.epam.training.simplearrayconsole.service;

public class MinMaxInArray {

    public int[] getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return new int[]{min,max};
    }
}
