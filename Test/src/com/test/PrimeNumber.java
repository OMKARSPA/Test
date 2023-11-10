package com.test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num == 0 || num==1) {
			System.out.println("Number is not prime");
		}
		
		boolean flag = true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag = false;
			}
		}
		
		if(flag==true) {
			System.out.println("Number is prime number");
		}else {
			System.out.println("Number is not prime number");
		}
	}
}
