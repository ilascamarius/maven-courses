package ro.itschool.Curs16;

public class NotADigitException extends Exception {
    public NotADigitException(int i) {
        super("Character on position " + i + " is not digit");
    }
}
