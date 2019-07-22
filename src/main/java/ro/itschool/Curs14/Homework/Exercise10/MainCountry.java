package ro.itschool.Curs14.Homework.Exercise10;

import java.io.IOException;
import java.util.List;

public class MainCountry {
    public static void main(String[] args) throws IOException {

        CountryReader countryReader = new CountryReader("src/main/resources/countries.txt");
        System.out.println(countryReader.getCountry());


        CountryStatistics countryStatistics = new CountryStatistics();
        List<Country> contr = countryStatistics.getAllCountries();
        System.out.println(countryStatistics.getAllCountries());
    }


}
