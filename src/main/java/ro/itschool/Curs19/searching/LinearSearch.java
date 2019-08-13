package ro.itschool.Curs19.searching;

public class LinearSearch implements SearchAlgo {

    @Override
    public boolean search(int[] elems, int elem) {
        if (elems == null) {
            return false;
        }
        for (int i = 0; i < elems.length; i++) {
            if (elems[i] == elem)
                return true;
        }
        return false;
    }
}
