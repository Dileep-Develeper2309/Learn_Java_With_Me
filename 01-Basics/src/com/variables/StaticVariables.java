package com.variables;

public class StaticVariables {
    int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        String staticVariables = """
                -> When the value of variable is not varied from object to
                   object such variable is called static variables.
                
                -> It can be accessed from both static and not static area.
                
                -> By using the class name only we can access the static
                   variable.
                
                -> To declare static variable we need to create a keyword
                   static.
                """;

        System.out.println(staticVariables);

        System.out.println(StaticVariables.y);
    }
}
