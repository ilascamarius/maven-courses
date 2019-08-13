package ro.itschool.Curs16;

public class StringConv {

    public String toInt(String stringValue) throws NotADigitException, TheStringIsEmpty, TheStringIsNull {

        if (stringValue == null) {
            throw new TheStringIsNull();
        }

        for (int i = 0; i < stringValue.length(); i++) {
            char c = stringValue.charAt(i);
            if (!Character.isDigit(c)) {
                throw new NotADigitException(i);
            }
        }
        if (stringValue.isEmpty()) {
            throw new TheStringIsEmpty();
        }


        return String.valueOf(Integer.parseInt(stringValue));
    }
}
