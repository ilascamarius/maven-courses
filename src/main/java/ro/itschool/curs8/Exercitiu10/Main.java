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
    }
}