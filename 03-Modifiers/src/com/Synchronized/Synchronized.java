package com.Synchronized;

public class Synchronized {

    synchronized void method(){
        System.out.println("Method execution");
    }

    public static void main(String[] args) {

        String definition = """
                -> Synchronized is only applicable for methods.
                -> If a method is declared as Synchronized then at a time only
                -> One thread is allowed to execute that method.
                """;

        System.out.println(definition);
    }
}
