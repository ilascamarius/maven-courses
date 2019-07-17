package ro.itschool.curs8.Exercitiu11;

public class Square extends SideShape {

    int side = 4;

    public int getArea() {
        return side * side;
    }

    public int getPerimeter() {
        return side * 4;
    }

    public int getNoOfSides() {
        return 4;
    }
}
