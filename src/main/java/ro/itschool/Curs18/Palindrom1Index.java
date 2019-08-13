package ro.itschool.Curs18;

public class Palindrom1Index implements Palindrom {


    public boolean check(String s) {
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


}
