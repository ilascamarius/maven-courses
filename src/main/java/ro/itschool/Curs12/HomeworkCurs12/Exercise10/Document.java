package ro.itschool.Curs12.HomeworkCurs12.Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Document {

    //Definire variabile utilizate in obiect Document
    private final String documentId;
    private final String name;
    private final String content;
    private final List<Markup> markups;

    //Creare metoda Document pentru constructor si pentru initializarea obiectului Document
    public Document(String documentId, String content, String name) {
        this.documentId = documentId;
        this.name = name;
        this.content = content;
        this.markups = new ArrayList<>();
    }

    //Creare metoda get pentru extragerea variabilelor utilizate in obiect

    public String getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public List<Markup> getMarkups() {
        return new ArrayList<>(markups);
    }

    public void addMarkup(Markup markup) {
        markups.add(markup);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(documentId, document.documentId) &&
                Objects.equals(name, document.name) &&
                Objects.equals(content, document.content) &&
                Objects.equals(markups, document.markups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name, content, markups);
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", markups=" + markups +
                '}';
    }
}
