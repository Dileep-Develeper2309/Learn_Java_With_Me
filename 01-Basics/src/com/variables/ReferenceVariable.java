package com.variables;

public class ReferenceVariable {
    public static void main(String[] args) {

        String referenceVariable = """
                Reference variables are used to refer an object
                """;

        System.out.println(referenceVariable);

        //example
        ReferenceVariable object = new ReferenceVariable();
        System.out.println(object);
    }
}
