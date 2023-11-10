package com.test;

import java.util.HashMap;

public class UniqueString {
    public static void main(String[] args) {
        String input = "programming";

        char firstUniqueChar = findFirstUniqueChar(input);

        if (firstUniqueChar != '\0') {
            System.out.println("The first unique character is: " + firstUniqueChar);
        } else {
            System.out.println("No unique character found in the string.");
        }
    }

    public static char findFirstUniqueChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first unique character by iterating through the string
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        // If no unique character is found, return '\0' (null character)
        return '\0';
    }
}

