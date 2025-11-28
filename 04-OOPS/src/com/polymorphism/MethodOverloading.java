package com.polymorphism;

public class MethodOverloading {

    public void methodOne() {
        System.out.println("no-arg method");
    }

    public void methodOne(int a) {
        System.out.println("arg method");
    }

    public static void main(String[] args) {
        String compileTime = """
                Method overloading is an example of compile time polymorphism.
                """;
        System.out.println(compileTime);

        MethodOverloading obj = new MethodOverloading();
        obj.methodOne(2);
    }
}
