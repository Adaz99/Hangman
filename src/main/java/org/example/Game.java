package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    String a;
    String changeWord;
    String answer;
    private void turn() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a character: ");

        char c = userInput.next().charAt(0);

        System.out.println("You entered: " + c);


        answer = a.replaceAll("[^ " + c + "]", " _ ");
        System.out.println(answer);
        System.out.println(a);
        turn();
    }
    public void start(){
        a = WordList.generateRandomWord();
        turn();
    }

    }

