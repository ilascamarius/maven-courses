package ro.itschool.Curs14;

import ro.itschool.Curs13.InTheClass.Markup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Document {
    private String documentId;
    private String name;
    private String content;
    private List<Markup> markups;

    public Document() {

    }

    public Document(String content, String name) {
        this(UUID.randomUUID().toString(), content, name);
    }

    public Document(String documentId, String name, String content) {
        this.documentId = documentId;
        this.name = name;
        this.content = content;
        this.markups = new ArrayList<>();
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Markup> getMarkups() {
        return markups;
    }

    public void setMarkups(List<Markup> markups) {
        this.markups = markups;
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

    public void addMarkup(Markup markup) {
        markups.add(markup);
    }
}
