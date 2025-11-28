package com.exception;

public class Throw {

    public static void main(String[] args) {

        String def = """
                -> We can create Exception object explicitly and we can hand over to the JVM
                   manually by using throw keyword.
                -> After throw statement we can't take any statement directly otherwise we will get
                   compile time error saying unreachable statement.
                -> We can use throw keyword only for Throwable types otherwise we will get compile time
                   error saying incomputable types.
                """;
        System.out.println(def);

        for(int i=1;i<=10;i++){
            if(i==5){
                throw new ArithmeticException("Exception");

            }

            else
                System.out.println("Hello");
        }
    }
}
