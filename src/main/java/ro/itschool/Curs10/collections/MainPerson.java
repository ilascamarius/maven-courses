package ro.itschool.Curs10.collections;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("John", 22, "brown"),
                new Person("Eva", 23, "red"),
                new Person("Michael", 42, "blonde"),
                new Person("Sara", 52, "black"),
                new Person("Rus", 25, "brown"),
                new Person("Cody", 51, "blonde"),
                new Person("Test", 22, "brown"),
                new Person("fgf", 22, "brown"),
                new Person("John", 22, "brown")
        );
        extractNames(persons);
    }

    private static List<String> extractNames(List<Person> persons) {
        List<String> onlyName = new ArrayList<>();
        for (Person one : persons) {
            onlyName.add(one.getName());
            System.out.println(onlyName);
        }
        return onlyName;
    }


}
