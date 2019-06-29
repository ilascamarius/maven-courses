package ro.itschool.curs8.Exercitiu10;

public abstract class Square extends SideShape {
    int sides = 3;
    int noOfSidesOfSquare = 4;

    private int area;
    private int perimeter;
    private int noOfSides;
    //  private int noOfSides;

    //@Override
    public int getArea() {
        return area = sides * sides;
    }


    public int getPerimeter() {
        return perimeter = sides * 4;
    }

    public int getNoOfSides() {
        return noOfSides = noOfSidesOfSquare;
    }
}
