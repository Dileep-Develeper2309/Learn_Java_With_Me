package com.exception;

public class Combinations {
    public static void main(String[] args) {

        String combinations = """
                1. Whenever we are writing try block compulsory we should write either catch or
                finally. i.e., try without catch or finally is invalid.
                2. Whenever we are writing catch block compulsory we should write try.
                i.e., catch without try is invalid.
                3. Whenever we are writing finally block compulsory we should write try.
                i.e., finally without try is invalid.
                4. In try-catch-finally order is important.
                5. With in the try-catch -finally blocks we can take try-catch-finally.
                i.e., nesting of try-catch-finally is possible.
                6. For try-catch-finally blocks curly braces are mandatory.
                """;

        System.out.println(combinations);
    }
}
