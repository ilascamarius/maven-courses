package ro.itschool.Curs15.Homeworks.Exercise10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CountryReader {
    private final List<Country> country;

    public CountryReader(String path) throws IOException {
        this.country = fetchCountry(path);
    }

    public List<Country> getAllCountries() {
        return new ArrayList<>(country);
    }

    private List<Country> fetchCountry(String path) throws IOException {
        List<Country> resultCountry = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
        String line = bufferedReader.readLine();

        String name = null;
        while (line != null) {
            String[] countryElement = line.split(Pattern.quote("|"));
            String[] bordersElement = countryElement[5].split(Pattern.quote("~"));


            Country country = new Country(countryElement[0], countryElement[1], Integer.parseInt(countryElement[2]), Integer.parseInt(countryElement[3]), countryElement[4], List.of(bordersElement));
            resultCountry.add(country);
            line = bufferedReader.readLine();
        }
        return resultCountry;
    }

    public List<Country> getCountry() {
        return country;
    }
}
