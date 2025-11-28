package com.methodreference;

public class InstanceMethodReference {
    public static void main(String[] args) {

        ArithmeticOperation operation = (a,b) -> {
            int result = a + b;
            System.out.println(result);
            return result;
        };

        operation.performOperation(6,9);

        //instance method reference
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        ArithmeticOperation instantMethodReference = instanceMethodReference::performAddition;
        instantMethodReference.performOperation(6,9);
    }

    public int performAddition(int a, int b){
        int result = a + b;
        System.out.println(result);
        return result;
    }
}
