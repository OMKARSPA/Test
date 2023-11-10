package com.test;

//class reverseString{
//	public static void main(String[] args) {
//		String s = "Hello World";
//		String reversed = reversedString(s);
//		
//		System.out.println("Input string: "+s);
//		System.out.println("Original string "+reversed);
//	}
//	
//	public static String reversedString(String input) {
//		return new StringBuilder(input).reverse().toString();
//	}
//}

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input) {
        
        char[] charArray = input.toCharArray();

       
        char[] reversedArray = new char[charArray.length];

        
        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];
        }

        
        String reversed = new String(reversedArray);

        return reversed;
    }
}

