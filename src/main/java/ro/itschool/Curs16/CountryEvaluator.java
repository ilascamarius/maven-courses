package ro.itschool.Curs16;

import ro.itschool.Curs15.Homeworks.Exercise10.Country;

public class CountryEvaluator {
    public String evaluate(Country country) throws BadCountryException {
        if (country.getName().equals("Germany")) {
            throw new BadCountryException(country);
        }
        return "You're good";
    }
}
