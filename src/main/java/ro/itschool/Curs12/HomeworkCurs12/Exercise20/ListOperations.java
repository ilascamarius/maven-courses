package ro.itschool.Curs12.HomeworkCurs12.Exercise20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperations {

    List<String> first = Arrays.asList("Cornel", "Ilasca", "Marius", "Mario");
    // public Set<String> intersect = new HashSet<String>(first);
    List<String> second = Arrays.asList("Cornel1", "Ilasca", "Marius", "Mario");

    //Compare the first and second array list
    public boolean compareLists() {
        if (first.containsAll(second) && first.size() == second.size()) {
            return true;
        }
        return false;
    }

    public String intersectAll() {
        List<String> intersect = new ArrayList<String>(first);
        intersect.retainAll(second);
        return String.valueOf(intersect);
    }

    public String unionAll() {
        List<String> union = new ArrayList<String>(first);
        union.removeAll(second);
        return String.valueOf(union);
    }

    /* public boolean compareLists() {
        return false;
    }*/


}
