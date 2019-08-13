package ro.itschool.JavaYourself;

import java.util.Scanner;

public class TestTR4 {
    public static void main(String[] args) {
        System.out.println("Introduceti suma in EUR:");
        Scanner scanner = new Scanner(System.in);
        float sumaEur = scanner.nextFloat();

        System.out.println("Introduceti schimbul valutar:");
        Scanner scanner2 = new Scanner(System.in);
        float cursValutar = scanner2.nextFloat();
        scanner.close();

        float result = sumaEur * cursValutar;
        System.out.printf("Suma in RON: " + "%.2f", result);
    }
}