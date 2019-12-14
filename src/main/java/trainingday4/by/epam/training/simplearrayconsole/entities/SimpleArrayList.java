package trainingday4.by.epam.training.simplearrayconsole.entities;

import java.util.Collection;

public class SimpleArrayList implements SimpleList {
    private int[] array;
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private static int counterOfCreatedArrays;          // for calculation hashCode
    private int counterOfCreatedArraysInObj;            // for calculation hashCode

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] modifiedArray) {
        if(modifiedArray != null) {
            this.array = modifiedArray;
        }
        else{
            throw new IllegalArgumentException("cannot change the array to null.");
        }
    }

    public SimpleArrayList() {
        changeCounterOfCreatedArrays();
        this.array = new int[DEFAULT_CAPACITY];
    }

    public SimpleArrayList(int capacity) {
        if (capacity > 0) {
            changeCounterOfCreatedArrays();
            array = new int[capacity];
        }
        if (capacity == 0) {
            changeCounterOfCreatedArrays();
            this.array = new int[DEFAULT_CAPACITY];
        }
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity " + capacity);
        }

    }

    public SimpleArrayList(Collection<Integer> c) {
        if (c != null) {
            changeCounterOfCreatedArrays();
            array = new int[c.size()];
            size = c.size();
            int i = 0;
            for (int a : c) {
                array[i++] = a;
            }
        } else {
            changeCounterOfCreatedArrays();
            array = new int[DEFAULT_CAPACITY];
        }
    }

    public void changeCounterOfCreatedArrays() {
        ++counterOfCreatedArrays;
        counterOfCreatedArraysInObj = counterOfCreatedArrays;
    }

    @Override
    public boolean add(int value) {
        sizeCheck();
        array[size++] = value;
        return true;
    }

    @Override
    public int get(int index) {
        if (index > 0 && index <= size) {
            return array[index - 1];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " outside the array .");
        }
    }

    @Override
    public boolean delete(int index) {
        if (index > 0 && index <= size) {
            for (int x = index; x < size; x++) {
                array[x - 1] = array[x];
            }
            size--;
            sizeCheck();
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + index + " outside the array .");
    }

    private void sizeCheck() {
        if (array.length / 2 == size) {
            int[] newArray = new int[array.length / 2];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        if (array.length == size) {
            int[] oldArray = array;
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < oldArray.length; i++) {
                newArray[i] = oldArray[i];
            }
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
            int oldValue = array[index - 1];
            array[index - 1] = element;
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

        SimpleArrayList other = (SimpleArrayList) o;

        if (this.size != other.size) {
            return false;
        }

        for (int i = 0; i < this.size; i++) {
            if (this.get(i) != other.get(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        int cons = 32;
        for (int i = 0; i < array.length; i++) {
            hash += array[i] * cons + 1 + counterOfCreatedArraysInObj;
        }
        return hash;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + " ";
        }
        return string;
    }
}
