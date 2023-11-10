package com.test;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store employee ID and name
        Map<Integer, String> employeeMap = new TreeMap<>();

        // Add employees to the TreeMap
        employeeMap.put(101, "John Doe");
        employeeMap.put(102, "Jane Smith");
        employeeMap.put(103, "Mike Johnson");
        employeeMap.put(104, "Emily Brown");
    }
}
