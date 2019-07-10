package ro.itschool.Curs11.Exercise10;

import java.util.List;

public class DocumentService {
    private final List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> getAllDocuments() {
        return documents;
    }

    public Document getDocumentWithName(String name) {
        for (Document doc : documents) {
            if (doc.getName().equals(name))
                return doc;
        }
        return null;
    }

   /* public Document addMarkupForDocument(List<Document> documents, List<Markups> markups){
        List<String>markupForDocument=new ArrayList<>();
        for (Document mark:documents){
           markupForDocument.add
        }
    }*/
}
