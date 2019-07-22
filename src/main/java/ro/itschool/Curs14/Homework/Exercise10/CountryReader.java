package ro.itschool.Curs14.Homework.Exercise10;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CountryReader {
    private final List<Country> country;

    public List<Country> getAllCountries() {
        return new ArrayList<>(country);
    }

    public CountryReader(String path) throws IOException {
        this.country = fetchCountry(path);

    }

    private List<Country> fetchCountry(String path) throws IOException {
        List<Country> resultCountry = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(new File(path)));
        String line = breader.readLine();
        String name = null;

        while (line != null) {

            String[] countryElem = line.split(Pattern.quote("|"));
            Country country = new Country(countryElem[0], countryElem[1], Integer.parseInt(countryElem[2]), Integer.parseInt(countryElem[3]));
            resultCountry.add(country);


            line = breader.readLine();
        }

        return resultCountry;
    }

    //@Override
    public List<Country> getCountry() {
        return country;

    }

}

