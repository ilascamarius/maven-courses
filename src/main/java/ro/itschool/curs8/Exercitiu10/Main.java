package ro.itschool.curs8.Exercitiu10;

public class Main {
    public static void main(String[] args) {
        Square square = new Square() {
            // @Override
            //public int getPerimeter() {
            //  return 0;
            //}
        };
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.getNoOfSides());

        Circle circle = new Circle() {

        };

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle() {
        };

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getNoOfSides());

        Oval oval = new Oval() {
        };

        System.out.println(oval.getArea());
        System.out.println(oval.getPerimeter());
    }

}