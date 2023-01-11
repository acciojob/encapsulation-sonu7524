package com.driver;

public class Main {
  public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        //calling setter function name setName(String_name) to store name string
        rw.setName("Sonu Daryani");
        //print the string usnig getter method name getName()
        System.out.println(rw.getName());
    }
}
