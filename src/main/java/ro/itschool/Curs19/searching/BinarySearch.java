package ro.itschool.Curs19.searching;

import java.util.Arrays;

public class BinarySearch implements SearchAlgo {

    @Override
    public boolean search(int[] elems, int elem) {
        if (elems == null) {
            return false;
        }
        if (elems.length == 0) {
            return false;
        }

        int mid = (elems.length) / 2;
        if (elems[mid] == elem) {
            return true;
        }

        if (elems[mid] < elem) {
            return search(Arrays.copyOfRange(elems, mid + 1, elems.length), elem);
        } else {
            return search(Arrays.copyOfRange(elems, 0, mid - 1), elem);
        }
    }
}
