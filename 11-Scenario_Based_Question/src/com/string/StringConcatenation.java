package com.string;

public class StringConcatenation {
    public static void main(String[] args) {
        String x = "dipucoding";
        String y = "dipu";
        String z = y + "coding";

        System.out.println(x == z); //false

        String explanation = """
                z = y + "lyf" is built at runtime using a variable, so it is a new object in memory.
                Even though x and z look the same, they are not the same object, so == gives false.
                """;

        System.out.println(x.equals(z)); //true
    }
}
