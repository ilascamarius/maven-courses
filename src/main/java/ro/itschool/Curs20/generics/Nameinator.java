package ro.itschool.Curs20.generics;

public class Nameinator<T extends Namenable> {
    public T nameMe(T name) {
        name.setName();
        return name;
    }
}
