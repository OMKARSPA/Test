package com.test;

import java.util.Scanner;

public class Palindrome {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        boolean isPalindrome = isPalindrome(input);

	        if (isPalindrome) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }
	 }
	 public static boolean isPalindrome(String str) {
		    str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
		    int left = 0;
		    int right = str.length() - 1;

		    while (left < right) {
		        if (str.charAt(left) != str.charAt(right)) {
		            return false; 
		        }
		        left++;
		        right--;
		    }

		    return true; 
		}
	 
}
