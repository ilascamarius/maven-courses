package ro.itschool.Curs13.InTheClass;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DocumentService {

    private final List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> getAllDocuments() {
        return new ArrayList<>(documents);
    }

    public Optional<Document> getDocumentById(String id) {
        for (Document doc : documents) {
            if (doc.getDocumentId().equals(id)) {
                return Optional.of(doc);
            }
        }
        return Optional.empty();
    }

    public Optional<Document> getDocumentByName(String name) {
        for (Document doc : documents) {
            if (doc.getName().equals(name)) {
                return Optional.of(doc);
            }
        }
        return Optional.empty();
    }

    public List<Markup> getMarkupsForDocument(String docId) {
        Optional<Document> document = getDocumentById(docId);
        if (document.isPresent()) {
            return document.get().getMarkups();
        }

        return Collections.emptyList();

    }

    public void addMarkupForDocuments(Markup markup, String docId) {
        Optional<Document> doc = getDocumentById(docId);
        if (doc.isPresent()) {
            doc.get().addMarkup(markup);
        }
    }
}
