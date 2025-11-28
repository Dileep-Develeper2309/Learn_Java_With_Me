package com.java_8;

public class iInterfaceImpl {
    public static void main(String[] args) {
        iInterface impl = a->a*a;
        int result = impl.calculate(5);
        System.out.println(result);

        String str = """
                MyInterface declares one abstract method calculate(int) and overrides toString() from Object.
                Methods from Object class are do not count as the abstract methods in a functional interface.
                """;

        System.out.println(str);
    }
}
