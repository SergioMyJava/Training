package trainingday4.by.epam.training.simplearrayconsole.simplearray;

import java.util.Arrays;
import java.util.Collection;

public class SimpleArrayList implements SimpleList {
    private int[] array;
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;

    SimpleArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    SimpleArrayList(int capacity) {
        if (capacity > 0) {
            array = new int[capacity];
        }
        if (capacity == 0) {
            this.array = new int[DEFAULT_CAPACITY];
        } else {
            throw new IllegalArgumentException("Illegal capacity " + capacity);
        }
    }

    SimpleArrayList(Collection<Integer> c) {
        if (c != null) {
            array = new int[c.size()];
            int i = 0;
            for (int a : c) {
                array[i++] = a;
            }
        } else {
            array = new int[DEFAULT_CAPACITY];
        }
    }

    @Override
    public boolean add(int value) {
        array[size++] = value;
        sizeCheck();
        return true;
    }

    @Override
    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean delete(int index) {
        if (index >= 0 && index <= size) {
            for (int x = index; x < size; x++) {
                if ((x + 1) != size)
                    array[x] = array[x + 1];
            }
            size--;
            sizeCheck();
            return true;
        }
        throw new IndexOutOfBoundsException();
    }

    private void sizeCheck() {
        if (array.length / 2 == size) {
            int[] newArray = Arrays.copyOf(array, size);
            array = newArray;
        }
        if (array.length == size) {
            int[] oldArray = array;
            int[] newArray = Arrays.copyOf(oldArray, array.length * 2);
            array = newArray;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int set(int index, int element) {
        if (index > 0 && index <= array.length) {
            int oldValue = array[index];
            array[index] = element;
            return oldValue;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " outside the array .");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }

        int[] other = (int[]) o;

        if(array.length != other.length){
            return false;
        }

        for(int i = 0; i<array.length;i++){
            if(array[i] != other[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
    return array.hashCode();
    }

    @Override
    public String toString() {
        String string = " ";
        for(int i = 0;i<array.length;i++){
            string = Integer.toString(array[i]) + " ";
        }
        return string;
    }
}
