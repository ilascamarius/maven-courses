package ro.itschool.Curs11.Exercise10;

import java.util.Objects;

public class Markups {
    //Se definesc variabilele
    private final int markupId;
    private final int position;
    private final String content;

    //Se creaza metoda cu parametrii variabilelor de mai sus si apoi se dau state-uri cu ajutrul constructorului this
    public Markups(int markupId, int position, String content) {
        this.markupId = markupId;
        this.position = position;
        this.content = content;
    }

    //Se creaza metoda get
    public int getMarkupId() {
        return markupId;
    }

    //Se creaza metoda get
    public int getPosition() {
        return position;
    }

    //Se creaza metoda get
    public String getContent() {
        return content;
    }

    @Override
    public int hashCode() {
        return Objects.hash(markupId, position, content);
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof Markups) {
            Markups markup = (Markups) that;
            return markupId == markup.markupId &&
                    position == markup.position &&
                    Objects.equals(content, markup.content);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Markups {" +
                "markupId=" + markupId + '\'' +
                "position=" + position + '\'' +
                "content=" + content + '\'';
    }

}
