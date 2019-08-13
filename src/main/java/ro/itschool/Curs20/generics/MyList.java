package ro.itschool.Curs20.generics;

public class MyList<T> {

    private final T[] array;
    private int size;

    public MyList() {
        array = (T[]) new Object[10];
        size = 0;

    }

    public T get(int index) {
        return array[index];
    }

    public void add(T elem) {
        array[size] = elem;
        size = size + 1;
    }

    public int size() {
        return size;
    }

}
