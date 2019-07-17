package ro.itschool.Curs10.Homeworks.Exercitiu21;


public class Person {

    private final String name;
    private final int age;
    private final String eyeColours;

    public Person(String name, int age, String eyeColours) {

        this.name = name;
        this.age = age;
        this.eyeColours = eyeColours;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEyeColours() {
        return eyeColours;
    }


}
