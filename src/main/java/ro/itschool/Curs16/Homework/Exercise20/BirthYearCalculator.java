package ro.itschool.Curs16.Homework.Exercise20;

public class BirthYearCalculator {
    public int inputAge(int ageValue) throws InvalidYearException {
        int a = ageValue;
        if (ageValue < 0) {
            throw new InvalidYearException(ageValue);
        }

        if (a == ageValue) {
            return 2019 - ageValue;
        }
        return a;
    }
}
