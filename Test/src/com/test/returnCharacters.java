package com.test;

public class returnCharacters {
	 public static void main(String[] args) {
	        String input = "Hello, World!";
	        
	        // Iterate over the characters in the string
	        for (int i = 0; i < input.length(); i++) {
	            char character = input.charAt(i);
	            System.out.println(character);
	        }
	    }
}
