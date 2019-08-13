package ro.itschool.Curs19.sorting;

public class BubbleSort implements SortingAlgo {
    //   private final int[] sort;

    @Override
    public int[] sort(int[] elems) {
        if (elems == null) {
            return null;
        }
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < elems.length - 1; i++) {
                if (elems[i] > elems[i + 1]) {
                    swap(elems, i, i + 1);
                    sorted = false;
                }
            }
        } while (!sorted);
        return elems;
    }

    public void swap(int[] elems, int first, int second) {
        int aux = elems[first];
        elems[first] = elems[second];
        elems[second] = aux;
    }
}
