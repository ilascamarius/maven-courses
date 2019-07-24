package ro.itschool.Curs15.Homeworks.Exercise10;

import java.io.IOException;

public class MainCountryReader {

    public static void main(String[] args) throws IOException {

        CountryReader countryReader = new CountryReader("src/main/resources/countries2.txt");
        System.out.println(countryReader.getCountry());
    }
}
