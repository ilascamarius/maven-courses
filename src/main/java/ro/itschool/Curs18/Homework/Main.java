package ro.itschool.Curs18.Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        Scanner keyboard = new Scanner(System.in);
        String input;
        char guess;

        game.initializeGame();
        do {
            System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\nWord: ");
            game.showRow();

            System.out.print("\n\nMisses: ");
            game.showMisses();

            System.out.print("\nGuess: ");
            input = keyboard.next();

            if (input.equalsIgnoreCase("exit"))
                break;
            else if (input.equalsIgnoreCase("new"))
                game.initializeGame();
            else {
                guess = input.charAt(0);
                game.checkRow(guess);

                if (game.isLooser()) {
                    System.out
                            .println("\nGame Over!\nYou have missed 8 times!\nThe word was "
                                    + game.getSecretWord()
                                    + " ! \nThe game will now reset!\n");
                    game.initializeGame();
                } else if (game.IsWinner()) {
                    System.out
                            .println("\nCongratulations!\nYou have guessed the word!\nThe game will now reset!\n");
                    game.initializeGame();
                    game.initializeGame();
                }

            }

        } while (true);

        System.out.println("\nThank you for playing !");
        keyboard.close();
    }

}
