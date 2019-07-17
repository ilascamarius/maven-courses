package ro.itschool.curs8.Exercitiu11;

public class Oval extends RoundShape {

    int smallRadius = 3;
    int largeRadius = 4;

    public int getArea() {
        return (int) (Math.PI * smallRadius * largeRadius);
    }

    public int getPerimeter() {
        return (int) (2 * Math.PI * Math.sqrt((Math.pow(largeRadius, 2) + Math.pow(smallRadius, 2) / 2)));
    }
}
