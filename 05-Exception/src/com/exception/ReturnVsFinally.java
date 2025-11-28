package com.exception;

public class ReturnVsFinally {
    public static void main(String[] args) {

        try {
            System.out.println("Try block executed");
            //int x = 10/0;
            return;
        }
        catch (ArithmeticException e){
            System.out.println("Inside catch block");
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
