package ro.itschool.Curs11.Exercise10;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Markups> markup = List.of(
                new Markups(232, 33, "This contains content1"),
                new Markups(323, 21, "This contains content2"),
                new Markups(221, 20, "This contains content3")
        );

        List<Document> documents = List.of(
                new Document(123, "Confidential", "This is content4", markup),
                new Document(456, "Opened", "This is content5", markup),
                new Document(678, "Available", "This is content6", markup)
        );
        System.out.println(documents);
        System.out.println(markup);
        DocumentService service = new DocumentService(documents);
        System.out.println(service.getDocumentWithName("Opened"));
    }


}
