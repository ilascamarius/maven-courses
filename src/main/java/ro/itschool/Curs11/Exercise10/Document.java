package ro.itschool.Curs11.Exercise10;


import java.util.List;
import java.util.Objects;

public class Document {
    private final int documentId;
    private final String name;
    private final String content;
    private final List<Markups> markup;


    public Document(int documentId, String name, String content, List<Markups> markup) {
        this.documentId = documentId;
        this.name = name;
        this.content = content;
        this.markup = markup;
    }

    // public List<Markups> markupMethod(){
    //   return markup;
    // }

    public int getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public List<Markups> getMarkup() {
        return markup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name, content, markup);
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof Document) {
            Document document = (Document) that;
            return documentId == document.documentId &&
                    Objects.equals(name, document) &&
                    Objects.equals(content, document);

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId=" + documentId +
                "name=" + name +
                "content=" + content;
    }
}
