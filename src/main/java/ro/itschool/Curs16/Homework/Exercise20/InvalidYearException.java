package ro.itschool.Curs16.Homework.Exercise20;

public class InvalidYearException extends Exception {
    public InvalidYearException(int typedAge) {
        //BirthYearCalculatorMain birthYearCalculatorMain=new BirthYearCalculatorMain();

        super("Age " + typedAge + " is invalid");
    }

}
