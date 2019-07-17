package ro.itschool.Curs9.collections;

import ro.itschool.Curs9.Child;
import ro.itschool.Curs9.Parent;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Parent> parents = new HashSet<>();

        parents.add(new Parent(33));
        parents.add(new Parent(43));
        parents.add(new Parent(23));
        parents.add(new Child(3));
        parents.add(new Parent(23));
        parents.add(new Parent(53));

        System.out.println(parents);
    }
}
