package ro.itschool.Curs14.Homework.Exercise10;

import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private List<Country> countries;

    public List<Country> getAllCountries() {
        return new ArrayList<>(countries);
    }

    public CountryStatistics(List<Country> countries) {
        this.countries = countries;

    }

    public List<String> getCountryNames() {
        List<String> result = new ArrayList<>();
        for (Country c : countries) {
            result.add(c.getName());

        }
        return result;
    }


    public List<Country> getCountriesStartingWithLetters(String letter) {
        List<Country> countries = new ArrayList<>();
        for (Country c : this.countries) {
            if (c.getName().startsWith(letter)) {
                countries.add(c);
            }
        }
        return countries;
    }

    public String getCountryCapital(String countryName) {

        for (Country c : countries) {
            if (c.getName().equals(countryName)) {
                return c.getCapital();
            }
        }
        return null;
    }

    public long getPopulation(String countryName) {

        for (Country c : countries) {
            if (c.getName().equals(countryName)) {
                return c.getPopulation();
            }
        }
        return 0;
    }

    public int getArea(String countryName) {
        for (Country c : countries) {
            if (c.getName().equals(countryName)) {
                return c.getArea();
            }
        }
        return 0;
    }

    public Country getLargestCountry() {
        Country largestCountry = null;
        int largestArea = 0;
        for (Country c : countries) {
            if (c.getArea() >= largestArea) {
                largestArea = c.getArea();
                largestCountry = c;
            }
        }
        return largestCountry;
    }

    public Country getMostPeopleCountry() {
        Country mostPeopleCountry = null;
        long mostPeople = 0;
        for (Country c : countries) {
            if (c.getPopulation() >= mostPeople) {
                mostPeople = c.getPopulation();
                mostPeopleCountry = c;
            }
        }
        return mostPeopleCountry;
    }

    public Country getMostDenseCountry() {
        Country mostDense = null;
        int mostDenseArea = 0;
        for (Country c : countries) {
            double crtdens = (double) c.getArea() / c.getPopulation();
            if (crtdens > mostDenseArea) {
                mostDense = c;
            }
        }
        return mostDense;
    }
}


///CTRl+D duplica liniile;
//CTRL+Y delete line;
//CTRL+W selecteaza codul; + CTRL+ALT+V extract variable;
//CTRL+shift+W
//CTRL+ALT+L formatam codul;
//ALT+ENTER creaza metoda;
//ALT+INSERT;
//CTRL+P indica ce parametri am nevoie;
