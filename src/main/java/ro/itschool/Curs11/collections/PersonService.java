package ro.itschool.Curs11.collections;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final List<Person> persons;

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getAll() {
        return persons;
    }

    //afiseaza numele dupa id
    public Person getById(String id) {
        for (Person p : persons) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Person getByName(String name) {
        for (Person p : persons) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public List<Person> getByOccupation(String occupation) {
        List<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (p.getOccupation().equals(occupation)) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> findBySallary(Integer salary) {
        //fac o noua list(un nou cos)
        List<Person> resultSalary = new ArrayList<>();
        //iterez
        for (Person p : persons) {
            if (p.getSallary() == salary) {
                resultSalary.add(p);
            }
        }
        return resultSalary;
    }


}
