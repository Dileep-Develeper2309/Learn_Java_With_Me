package com.string;

public class EqualsScenario1 {
    public static void main(String[] args) {
        String s1 = "Dileep";
        String s2 = "Dileep";

        System.out.println(s1==s2); //true
        String explanation = """
                Both a and b are string literals with the same content.
                Java stores string literals in the String pool, so both point to the same memory location.
                """;
        System.out.println(explanation);
        System.out.println(s1.equals(s2)); //true as it checks the content

    }
}
