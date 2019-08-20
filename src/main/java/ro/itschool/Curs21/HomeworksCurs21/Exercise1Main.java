package ro.itschool.Curs21.HomeworksCurs21;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise1Main {

    public static void main(String[] args) {


        List<Person> persons = List.of(
                new Person("Alex", 7, "Oradea", false),
                new Person("Andrei", 10, "Oradea", false),
                new Person("Cornel", 32, "Cluj", true),
                new Person("Claudia", 25, "Arad", false),
                new Person("Claudiu", 25, "Timisoara", true),
                new Person("Ion", 26, "Alba", true),
                new Person("David", 2, "Oradea", false),
                new Person("Marius", 30, "Cluj", true)
        );
        PersonService personService = new PersonService(persons);
        System.out.println(personService.getAll());
        //Return major persons
        List<String> namesMajor = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(namesMajor);


        //Print the persons using the format: <NAME>:<CITY>:<AGE>
        List<String> namesCityAge = persons.stream()
                // .filter(person -> person)
                // .filter(person -> Boolean.parseBoolean(person.getCity()))
                //.filter(person -> Boolean.parseBoolean(person.getAge()))
                .map(person -> person.getName() + ":" + person.getCity() + ":" + person.getAge())

                .collect(Collectors.toList());
        System.out.println(namesCityAge);


        //find the persons with name starting with A
        List<String> namesStartingWith = persons.stream()
                .filter(person -> person.getName().startsWith("A"))
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(namesStartingWith);

        //return the persons names that have a car
        List<String> namesHasCar = persons.stream()
                .filter(person -> person.getHasCar() == true)
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(namesHasCar);
    }

}
