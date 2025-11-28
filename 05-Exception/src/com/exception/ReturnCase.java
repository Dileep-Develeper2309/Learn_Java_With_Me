package com.exception;

public class ReturnCase {

    public static int m1(){
        try {
            System.out.println(10/0);
            return 777;
        }
        catch (ArithmeticException e){
            return 888;
        }
        finally {
            return 999;
        }
    }

    public static void main(String[] args) {
        System.out.println(m1());
    }
}
