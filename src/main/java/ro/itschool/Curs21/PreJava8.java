package ro.itschool.Curs21;

import java.util.ArrayList;
import java.util.List;

interface ListPredicate {

    boolean applyCondition(String name);
}

public class PreJava8 {
    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");

        System.out.println(findName(names, new EqualPredicate("Darius")));
        System.out.println(findName(names, new StartWithPredicate("A")));

        System.out.println(findName(names, new EqualPredicateAlex("Alex") {
            @Override
            public boolean applyCondition(String name) {
                return name.equals("Adrian");
            }
        }));
    }

    private static List<String> findName(List<String> names, ListPredicate predicate) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (predicate.applyCondition(name)) {
                result.add(name);
            }
        }
        return result;
    }

    private static class EqualPredicate implements ListPredicate {
        private final String lookup;

        public EqualPredicate(String lookup) {
            this.lookup = lookup;
        }

        @Override
        public boolean applyCondition(String name) {
            return name.startsWith(lookup);
        }
    }

    //de verificat!!!e facuta de mine
    private static class EqualPredicateAlex implements ListPredicate {
        private final String alex;

        public EqualPredicateAlex(String alex) {
            this.alex = alex;
        }

        @Override
        public boolean applyCondition(String name) {

            return name.startsWith(alex);
        }
    }
}

class StartWithPredicate implements ListPredicate {
    private final String prefix;

    public StartWithPredicate(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean applyCondition(String name) {
        return name.startsWith(prefix);
    }
}

