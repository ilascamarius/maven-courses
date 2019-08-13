
package ro.itschool.JavaYourself;

import java.util.Scanner;

public class TestTR2 {
    public static void main(String[] args) {
        System.out.println("Please type your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        scanner.close();

        System.out.println("Hello " + name);
    }
}
