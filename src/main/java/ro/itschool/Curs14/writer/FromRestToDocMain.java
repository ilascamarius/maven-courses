package ro.itschool.Curs14.writer;

import ro.itschool.Curs14.Document;
import ro.itschool.Curs14.reader.RestDocSource;

import java.io.IOException;
import java.util.List;

public class FromRestToDocMain {
    public static void main(String[] args) throws IOException {

        List<Document> documents = new RestDocSource().getDocuments();
        DocWriter writer = new DocWriter("src/main/resources/docs.out");
        for (Document document : documents) {
            writer.write(document);
        }
    }
}

