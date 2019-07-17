package ro.itschool.Curs12.ExerciseCourse;

import java.util.List;

public class DocumentPrinter {
    private final Document document;

    public DocumentPrinter(Document document) {
        this.document = document;
    }

    public String printWithMarkups() {
        List<Markup> markups = document.getMarkups();
        String content = document.getContent();
        String result = "";
        int mkindex = 0;
        Markup currentMarkup = markups.get(mkindex);
        for (int i = 0; i < content.length(); i++) {
            result = result + content.charAt(i);
            if (currentMarkup.getPosition() == i) {
                result = result + '[' + currentMarkup.getContent() + "]";
                mkindex++;
                if (mkindex < markups.size()) {
                    currentMarkup = markups.get(mkindex);
                }
            }
        }
        return result;

    }

}
