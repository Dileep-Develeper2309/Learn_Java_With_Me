package com.overriding;

public class Child extends Parent{

    public void method1(){
        System.out.println("I am the boss");
    }

    /*its valid but it's not overriding because Parent's private method
    is not visible to child.
   */
    private void method2(){
        System.out.println("My private method is not visible to my child");
    }

    public void method5() {
        System.out.println("I am throwing InterruptedException exception");
    }

    public static void method6(){
        System.out.println("Static method Child");
    }
}
