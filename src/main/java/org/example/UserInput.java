package org.example;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public String getUserInput(){
        return scanner.nextLine().toLowerCase();
    }
}
