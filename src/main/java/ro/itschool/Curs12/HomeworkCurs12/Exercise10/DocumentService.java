package ro.itschool.Curs12.HomeworkCurs12.Exercise10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


public class DocumentService {
    private final List<Document> documents;


    //Se creaza metoda DocumentService pentru constructor si pentru initializarea obiectului DocumentService
    public DocumentService(List<Document> documents) {
        this.documents = new ArrayList<>(documents);
    }

    //Se creaza metoda get pentru extragerea tuturor documentelor
    public List<Document> getAllDocuments() {
        return new ArrayList<>(documents);
    }

    //Operation for extracting document with a specific name
    public Optional<Document> getDocumentWithName(String name) {
        for (Document doc : documents) {
            if (doc.getName().equals(name)) {
                return Optional.of(doc);
            }
        }
        return Optional.empty();
    }

    //Se creaza metoda pentru
    public void addMarkupForDocument(Markup markup, String docId) {
        Optional<Document> doc = getDocumentbyId(docId);
        for (Document docs : documents) {
            if (doc.isPresent()) {
                doc.get().addMarkup(markup);
            }
        }
    }

    //Se creaza metoda pentru extragerea documentelor dupa Id
    public Optional<Document> getDocumentbyId(String id) {
        for (Document doc : documents) {
            if (doc.getDocumentId().equals(id)) {
                return Optional.of(doc);
            }
        }
        return Optional.empty();
    }

    public List<Markup> getMarkupForDocument(String docId) {
        Optional<Document> document = getDocumentbyId(docId);
        if (document.isPresent()) {
            return document.get().getMarkups();
        }
        return Collections.emptyList();
    }

}
