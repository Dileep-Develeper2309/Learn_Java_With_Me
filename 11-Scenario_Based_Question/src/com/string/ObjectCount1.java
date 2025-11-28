package com.string;

public class ObjectCount1 {

    public static void main(String[] args) {

        String str1 = new String("Dileep");
        String str2 = "Dileep";

        String explanation = """
                1. String s1 = new String("hello");
                This creates a new object in heap memory and String “hello” in String pool.
                So now there are two strings:
                ->One in the string pool ("hello")
                ->One in the heap (s1)
                2. String s2 = "hello";
                This points directly to the string pool version of "hello".
                So now:
                ->s1 points to heap object
                ->s2 points to pool object
                """;

        System.out.println("Total 2 Object will be created.");
        System.out.println();
        System.out.println(explanation);

    }
}
