package com.string;

public class EqualsScenario2 {
    public static void main(String[] args) {

        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println(a == b); //true
        System.out.println(a == c); //false
        System.out.println(a.equals(c)); //true
    }
}
