package ro.itschool.Curs10.collections.maps;

import ro.itschool.Curs10.collections.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapPersons {

    public static void main(String[] args) {

        List<Person> Personersons = List.of(
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
        System.out.println(extractMap(Personersons));
        System.out.println(hairToName(Personersons));
    }

    //Create a map with the corresponding eye colour;
    private static Map<String, String> extractMap(List<Person> personersons) {
        Map<String, String> onlyHairMap = new HashMap<>();
        for (Person p : personersons) {
            onlyHairMap.put(p.getName(), p.getHairColour());
        }

        return onlyHairMap;
    }


    private static Map<String, List<String>> hairToName(List<Person> personersons) {
        Map<String, List<String>> hairToName = new HashMap<>();
        for (Person person : personersons) {
            List<String> names = hairToName.get(person.getHairColour());
            if (names == null) {
                names = new ArrayList<>();
                hairToName.put(person.getHairColour(), names);
                names.add(person.getName());

            } else {
                names.add(person.getName());
            }
        }
        return hairToName;
    }
}
