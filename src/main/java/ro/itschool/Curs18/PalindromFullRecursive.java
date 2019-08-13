package ro.itschool.Curs18;

public class PalindromFullRecursive implements Palindrom {

    @Override
    public boolean check(String s) {
        if (s == null) {
            return false;
        } else if (s.length() <= 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return check(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }
    }
}