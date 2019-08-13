package ro.itschool.Curs16.Homework.Exercise10;

public class BirthYearCalculator {
    public int inputAge(int ageValue) throws InvalidYearException {
        int a = ageValue;

        if (ageValue < 0) {
            throw new InvalidYearException();
        }

        if (a == ageValue) {
            return 2019 - ageValue;
        }
        //  return 0;


        return a;
    }
}
