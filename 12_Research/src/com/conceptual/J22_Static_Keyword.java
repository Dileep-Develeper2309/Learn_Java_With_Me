package com.conceptual;

public class J22_Static_Keyword {

    //static block run once when class loads
    static {
        System.out.println("Static block");
    }
    public static void main(String[] args) {

        String meaning = """
                If we want the other class to access a method of a class without creating object
                of that class then we need to declare the methods of that class as static.
                """;

        System.out.println(meaning);
    }
}
