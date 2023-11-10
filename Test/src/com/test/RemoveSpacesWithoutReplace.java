package com.test;

public class RemoveSpacesWithoutReplace {
    public static void main(String[] args) {
        String inputString = "Mechanical Engineer";

        
        StringBuilder result = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                result.append(c);
            }
        }

        String stringWithoutSpaces = result.toString();

        System.out.println("Original String: " + inputString);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }
}

