package ro.itschool.Curs17.enumeration.recursive;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Factorial().factorial(3));
        System.out.println(new Fibonacci().fib(10));
        System.out.println(new Pow().pow(2, 3));
        System.out.println(new StringReverse().rev("abc"));
    }
}
