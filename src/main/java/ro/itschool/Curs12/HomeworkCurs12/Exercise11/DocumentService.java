package ro.itschool.Curs12.HomeworkCurs12.Exercise11;

//import com.sun.javadoc.Doc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DocumentService {
    private final List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = new ArrayList<>(documents);
    }

    //Pentru a returna toate documentele , se face o noua metoda getAllDocuments cu return de o noua lista de documents, pentru o buna securitate.
    public List<Document> getAllDocuments() {
        return new ArrayList<>(documents);
    }

    //Creare metoda pentru extragerea documentelor dupa nume
    public Optional<Document> getDocumentWithName(String name) {
        //Iteram lista de documente
        for (Document docsp : documents) {
            if (docsp.getName().equals(name)) {
                return Optional.of(docsp);
            }
        }
        return Optional.empty();
    }

    public Optional<Document> getDocumentById(String id) {
        for (Document docpId : documents) {
            if (docpId.getDocumentId().equals(id)) {
                return Optional.of(docpId);
            }
        }
        return Optional.empty();
    }

    public void addDocument(Document doc) {
        documents.add(doc);
    }

    public void addMarkupForDocument(Markup markup, String docId) {
        Optional<Document> doc = getDocumentById(docId);
        if (doc.isPresent()) {
            doc.get().addMarkup(markup);
        }
    }

}
