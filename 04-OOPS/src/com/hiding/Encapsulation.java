package com.hiding;

public class Encapsulation {

    String def = """
             Encapsulation means binding field and its corresponding in a single unit is
             called encapsulation.
            """;

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
