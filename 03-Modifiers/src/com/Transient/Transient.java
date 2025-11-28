package com.Transient;

public class Transient {
    public static void main(String[] args) {
        String definition = """
                -> Transient is a modifier applicable only variables.
                -> At the time of serialization if we don't want to serialize 
                   the value of a particular variable to meet the security constraints 
                   then we should declare that variable with transient modifier.
                -> At the time of serialization jvm ignores the original value of 
                   the transient variable and save default value that is transient means 
                   "not to serialize".
                     
                """;

        System.out.println(definition);
    }
}
