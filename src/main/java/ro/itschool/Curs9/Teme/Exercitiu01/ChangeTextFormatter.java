package ro.itschool.Curs9.Teme.Exercitiu01;

public abstract class ChangeTextFormatter implements TextFormatter {

    private String ChangeText;

    public ChangeTextFormatter(String ChangeText) {
        super();
        this.ChangeText = ChangeText;
    }

    public String format() {
        return ChangeText;
    }
}
