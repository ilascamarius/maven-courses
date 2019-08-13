package ro.itschool.Curs16;

import ro.itschool.Curs15.Homeworks.Exercise10.Country;

public class CountryEvaluatorMain {
    public static void main(String[] args) throws BadCountryException {
        CountryEvaluator countryEvaluator = new CountryEvaluator();
        try {
            countryEvaluator.evaluate(new Country("Germany"));

        } catch (BadCountryException bce) {
            System.out.println("The country that is bad is " + bce.getCountry());
        }
        System.out.println(countryEvaluator.evaluate(new Country("Belgium")));

    }

}