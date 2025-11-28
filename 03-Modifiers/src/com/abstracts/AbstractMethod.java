package com.abstracts;

public abstract class AbstractMethod {
    String definition = """
                -> Abstract is the modifier applicable only for methods 
                   and classes but not for variables.
                
                -> That is abstract methods have only declaration but not implementation.
                
                -> Class who implements will need to define those methods present
                   in the abstract class.
                   
                -> Child classes are responsible to provide implementation for 
                parent class abstract methods.
               
                """;

    public abstract void abstractMethod();
}
