package ro.itschool.Curs14.Homework.Exercise10;

import java.io.IOException;

public class MainCountry {
    public static void main(String[] args) throws IOException {

        CountryReader countryReader = new CountryReader("src/main/resources/countries.txt");
        System.out.println(countryReader.getCountry());


        CountryStatistics countryStatistics = new CountryStatistics();
        System.out.println(countryStatistics.getCountryByName());
    }


}
