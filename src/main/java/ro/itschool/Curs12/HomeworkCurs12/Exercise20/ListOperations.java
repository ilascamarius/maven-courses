package ro.itschool.Curs12.HomeworkCurs12.Exercise20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ListOperations {

    List<String> first = Arrays.asList("Cornel", "Ilasca", "Marius", "Mario");
    public Set<String> intersect = new HashSet<String>(first);
    List<String> second = Arrays.asList("Cornel1", "Ilasca", "Marius", "Mario");

    //Compare the first and second array list
    public boolean compareLists() {
        if (first.containsAll(second) && first.size() == second.size()) {
            return true;
        }
        return false;
    }

    intersect.r

    /* public boolean compareLists() {
        return false;
    }*/
}
