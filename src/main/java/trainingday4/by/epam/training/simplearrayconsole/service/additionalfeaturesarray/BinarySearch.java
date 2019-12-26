package trainingday4.by.epam.training.simplearrayconsole.service.additionalfeaturesarray;

public class BinarySearch {

    public int search(int[] sortedArray, int key) {
        return binarySearch(sortedArray, key, 0, sortedArray.length);
    }

    public int binarySearch(int[] sortedArray, int key, int low, int high) {
        int index = -1;

        if (key > high) {
            return -1;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
