package ro.itschool.Curs14.Homework.Exercise10;


import java.io.IOException;
import java.util.List;

public class MainCountryWriter {
    public static void main(String[] args) throws IOException {

        List<Country> countries = new CountryReader("src/main/resources/countries.txt").getAllCountries();
        CountryWriter countryWriter = new CountryWriter("src/main/resources/countrywrite.txt");
        for (Country c : countries) {
            countryWriter.write(c);

        }
    }
}
