package ro.itschool.Curs10.Homeworks.Exercitiu21;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {

    public static void main(String[] args) {

        List<Person> persons = List.of(

                new Person("Cornel", 32, "black"),
                new Person("Marius", 23, "blue"),
                new Person("Ilasca", 25, "brown"),
                new Person("Maria", 27, "brown"),
                new Person("Ion", 24, "green")
        );

        extractNames(persons);
        System.out.println(persons);

        System.out.println(extractNames(persons));
        separateAges(persons);
    }

    private static List<String> extractNames(List<Person> persons) {
        List<String> onlyName = new ArrayList<>();
        for (Person p : persons) {
            onlyName.add(p.getName());

        }

        return onlyName;
    }


    private static List<String> separateAges(List<Person> persons) {
        List<Integer> byAge = new ArrayList<>();
        for (Person ag : persons) {
            byAge.add(ag.getAge());
            if (ag.getAge() < 25) {
                //byAge=new ArrayList<>();
                byAge.remove(25);
            }

            return separateAges(persons);
        }
        return separateAges(persons);
    }
}
