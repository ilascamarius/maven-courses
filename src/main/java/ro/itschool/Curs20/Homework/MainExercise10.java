package ro.itschool.Curs20.Homework;

import java.util.Arrays;

public class MainExercise10 {
    public static void main(String[] args) {
        Integer[] sort1 = new Integer[]{5, 4, 2, 3, 1};

        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        System.out.println(Arrays.toString(bubbleSort.sort(sort1)));
    }
}
