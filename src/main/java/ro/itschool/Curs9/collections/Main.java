package ro.itschool.Curs9.collections;

import ro.itschool.Curs9.Child;
import ro.itschool.Curs9.Parent;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(3);
        Parent child = new Child(3);
        Child charlie = new Child(3);

        System.out.println(charlie.equals(child));
        System.out.println(parent.equals(child));


        List<Parent> parents = new ArrayList<>();
        parents.add(new Parent(50));
        parents.add(new Parent(36));
        parents.add(new Parent(13));
        parents.add(new Parent(32));
        System.out.println(parents);
        for (Parent p : parents) {
            System.out.println(p);
        }
    }
}
