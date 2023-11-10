package com.test;

public class palindromeString {
	public static void main(String[] args) {
		String input = "raCecar";
		boolean check = isPalindrome(input);
		System.out.println(check);
		
	}
	
	public static boolean isPalindrome(String input) {
		
		String demo = input;
		
		String reversed = new StringBuilder(demo).reverse().toString();
		
		char[] charArray = reversed.toCharArray();
		
		
		
		System.out.println(reversed);
		
		return demo.equals(reversed);
	}

	private static char charArray(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
