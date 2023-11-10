package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        // Example integer array with duplicates
        Integer[] integerArray = {1, 2, 3, 2, 4, 5, 3, 6, 7};
        
        // Remove duplicates from the integer array
        Integer[] uniqueIntegers = removeDuplicates(integerArray);
        System.out.println("Unique Integers: " + Arrays.toString(uniqueIntegers));

        // Example character array with duplicates
        Character[] charArray = {'a', 'b', 'c', 'b', 'd', 'e', 'c', 'f', 'g'};

        // Remove duplicates from the character array
        Character[] uniqueChars = removeDuplicates(charArray);
        System.out.println("Unique Characters: " + Arrays.toString(uniqueChars));

        // Example string array with duplicates
        String[] stringArray = {"apple", "banana", "cherry", "banana", "date", "elderberry", "cherry", "fig", "grape"};

        // Remove duplicates from the string array
        String[] uniqueStrings = removeDuplicates(stringArray);
        System.out.println("Unique Strings: " + Arrays.toString(uniqueStrings));
    }

    public static <T> T[] removeDuplicates(T[] array) {
        List<T> uniqueList = new ArrayList<>();
        for (T element : array) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        // Convert the ArrayList back to an array
        T[] uniqueArray = Arrays.copyOf(array, uniqueList.size());
        return uniqueList.toArray(uniqueArray);
    }
}

