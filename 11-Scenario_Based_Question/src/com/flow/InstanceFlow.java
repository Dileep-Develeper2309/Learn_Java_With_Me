package com.flow;

public class InstanceFlow {
    int x = instanceInit();
    {
        System.out.println("Instance Block");
    }
    InstanceFlow() {
        System.out.println("Constructor");
    }
    private int instanceInit() {
        System.out.println("Instance Variable Initialization");
        return 10;
    }
    public static void main(String[] args) {
       new InstanceFlow();
    }
}
