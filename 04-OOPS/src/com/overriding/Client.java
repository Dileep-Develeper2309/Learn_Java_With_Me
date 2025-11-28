package com.overriding;

public class Client {
    public static void main(String[] args) {

        String runtimePolymorphism = """
                In method overriding, the JVM decides which method to call at runtime based on 
                the actual (runtime) object, not the reference type.That’s why overriding 
                is called runtime polymorphism.
                """;

        String methodHiding = """
                ->When Parent's class static method is overridden in child class
                  it is called method hiding.
                -> Its also a compile-time polymorphism.
                """;
        System.out.println(runtimePolymorphism);

        Parent p1 = new Parent();
        p1.method1();

        Child c1 = new Child();
        c1.method1();

        Parent p2 = new Child();
        p2.method1();

        c1.method3();

        c1.method5();

        System.out.println(methodHiding);
        c1.method6();
    }
}
