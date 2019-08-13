package ro.itschool.Curs14.Homework.Exercise10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CountryWriter {
    private final BufferedWriter writer;

    public CountryWriter(String path) throws IOException {
        writer = new BufferedWriter(new FileWriter(new File(path)));

    }

    public void write(Country country) throws IOException {
        writer.write(String.format("The country of %s has capital in %s with a population of %s on an area of %s km2", country.getName(), country.getCapital(), country.getPopulation(), country.getArea()));
        writer.newLine();
    }
}
