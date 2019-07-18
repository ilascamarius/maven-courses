package ro.itschool.Curs13.Homeworks.Exercise20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile4 {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/doc.in");
        BufferedReader bf = new BufferedReader(new FileReader(file));


        String displayText;
        while ((displayText = bf.readLine()) != null) {
            System.out.println(displayText);
        }
    }
}
