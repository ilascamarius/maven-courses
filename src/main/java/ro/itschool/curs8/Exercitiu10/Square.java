package ro.itschool.curs8.Exercitiu10;

public class Square extends SideShape {
    int sides = 3;
    //  int noOfSidesOfSquare = 4;

    // private int area;
    //private int perimeter;
    //private int noOfSides;
    //  private int noOfSides;

    //@Override
    public int getArea() {
        return sides * sides;
    }


    public int getPerimeter() {
        return sides * 4;
    }

    public int getNoOfSides() {
        return 4;
    }
}
