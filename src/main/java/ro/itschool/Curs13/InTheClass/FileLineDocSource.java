package ro.itschool.Curs13.InTheClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLineDocSource implements DocSource {
    private final List<Document> documents;

    public FileLineDocSource(String path) throws IOException {
        this.documents = fetchDocument(path);
    }

    ///Trebuie invatata!!!!
    private List<Document> fetchDocument(String path) throws IOException {
        List<Document> result = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(new File(path)));
        String line = breader.readLine();
        String name = null;
        while (line != null) {
            // System.out.println(line);
            //Construim lista de documente din fisier
            //Pastram numele
            if (name == null) {
                name = line;
            } else {
                result.add(new Document(line, name));
                name = null;
            }

            line = breader.readLine();
        }
        return result;
    }

    public List<Document> getDocuments() {
        return documents;
    }
}
