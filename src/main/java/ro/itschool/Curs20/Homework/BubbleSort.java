package ro.itschool.Curs20.Homework;

public class BubbleSort<T extends Comparable<T>> {


    //Override
    public T[] sort(T[] o) {

        if (o == null) {
            return null;
        }

        //@Override

        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < o.length - 1; i++) {
                if (o[i].compareTo(o[i + 1]) > 0) {
                    swap(o, i, i + 1);
                    sorted = false;

                }
            }
        } while (!sorted);
        return o;
    }

    public void swap(T[] elems, int first, int second) {
        T aux = elems[first];
        elems[first] = elems[second];
        elems[second] = aux;
    }

}
