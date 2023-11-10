package com.test;


enum Day {
 MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumToStringConversion {
 public static void main(String[] args) {
     
     Day myDay = Day.FRIDAY;
     String dayString = myDay.name();

     System.out.println("Enum to String: " + dayString);
 }
}
