package com.methodreference;

public class StaticMethodReference {
    public static void main(String[] args) {

        ArithmeticOperation operation = (a,b) -> {
            int result = a + b;
            System.out.println(result);
            return result;
        };

        operation.performOperation(6,9);

        //static method reference
        ArithmeticOperation staticMethodReference = StaticMethodReference::performAddition;
        staticMethodReference.performOperation(6,9);
    }

    public static int performAddition(int a, int b){
        int result = a + b;
        System.out.println(result);
        return result;
    }
}
