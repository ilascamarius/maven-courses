package ro.itschool.Curs10.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Ana");
        words.add("are");
        words.add("mere");
        words.add("multe");
        words.add("mere");
        words.add("si");
        words.add("pere");
        words.add("Ana");
        words.add("si");
        words.add("Maria");
        words.add("si");
        words.add("Ionut");

        System.out.println(words);
        List<String> result = duplicateWord("mere", words);
        System.out.println(result);
        List<String> removedMere = removeWord("mere", words);
        System.out.println(removedMere);
        removeWordRef("Ana", words);
        System.out.println(words);


    }

    //Remove word "Ana"
    public static void removeWordRef(String word, List<String> words) {
        Iterator<String> wordIterator = words.iterator();
        while (wordIterator.hasNext()) {
            String next = wordIterator.next();
            if (next.equals(word)) {
                wordIterator.remove();
            }
        }
    }

    //Remove word mere
    public static List<String> removeWord(String word, List<String> words) {

        List<String> result = new ArrayList<>();
        for (String element : words) {
            if (!element.equals(word)) {
                result.add(element);
            }
        }
        return result;
    }

    //duplicate word mere
    public static List<String> duplicateWord(String word, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String element : words) {
            result.add(element);
            if (element.equals(word)) {
                result.add(element);
            }
        }

        return result;

    }

}
