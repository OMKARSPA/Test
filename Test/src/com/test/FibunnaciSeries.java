package com.test;

import java.util.Scanner;

public class FibunnaciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Till what count you want fibunnaci series??");
		
		int count = sc.nextInt();
		
		int first=0, second=1;
		
		for(int i=0;i<count;i++) {
			System.out.println(first);
			
			int next = first + second;
			
			first = second;
			second = next;
		}
	}
}
