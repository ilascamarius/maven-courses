package ro.itschool.Curs17.enumeration;

public class DayService {
    public String sayMyNameAgain(Day day) {
        return day.getName();
    }

    public String sayMyName(DaySimple day) {
        switch (day) {
            case MONDAY:
                return "Luni";
            case TUESDAY:
                return "Marti";
            case WEDNESDAY:
                return "Miercuri";
            case THURSDAY:
                return "Joi";
            case FRIDAY:
                return "Vineri";
            case SATURDAY:
                return "Sambata";
            case SUNDAY:
                return "Duminica";
            default:
                throw new IllegalArgumentException();
        }
    }

    public int sayMyNumber(Day day) {
        return day.getNumber();
    }
}
