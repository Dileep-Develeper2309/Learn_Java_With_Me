package com.flow;

public class StaticFlow {
    
    static int x= Init();

    private static int Init() {
        System.out.println("Static variable initialization");
        return 1;
    }

    public static void main(String[] args) {

        System.out.println("main block");
    }
}
