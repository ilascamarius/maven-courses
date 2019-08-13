package ro.itschool.Curs18;

public class Palindrom2Index implements Palindrom {
    public static void main(String[] args) {
    }

    @Override
    public boolean check(String s) {
        if (s == null) {
            return false;
        }

        int j = s.length();
        for (int i = 0; i < s.length(); i++, j--) {
            if (s.charAt(i) != s.charAt(j - 1)) {
                return false;
            }
        }
        return true;
    }

}

