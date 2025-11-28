package com.overriding;


public class Parent {

    public void method1(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

   private void method2(){
       System.out.println("My private method is not visible to my child");
   }

   //final method cannot be overridden in child class
   public final void method3(){
       System.out.println("I am final method");
   }

   //Child class has to provide the implementation
   //public abstract void method4();

    public void method5() throws InterruptedException{
        System.out.println("I am throwing InterruptedException exception");
    }

    public static void method6(){
        System.out.println("Static method of Parent");
    }
}
