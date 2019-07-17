package ro.itschool.Curs9;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.prefix);
        Parent parent = new Parent(10);
        System.out.println(parent.prefix);
        child.prefix = "altceva";
        System.out.println(parent.prefix);

        print(new Parent(10));
        //Child child = new Child();
        print(child);

        System.out.println(child.say("over", "High"));
        Parent pChild = new Child();
        print(pChild);
    }

    public static void print(Parent object) {
        System.out.println("---");
        object.doSomething();
        System.out.println(object.say());
        System.out.println(object.say(" overloading"));
    }
}
