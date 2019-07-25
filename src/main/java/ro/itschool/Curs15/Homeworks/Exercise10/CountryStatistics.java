package ro.itschool.Curs15.Homeworks.Exercise10;

import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries;

    public CountryStatistics(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getAllCountries() {
        return new ArrayList<>(countries);
    }
}
