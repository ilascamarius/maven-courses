package ro.itschool.curs8.Exercitiu12;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();

        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.getNoOfSides());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.print(rectangle.getNoOfSides());

        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Oval oval = new Oval();
        System.out.println(oval.getArea());
        System.out.println(oval.getPerimeter());


    }
}
