package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalInt;

public class PrintHighest {
	public static void main(String[] main) {
		 ArrayList<Integer> numbers = new ArrayList<>();
		 numbers.add(10);
	     numbers.add(5);
	     numbers.add(20);
	     numbers.add(15);
	     numbers.add(30);
	     
	     int a = Collections.max(numbers);
	     
	     System.out.println("Using_Collection: "+a);
	    
	     
	     //--------------------------------//
		
	     OptionalInt max = numbers.stream()
	    		   .mapToInt(Integer::intValue)
	               .max();
	     System.out.println("Using_Stream: "+max);
	     
	     //-------------------------------//
	     
	     Collections.sort(numbers);
	     
	     int maximum = numbers.get(numbers.size() - 1);
	     System.out.println("Using sort: "+maximum);
    }
}







