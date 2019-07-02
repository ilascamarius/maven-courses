package ro.itschool.curs8.Exercitiu12;

public class Square extends SideShape {

    int side = 10;

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
