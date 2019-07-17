package ro.itschool.Curs11.collections;

import java.util.Objects;

public class Person {

    private final String id;
    private final String name;
    private final int age;
    private final String occupation;
    private final int sallary;

    public Person(String id, String name, int age, String occupation, int sallary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.sallary = sallary;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getSallary() {
        return sallary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, occupation, sallary);
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof Person) {
            Person person = (Person) that;
            return id == person.id &&
                    age == person.age &&
                    Objects.equals(name, person.name) &&
                    Objects.equals(occupation, person.occupation) &&
                    Objects.equals(sallary, person.sallary);
        } else {
            return false;

        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name=" + name +
                ", occupation'" + occupation + '\'' +
                ", sallary='" + sallary + '\'' +
                '}';
    }
}
