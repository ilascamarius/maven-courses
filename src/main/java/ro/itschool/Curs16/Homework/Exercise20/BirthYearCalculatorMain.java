package ro.itschool.Curs16.Homework.Exercise20;

import java.util.Scanner;

public class BirthYearCalculatorMain {

    public static void main(String[] args) throws InvalidYearException {

        BirthYearCalculator birthYearCalculator = new BirthYearCalculator();
        System.out.println("Please type your age:");

        Scanner scan = new Scanner(System.in);
        int typedAge = scan.nextInt();
        System.out.println("Your birthday year is: " + birthYearCalculator.inputAge(typedAge));


    }
}
