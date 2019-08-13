package ro.itschool.Curs19.sorting;

public class InsertionSort implements SortingAlgo {

    @Override
    public int[] sort(int[] elems) {

        if (elems == null) {
            return null;
        }

        for (int i = 1; i < elems.length; i++) {
            int interm = i - 1;
            while (interm >= 0 && elems[i - 1] > elems[i]) {
                elems[interm + 1] = elems[interm];
                interm = interm - 1;
            }

            elems[interm] = elems[i];
        }

        return elems;
    }
}
