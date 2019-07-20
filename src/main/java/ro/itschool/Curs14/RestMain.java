package ro.itschool.Curs14;

import ro.itschool.Curs14.reader.RestDocSource;

import java.util.List;

public class RestMain {

    public static void main(String[] args) {

        List<Document> documents = new RestDocSource().getDocuments();
        System.out.println(documents);
    }
}
