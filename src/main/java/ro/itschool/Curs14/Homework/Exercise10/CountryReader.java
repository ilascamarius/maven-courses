package ro.itschool.Curs14.Homework.Exercise10;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryReader {
    private final List<Country> country;

    public CountryReader(String path) throws IOException {
        this.country = fetchCountry(path);

    }

    private List<Country> fetchCountry(String path) throws IOException {
        List<Country> resultCountry = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(new File(path)));
        String line;
        // String[] splitResult;
        // String name = null;
        while ((line = breader.readLine()) != null) {
            resultCountry.add(new Country("Name", "Capital", 34, 45));

        }

        return resultCountry;
    }

    //@Override
    public List<Country> getCountry() {
        return country;

    }

}

