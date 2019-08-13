package ro.itschool.Curs17.enumeration.recursive;

public class Factorial {

    public int factorial(int n) {
        if (n == 0) {//exit condition. When n is 0, factorial is 1
            return 1;
        } else {
            return n * factorial(n - 1); // recursion step. We multiply n with factorial of n-1
        }
    }
}
