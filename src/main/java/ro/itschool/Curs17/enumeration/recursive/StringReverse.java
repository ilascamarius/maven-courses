package ro.itschool.Curs17.enumeration.recursive;

public class StringReverse {
    public String rev(String str) {
        if (str.isEmpty()) {    //exit condition: if the string is empty, it's reverse is the empty string
            return "";
        } else {
            return rev(str.substring(1)) + str.charAt(0); //recursion step: the reverse of a string is the reverse of the string without first letter plus the first letter at the end
        }
    }
}
