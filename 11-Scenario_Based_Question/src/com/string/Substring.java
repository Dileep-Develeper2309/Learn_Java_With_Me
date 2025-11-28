package com.string;

public class Substring {
    public static void main(String[] args) {

        String a = "hello";
        String b = a.substring(0);
        System.out.println(a == b);//true

        String explanation = """
                "hello" is stored in the String Pool, “a” points to it.
                a.substring(0) returns the same object when the whole string is taken.
                So a == b is true because both references point to the same string.
                """;
        System.out.println(explanation);
    }
}
