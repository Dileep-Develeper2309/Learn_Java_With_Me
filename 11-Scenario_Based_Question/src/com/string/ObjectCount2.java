package com.string;

public class ObjectCount2 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();

        System.out.println("2 String object will be created");
        System.out.println();

        String explaination = """
                intern(): When invoked on a String object, it checks if an identical string already exists in the pool. If found, it returns a reference to the existing string. If not, it adds the string to the pool and returns a reference to the newly added string.
                Since “hello” is already existed in the string pool, It returns same object. So s1.intern() wont create new string object.
                Answer is 2 String objects.
                """;

        System.out.println(explaination);
    }
}
