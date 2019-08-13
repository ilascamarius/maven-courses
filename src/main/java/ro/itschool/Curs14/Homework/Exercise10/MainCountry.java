package ro.itschool.Curs14.Homework.Exercise10;

import java.io.IOException;

public class MainCountry {
    public static void main(String[] args) throws IOException {

        CountryReader countryReader = new CountryReader("src/main/resources/countries.txt");
        System.out.println(countryReader.getCountry());


        CountryStatistics countryStatistics = new CountryStatistics(countryReader.getAllCountries());
        System.out.println(countryStatistics.getCountryNames());
        System.out.println(countryStatistics.getCountriesStartingWithLetters("A"));
        System.out.println(countryStatistics.getCountryCapital("Afghanistan"));
        System.out.println(countryStatistics.getPopulation("Afghanistan"));
        System.out.println(countryStatistics.getLargestCountry());
        System.out.println(countryStatistics.getMostPeopleCountry());
        System.out.println(countryStatistics.getMostDenseCountry());
        //  System.out.println(countryStatistics.ge);


    }


}
