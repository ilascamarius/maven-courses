package ro.itschool.curs8.Exercitiu12;

public class Circle extends RoundShape {

    int radius = 3;

    public int getArea() {
        return (int) Math.PI * radius * radius;
    }

    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }
}
