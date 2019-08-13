package ro.itschool.JavaYourself;

import java.util.Scanner;

public class TestTR3 {
    public static void main(String[] args) {
        System.out.println("Introduceti un numar");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println((int) Math.pow(number, 2));
        System.out.println((int) Math.pow(number, 3));
    }
}
