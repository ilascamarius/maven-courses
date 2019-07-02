package ro.itschool.curs8.Exercitiu12;

public class Rectangle extends SideShape {
    int smallSide = 4;
    int largeSide = 5;

    public int getArea() {
        return smallSide * largeSide;
    }

    public int getPerimeter() {
        return 2 * (smallSide * largeSide);
    }

    public int getNoOfSides() {
        return 4;
    }
}
