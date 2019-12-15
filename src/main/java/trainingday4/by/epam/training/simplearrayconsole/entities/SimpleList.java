package trainingday4.by.epam.training.simplearrayconsole.entities;

public interface SimpleList {
    boolean add(int value);

    int get(int index);

    boolean delete(int index);

    int size();

    int set(int index, int element);
}
