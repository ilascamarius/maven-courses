package ro.itschool.Curs12.HomeworkCurs12.Exercise11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainDocument {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        documents.addAll(List.of(
                new Document("1a2", "Ilasca", "Medical History"),
                new Document("3b4", "Cornel", "Bank history"),
                new Document("5c6", "Marius", "Location tracking history")
        ));

        //Se creaza  o noua instanta documentService
        DocumentService documentService = new DocumentService(documents);
        //Se creaza o noua lista cu getAllDocuments:
        List<Document> docs = documentService.getAllDocuments();
        //Se afiseaza rezultatul documentelor:
        System.out.println(docs);

        //Afisare documente dupa nume
        Optional<Document> docsName = documentService.getDocumentWithName("Costel");
        System.out.println(docsName);

        if (docsName.isPresent()) {
            System.out.println(docsName.getName);
        }
    }
}
