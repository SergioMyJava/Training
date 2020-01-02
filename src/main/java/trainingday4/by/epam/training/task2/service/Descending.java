package trainingday4.by.epam.training.task2.service;

public class Descending implements AscendingDesendingArr{

    @Override
    public boolean swap(int[] a, int i) {
        if (a[i] > a[i + 1]) {
            a[i] = a[i] + a[i + 1];
            a[i + 1] = a[i] - a[i + 1];
            a[i] = a[i] - a[i + 1];
            return false;
        }
        return true;
    }
}
