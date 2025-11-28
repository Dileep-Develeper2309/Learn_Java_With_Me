package com.string;

public class StringBuilderScenario1 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Dileep");
        StringBuilder s2 = new StringBuilder("Dileep");

        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//false

        String explanation = """
                s1 and s2 point to two different objects in memory, even though the contents are the same.
                StringBuilder does not override. equals() from Object. So it return false in second case.
                """;

        System.out.println(explanation);
    }
}
