package com.test;

public class StringToStringArray {
    public static void main(String[] args) {
        String inputString = "This is a sample string to convert into an array";
        
        // Split the string using a space as the delimiter
        String[] stringArray = inputString.split(" ");
        
        // Print the elements in the string array
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
