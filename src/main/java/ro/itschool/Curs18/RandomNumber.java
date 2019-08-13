package ro.itschool.Curs18;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        final Random reandom = new Random();
        System.out.println(reandom.nextInt(3) + 1);
    }
}
