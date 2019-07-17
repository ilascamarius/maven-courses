package ro.itschool.Curs12.HomeworkCurs12.Exercise10;

import java.util.Objects;

public class Markup {
    //Declarare variabile din obiectul Markup
    private final String markupId;
    private final int position;
    private final String content;

    //Creare metoda cu variabilele folosite in state
    public Markup(String markupId, int position, String content) {
        this.markupId = markupId;
        this.position = position;
        this.content = content;
    }

    //Creare metoda get pentru extragerea variabilelor definite
    public String getMarkupId() {
        return markupId;
    }

    public int getPosition() {
        return position;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Markup markup = (Markup) o;
        return position == markup.position &&
                Objects.equals(markupId, markup.markupId) &&
                Objects.equals(content, markup.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markupId, position, content);
    }

    @Override
    public String toString() {
        return "Markup{" +
                "markupId='" + markupId + '\'' +
                ", position=" + position +
                ", content='" + content + '\'' +
                '}';
    }
}
