package com.string;

public class ValueOf {
    public static void main(String[] args) {
        String a = "hello";
        String b = String.valueOf(a);

        System.out.println(a==b); //true

        String explanation = """
                a is "hello"
                The method String.valueOf(Object obj) does this internally:
                return (obj == null) ? "null" : obj.toString();
                a.toString() for a String just returns itself (not a new object).
                So b ends up pointing to the same object as a. Output is true
                """;
        System.out.println(explanation);
    }
}
