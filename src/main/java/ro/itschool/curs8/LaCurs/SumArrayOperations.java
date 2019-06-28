package ro.itschool.curs8.LaCurs;

import ro.itschool.curs8.LaCurs.ArrayOperations;

public abstract class SumArrayOperations implements ArrayOperations {

    abstract String getSource();

    public int sum(int[] array){
        int result=0;
        for(int elem:array){
            result += elem;

        }

        return result;
    }
}
