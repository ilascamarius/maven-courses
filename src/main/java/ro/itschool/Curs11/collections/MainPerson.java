package ro.itschool.Curs11.collections;

import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Mar", "Marry", 25, "accountant", 2300),
                new Person("Joh", "John", 32, "engineer", 3000),
                new Person("Geo", "George", 31, "engineer", 3200),
                new Person("Ste", "Steve", 45, "manager", 5500),
                new Person("Mar", "Mario", 27, "programmer", 4000),
                new Person("Den", "Denis", 32, "technician", 2900),
                new Person("Mic", "Michael", 52, "team leader", 4000),
                new Person("Mik", "Mikayla", 27, "assistant manager", 3100)

        );
        {

        }
        System.out.println(persons);
        PersonService service = new PersonService(persons);
        System.out.println(service.getById("Jts"));
        System.out.println(service.getByName("Michael"));
        System.out.println(service.getByOccupation("engineer"));
        System.out.println(service.findBySallary(3200));
    }

}
