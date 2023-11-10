package com.test;

public class changeCharacter {
	public static void main(String[] args) {
		String input = "I am the REST";
		int index = 9;
		char ch = 'B';
		
		String changedString = changeChar(index, input, ch);
		System.out.println(changedString);
	}
	
	public static String changeChar(int index, String input, char ch) {
		
		char[] charArray = input.toCharArray();
		charArray[index] = ch;
		return new String(charArray);
		
	}
}
