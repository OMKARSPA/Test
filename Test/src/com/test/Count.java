package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Count {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(5);
		
		numbers.add(52);
        numbers.add(123);
        numbers.add(564);
        numbers.add(789);
        numbers.add(501);

        
        List<Integer> numbersWithFirstDigitFive = numbers.stream()
                .filter(num -> String.valueOf(num).startsWith("5"))
                .collect(Collectors.toList());

        
        System.out.println("Numbers with the first digit 5: " + numbersWithFirstDigitFive);
	}
}
