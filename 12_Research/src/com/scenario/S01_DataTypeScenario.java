package com.scenario;

public class S01_DataTypeScenario {
    public static void main(String[] args) {
        int x = 29;
        float f = 25.9f;
        long num = 7653082792l;
        String name = "Dileep";
        String newString = name + x; //Java will convert the int into string and adds.
        System.out.println(newString);

        String reason = """
                If we try to add string and some numeric data type, then Java
                will first convert numeric data type to string then add.
                Final output will be a strong.
                """;
        System.out.println("------------------------------------------------");
        System.out.println(reason);
    }
}
