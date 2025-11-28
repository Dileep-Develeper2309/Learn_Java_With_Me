package com.lambda;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        String passingBusinessLogic = """
                In lambda expression we can pass behaviour as an argument to the function.
                """;

        iHello logic = () -> System.out.println("Hi Functional Programming");

        process(logic);
        process(()-> System.out.println("Dileep here"));

        iArithmeticOperation addition = (a,b) -> {
            int result = a + b;
            return result;
        };

        iArithmeticOperation product = (a,b) -> a*b;

        System.out.println(addition.operation(78,90));
        System.out.println(product.operation(9,8));
    }

    private static void process(iHello logic) {
        logic.sayHello();
    }
}
