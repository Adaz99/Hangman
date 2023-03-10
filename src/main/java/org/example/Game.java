package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static int lives = 6;
    String a;
    char answer[];
//    int lives = 5;
    ArrayList<Character> usedLetters = new ArrayList<>();


    Scanner userInput = new Scanner(System.in);

    private void turn() {
        int count = 0;



        System.out.print("Enter a character: ");
        char c = userInput.next().toLowerCase().charAt(0);
        if (usedLetters.contains(c)) {
            System.out.println("You have already used this letter. Please enter a different letter.");
            turn();
        } else {
            usedLetters.add(c);
            for (int i = 0; i < a.length(); i++) {
                if (c == a.charAt(i)) {
                    count++;
                    answer[i] = c;
                }
            }
            System.out.println("You entered: " + c);
            System.out.println(answer);

            if (a.equals(new String(answer))) {
                winner();
            }

            if (count == 0) {
                lives--;
                System.out.println("Wrong guess!" + " You have " + lives + " lives left.");
                Picture.hangingMan();
                if (lives == 0) {
                    endGame();
                } else {
                    turn();
                }
            } else {
                turn();
            }
        }
    }

    public void start() {
        a = WordList.generateRandomWord();
        String temp = "_".repeat(a.length());
        answer = temp.toCharArray();
        System.out.println("Welcome to the Hangman game! Enter a character to start");
        turn();
    }

    public void endGame() {
        System.out.println("❌ Game over no lifes left! ❌");
        playAgain();
    }

    public void winner() {
        System.out.println(" \uD83C\uDFC6 WINNER, WINNER, CHICKEN DINNER!!! \uD83C\uDFC6");
        playAgain();
    }

    public void playAgain(){
        System.out.println("Would you like to play another game? (y/n)");
        char c = userInput.next().toLowerCase().charAt(0);
        if (c == 'y'){
            lives =6;
            usedLetters.clear();
            start();
        } else {
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
    }
}

