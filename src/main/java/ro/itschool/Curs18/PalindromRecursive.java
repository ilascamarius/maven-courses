package ro.itschool.Curs18;

public class PalindromRecursive implements Palindrom {

    @Override
    public boolean check(String s) {
        if (s == null) {
            return false;
        }

        return s.equals(reverse(s));
    }

    private String reverse(String s) {
        if (s.equals("")) {
            return "";

        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
}