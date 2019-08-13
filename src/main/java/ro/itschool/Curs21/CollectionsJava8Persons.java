package ro.itschool.Curs21;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionsJava8Persons {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alex", 3),
                new Person("Andrei", 6),
                new Person("Cornel", 32),
                new Person("Vasile", 22),
                new Person("Marius", 45),
                new Person("Ion", 23),
                new Person("Ionel", 15),
                new Person("George", 13),
                new Person("Mihai", 10)
        );
        List<String> names = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(names);

        List<String> namesPrefix = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .filter(person -> person.getName().startsWith("M"))
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(namesPrefix);

    }


}
