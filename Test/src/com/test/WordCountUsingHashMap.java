package com.test;

import java.util.HashMap;
import java.util.Map;

public class WordCountUsingHashMap {
    public static void main(String[] args) {
        String inputString = "This is a sample string. Count words in this string, please.";

        // Remove punctuation and convert the string to lowercase
        inputString = inputString.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = inputString.split(" ");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // Count the words and store in the HashMap
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        // Display the word counts
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println("Word: " + entry.getKey() + " - Count: " + entry.getValue());
        }
    }
}

