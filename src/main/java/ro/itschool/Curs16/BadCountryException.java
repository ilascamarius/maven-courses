package ro.itschool.Curs16;

import ro.itschool.Curs15.Homeworks.Exercise10.Country;

public class BadCountryException extends Exception {
    private Country country;

    public BadCountryException(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

}
