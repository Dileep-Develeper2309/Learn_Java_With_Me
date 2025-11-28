package com.overidding;

class A{
    public void show(){
        System.out.println("A");
    }
}

class B extends A{
    public void show(){
        System.out.println("B");
    }
}

public class Scenario1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
