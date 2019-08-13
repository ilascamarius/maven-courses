package ro.itschool.Curs19.sorting;

public interface SortingAlgo {
    int[] sort(int[] elems);

    default void swap(int[] elems, int first, int second) {
        int aux = elems[first];
        elems[first] = elems[second];
        elems[second] = aux;
    }
}

/*Bubble Sort
se sorteaza doua cate doua
*/

