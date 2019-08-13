package ro.itschool.Curs17.enumeration;


import static ro.itschool.Curs17.enumeration.Day.FRIDAY;
import static ro.itschool.Curs17.enumeration.Day.TUESDAY;

public class EnumsMain {
    public static void main(String[] args) {
        DayService dayName = new DayService();
        System.out.println(dayName.sayMyName(DaySimple.FRIDAY));
        System.out.println(dayName.sayMyNameAgain(FRIDAY));

        System.out.println(FRIDAY + " day in week is " + FRIDAY.getNumber());

        System.out.println(dayName.sayMyNumber(TUESDAY));

        for (Day day : Day.values()) {
            System.out.println(day.getName());
        }

        for (Day day : Day.values()) {
            if (day.bestDay()) {
                System.out.println(day.getName());
            }
        }

        System.out.println(Day.valueOf("MONDAY").getName());

    }
}
