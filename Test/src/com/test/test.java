package com.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class test {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArray = new int[5]; 
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();

        System.out.println("Enter five integers:");
        
        
        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
        }
        boolean n = false;
        for(int i=0;i<5;i++) {
        	if(intArray[i] == num) {
        		System.out.println("Found");
        		System.out.println("Position:"+i);
        		n = true;
        	}
        }
        
        if(n==false) {
        	System.out.println("Not found");
        }
        
        int result = Arrays.binarySearch(intArray, 5);
        
        
        
	   boolean b = Arrays
				.stream(intArray)
				.anyMatch(e->e==5);
	   
	   //Arrays.sort(intArray, Collections.reverseOrder()); //Work on integer only
	   
	 
		        // Original string
		        String omkar = "omkar";

		        StringBuilder reversed = new StringBuilder(omkar);

		      
		        reversed.reverse();
		        String reversedString = reversed.toString();

		       System.out.println("Reversed string: " + reversedString);
		    
		

	   
				
	}
}
