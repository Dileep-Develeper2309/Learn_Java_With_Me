package com.overidding;

public class ObjectType {

    void show(Object o){
        System.out.println("Object");
    }

    void show(String s){
        System.out.println("String");
    }

    public static void main(String[] args) {
        Object obj = "Hello";
        ObjectType o = new ObjectType();
        o.show(obj);
    }
}
