package ro.itschool.Curs18;

import java.util.Stack;

public class PalindromDataStructures implements Palindrom {

    @Override
    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        String rev = "";
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            Character pop = stack.pop();
            rev = rev + pop;
        }

        if (s.equals(rev)) {
            return true;
        }
        return false;
    }
}
