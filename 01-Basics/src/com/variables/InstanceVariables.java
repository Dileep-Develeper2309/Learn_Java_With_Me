package com.variables;

public class InstanceVariables {

    int x = 10;
    int y;

    public static void main(String[] args) {

        String instanceVariable = """
                -> When the value of a variable is varies from object to 
                object then it is called instance variable.
                
                -> We can't access the instance variable from static area.
                
                -> We can access the instance variable from static area using an
                object reference.
                
                -> If instance variable is not initialize JVM will provide a
                default value.
                """;

        System.out.println(instanceVariable);

        InstanceVariables ref = new InstanceVariables();
        System.out.println(ref.x);
        System.out.println(ref.y);
    }
}
