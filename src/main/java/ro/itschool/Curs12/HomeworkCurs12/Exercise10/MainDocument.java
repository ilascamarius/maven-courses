package ro.itschool.Curs12.HomeworkCurs12.Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainDocument {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        documents.addAll(List.of(
                new Document("a1b", "This is content1", "Constantin"),
                new Document("c2d", "This is content2", "Maria"),
                new Document("d3e", "This is content3", "Cornel")

        ));
        System.out.println(documents);
        DocumentService documentService = new DocumentService(documents);
        List<Document> docs = documentService.getAllDocuments();
        System.out.println(documentService.getAllDocuments());

        Optional<Document> doc = documentService.getDocumentWithName("Cornel");
        System.out.println(doc);

        documentService.addMarkupForDocument(new Markup("f4g", 3, "This is from markup1"), "d3e");
        System.out.println(documentService.getMarkupForDocument("d3e"));

    }

}
