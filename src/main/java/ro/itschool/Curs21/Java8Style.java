package ro.itschool.Curs21;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface AnotherListPredicate {
    boolean apply(String value);
}

public class Java8Style {

    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");

        System.out.println(findNames(names, value -> value.equals("Alex")));
        System.out.println(findNames(names, value -> value.startsWith("A")));
        System.out.println(findNames(names, value -> value.endsWith("s")));

        System.out.println(findNames(names, new AnotherListPredicate() {
            @Override
            public boolean apply(String value) {
                return value.length() == 4;
            }
        }));
    }

    private static List<String> findNames(List<String> names, AnotherListPredicate predicate) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (predicate.apply(name)) {
                result.add(name);
            }
        }
        return result;
    }
}

