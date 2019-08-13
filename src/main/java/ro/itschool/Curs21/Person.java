package ro.itschool.Curs21;

public class Person {
    private final String name;
    private int age;

    Person(String name) {
        this(name, 0);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
