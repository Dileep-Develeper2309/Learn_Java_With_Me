package com.nativedemo;

public class Client {
    public static void main(String[] args) {
        String nativeDefinition ="""
                -> Native is method applicable for only methods.
                -> The methods which are implemented in non java code are called
                   native methods or foreign methods.
                -> The main objective of the native is to improve performance.
                -> To already existing legacy non java code.
                -> To achieve machine level communication.
                """;
        //Native obj = new Native();
        //obj.method1();

        System.out.println(nativeDefinition);
    }
}
