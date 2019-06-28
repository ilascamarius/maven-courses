package ro.itschool.curs8.Exercitiu10;

public abstract class Square extends SideShape {

    @Override
    public void getArea() {
        int sides=4;
        System.out.println(sides*sides);
    }
}
