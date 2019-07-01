package ro.itschool.curs8.Exercitiu10;

public class Circle extends RoundShape {

    double radius = 3;

    public int getArea() {

        return (int) (Math.PI * radius * radius);
    }

    public int getPerimeter() {

        return (int) (2 * Math.PI * radius);
    }

}