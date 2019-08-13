package ro.itschool.Curs17.enumeration.recursive;

public class Pow {
    public int pow(int b, int p) {
        if (p == 0) { //exit condition: if the power is 0, then the result is always 1
            return 1;
        } else {
            return b * pow(b, p - 1); //re-entry step: b^p = b * b^(p-1)
        }
    }
}
