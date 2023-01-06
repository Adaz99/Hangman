package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    String a;
    String changeWord;
    char answer[];
    int lives = 8;

    Scanner userInput = new Scanner(System.in);

    private void turn() {
        int count = 0;

        System.out.print("Enter a character: ");

        char c = userInput.next().charAt(0);
        for (int i = 0; i < a.length(); i++) {
            if (c == a.charAt(i)) {
                answer[i] = c;
                count++;
            }
        }
        System.out.println("You entered: " + c);
        System.out.println(answer);


        if (count == 0) {
            lives--;
            System.out.println("Wrong guess!" + " You have " + lives + " lives left.");
            if (lives == 0) {
                endGame();
            } else {
                turn();
            }
            } else {
            turn();
            }

    }

    public void start() {
        a = WordList.generateRandomWord();
        String temp = "_".repeat(a.length());
        answer = temp.toCharArray();
        System.out.println("Welcome to the Hangman game! Enter a character to start");
        System.out.println("You have " + lives + " lives left.");
        turn();
    }

    public void endGame() {
        System.out.println("Game over no lifes left!");
        System.exit(0);

    }

    public void winner() {
        System.out.println("Game complete, WINNER!!!");
    }
}

