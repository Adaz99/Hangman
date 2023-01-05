package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < WordList.generateRandomWord().length() ; i++) {
            System.out.println("_");
            
        }
        
        System.out.println(WordList.generateRandomWord());
    }
}