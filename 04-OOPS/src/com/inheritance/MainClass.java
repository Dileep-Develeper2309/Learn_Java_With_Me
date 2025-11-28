package com.inheritance;

public class MainClass {
    public static void main(String[] args) {
        String def2 = """
                -> IS-A Relationship(inheritance);
                """;
        System.out.println(def2);

        Parent p1 = new Parent();
        Child c1 = new Child();

        String case1 = """
        Parent class can hold the reference of child class but child class
        cannot hold reference of parent class
        """;
        System.out.println(case1);
        Parent p2 = new Child();

        String calling = """
                By using child class reference we can access both parent 
                and child class method;
                """;
        System.out.println(calling);
        c1.parentMethod();
        c1.childMethod();
    }
}
