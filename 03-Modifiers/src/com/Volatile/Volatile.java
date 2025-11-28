package com.Volatile;

public class Volatile {
    public static void main(String[] args) {

        String definition = """
                -> Volatile is a modifier applicable only for variables.
                -> If the value of a variable keeps changing such type of variables
                   we have to declare with volatile.
                -> If a variable is declared as volatile then for every thread a separate 
                   local copy will be created by the JVM.                  
                -> The main advantage of volatile modifier is we can resolve data inconsistency
                   problems, but creating and maintaining a separate copy for every thread
                   increases complexity of the Programming and effects performance of the system.
                   Hence if there is no specific requirement never recommended to use volatile
                   modifier and it's almost outdated.
                """;

        System.out.println(definition);
    }
}
