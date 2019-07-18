package ro.itschool.Curs13.Homeworks.Exercise10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLineDocSource {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/doc.in");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = br.readLine();
        System.out.println(text);
    }
}
