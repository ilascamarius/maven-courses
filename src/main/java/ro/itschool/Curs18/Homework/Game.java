package ro.itschool.Curs18.Homework;

import java.util.Random;

public class Game {
    private final String[] wordArray = {"baboons", "beavers", "cats",
            "chickens", "choughs", "dolphins", "eagles", "elephants",
            "flamingoes", "giraffes", "grasshoppers", "hedgehogs", "hornets",
            "kangaroos"};
    Random random = new Random();
    StringBuffer misses = new StringBuffer("");
    char[] hangman;
    private String secretWord;

    public void initializeGame() {
        setWord();
        setRow();
        misses.delete(0, misses.length());
        System.out.println("\nNew game started! Type \"exit\" to stop game or \"new\" to reset !\nOnly the first letter in youre input will be considered a guess.\nYou have 8 guesses !\n");
    }

    private void setWord() {
        secretWord = wordArray[random.nextInt(wordArray.length)];
    }

    private void setRow() {
        hangman = new char[secretWord.length()];
        for (int i = 0; i < secretWord.length(); i++) {
            hangman[i] = '_';
        }
    }

    public void showRow() {
        for (int i = 0; i < hangman.length; i++)
            System.out.print(hangman[i] + " ");
    }

    public void showMisses() {
        System.out.println(misses);
    }

    private boolean isCharInWord(char guess) {
        for (int i = 0; i < hangman.length; i++) {
            if (secretWord.charAt(i) == guess)
                return true;
        }
        return false;
    }

    private void changeRow(char guess) {
        for (int i = 0; i < hangman.length; i++)
            if (secretWord.charAt(i) == guess)
                hangman[i] = secretWord.charAt(i);
    }

    private void addToMisses(char guess) {
        misses.append(guess + " ");
    }

    public void checkRow(char guess) {
        if (isCharInWord(guess)) {
            changeRow(guess);
        } else
            addToMisses(guess);

    }

    public boolean isLooser() {
        if (misses.length() / 2 > 7)
            return true;
        return false;
    }

    public boolean IsWinner() {
        for (int i = 0; i < hangman.length; i++)
            if (hangman[i] == '_')
                return false;
        return true;
    }

    public String getSecretWord() {
        return secretWord;
    }

}