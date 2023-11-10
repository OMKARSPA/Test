package com.test;
public class SecondHighestInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 15, 7, 25, 35, 30};

        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
        } else {
            int firstMax = 0;  
            int secondMax = 0; 

            for (int number : numbers) {
                if (number > firstMax) {
                    secondMax = firstMax;
                    firstMax = number;
                } else if (number > secondMax && number != firstMax) {
                    secondMax = number;
                }
            }

            if (secondMax == 0) {
                System.out.println("There is no second highest element in the array.");
            } else {
                System.out.println("The second highest number is: " + secondMax);
            }
        }
    }
}

