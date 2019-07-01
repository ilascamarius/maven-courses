package ro.itschool.curs8.Exercitiu10;

public class Oval extends RoundShape {

    double largeRadius = 5;
    double smallRadius = 4;

    public int getArea() {
        return (int) (Math.PI * smallRadius * largeRadius);
    }

    public int getPerimeter() {

        return (int) (2 * Math.PI * Math.sqrt((Math.pow(largeRadius, 2) + Math.pow(smallRadius, 2) / 2)));
    }
}
