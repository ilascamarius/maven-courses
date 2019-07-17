package ro.itschool.Curs10.Homeworks.Exercitiu10;

import java.util.ArrayList;
import java.util.List;


public class MainList {
    public static void main(String[] args) {
        List<ListOfStrings> listOfStrings = List.of(
                new ListOfStrings("overestimate"),
                new ListOfStrings("overworked"),
                new ListOfStrings("overall"),
                new ListOfStrings("overhead"),
                new ListOfStrings("head")


        );
        extractWithoutPrefix(listOfStrings);

    }

    private static List<String> extractWithoutPrefix(List<ListOfStrings> listOfStrings) {
        List<String> withoutPre = new ArrayList<>();
        for (ListOfStrings p : listOfStrings) {
            if (p.getListedPrefix().startsWith("over")) {
                withoutPre.add("test");
            }
        }
        System.out.println(withoutPre);
        return withoutPre;
    }

}
