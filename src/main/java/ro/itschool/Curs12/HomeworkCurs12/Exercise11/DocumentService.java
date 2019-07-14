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
    Optional<Document> getDocumentWithName(String name) {
        //Iteram lista de documente
        for (Document docsp : documents) {
            if (docsp.getName().equals(name)) {
                return Optional.of(docsp);
            }
        }
        return Optional.empty();
    }

}
