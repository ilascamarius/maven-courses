package ro.itschool.Curs12.ExerciseCourse;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        documents.addAll(List.of(
                new Document("doc1", "Ana are mere", "Povestea Anei"),
                new Document("doc2", "Petru are pere", "Povestea lui Petru"),
                new Document(UUID.randomUUID().toString(), "Ionut are castane", "Povestea Ionutului")
        ));

        DocumentService documentService = new DocumentService(documents);
        List<Document> docs = documentService.getAll();
        System.out.println(docs);
        System.out.println(documentService.getAll());
        Optional<Document> doc = documentService.getDocumentbyName("Povestea Anei");
        System.out.println(doc);
        if (doc.isPresent()) {
            System.out.println(doc.get().getName());
        }
        documentService.addMarkupForDocument(new Markup("321", 2, "hello"), "doc1");
        documentService.addMarkupForDocument(new Markup("3221", 4, "again"), "doc2");
        System.out.println(documentService.getMarkupsForDocument("doc2"));
        DocumentPrinter documentPrinter = new DocumentPrinter(documents.get(0));
        System.out.println(documentPrinter.printWithMarkups());
    }
}
