package ro.itschool.Curs10.collections;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String hairColour;


    public Person(String name, int age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    // @Override
    //public boolean equals()
}

//HASHCODE defineste galeata
//EQUALS face equals pe galeata respectiva
