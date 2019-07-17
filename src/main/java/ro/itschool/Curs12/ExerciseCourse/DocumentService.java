package ro.itschool.Curs12.ExerciseCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DocumentService {
    private final List<Document> documents;

    public DocumentService(List<Document> documents) {
        //nu dam voie sa cream alte referinte, este buna pentru securiate
        this.documents = new ArrayList<>(documents);
    }

    //getAllDocuments
    public List<Document> getAll() {
        //nu dam voie sa cream alte referinte
        return new ArrayList<>(documents);
        //sau return unmodifiableList(documents);
    }

    //getDocumentWithName
    public Optional<Document> getDocumentbyName(String name) {
        for (Document doc : documents) {
            if (doc.getName().equals(name)) {
                return Optional.of(doc);
            }
        }
        return Optional.empty();
    }

    public Optional<Document> getDocumentbyId(String id) {
        for (Document doc : documents) {
            if (doc.getDocumentId().equals(id)) {
                return Optional.of(doc);
            }
        }
        return Optional.empty();
    }

    public void addDocument(Document doc) {
        documents.add(doc);
    }

    //addMarkupForDocument
    public void addMarkupForDocument(Markup markup, String docId) {
        Optional<Document> doc = getDocumentbyId(docId);
        if (doc.isPresent()) {
            doc.get().addMarkup(markup);
        }
    }

    //getMarkupsForDocument
    public List<Markup> getMarkupsForDocument(String docId) {
        Optional<Document> document = getDocumentbyId(docId);
        if (document.isPresent()) {
            return document.get().getMarkups();
        }
        return Collections.emptyList();
    }


  /*  public String getDocumentContent(String documentId){
        Optional<Document>document=getDocumentbyId(documentId);

    }*/


}
