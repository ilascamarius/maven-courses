package ro.itschool.Curs9;

public class Parent {
    static final String CONSTANT = "This is it";
    static String prefix = "mr";
    private int age;

    public Parent(int age) {
        this.age = age;
    }

    protected final String order() {
        return "Make your bed!";
    }

    protected String say(String message) {
        return "Parent says" + message;
    }

    protected String say() {
        return "Parent says something";
    }

    protected Parent doSomething() {
        System.out.println("Parent: Do something!");
        return null;
    }

    public int getAge() {
        return age;
    }

    public int hashCode() {
        return age % 3;

    }

    public boolean equals(Object anotheParent) {
        System.out.println("Comparing " + this + " with " + anotheParent);
        if (this.getClass().equals(anotheParent.getClass())) {
            if (((Parent) anotheParent).age == this.age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Parent with age " + age;
    }

}

