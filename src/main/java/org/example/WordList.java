package org.example;

import java.util.ArrayList;
import java.util.Random;

public class WordList {
    private static ArrayList<String> wordList = new ArrayList<>();
    private static final Random RANDOM = new Random();
    static {
        wordList.add("wolf");
        wordList.add("destruction");
        wordList.add("lineage");
        wordList.add("confusion");
        wordList.add("staff");
        wordList.add("equinox");
        wordList.add("sweet");
        wordList.add("gloom");
        wordList.add("reptile");
        wordList.add("reptile");
    };

    public static String generateRandomWord(){
        return wordList.get(RANDOM.nextInt(wordList.size()));
    }

}
