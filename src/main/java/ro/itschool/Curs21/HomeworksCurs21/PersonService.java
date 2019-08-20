package ro.itschool.Curs21.HomeworksCurs21;

import java.util.List;

public class PersonService {
    public final List<Person> persons;

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getAll() {
        return persons;
    }
}
