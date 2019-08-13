package ro.itschool.Curs21;

import java.util.ArrayList;
import java.util.List;

public class ModifyWithLambda {

    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");
        System.out.println(modifyList(names, value -> value.toUpperCase()));
        System.out.println(modifyList(names, value -> value.toLowerCase()));

    }

    private static List<String> modifyList(List<String> names, ListFunction function) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            String transformed = function.apply(name);
            result.add(transformed);
        }

        return result;
    }


    @FunctionalInterface
    interface ListFunction {
        String apply(String value);
    }
}
