package com.test;

import java.util.Set;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        
        Set<Integer> ages = new TreeSet<>();

        
        ages.add(30);
        ages.add(25);
        ages.add(35);
        ages.add(28);
        ages.add(40);

        ages.add(null);
        
        System.out.println("Ages in ascending order:");
        for (int age : ages) {
            System.out.println(age);
        }
    }
}

