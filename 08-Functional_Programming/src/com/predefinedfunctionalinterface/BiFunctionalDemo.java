package com.predefinedfunctionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionalDemo {
    public static void main(String[] args) {

        //BiPredicate -> two and input and give boolean result
        BiPredicate<Integer,Integer> isEven = (num1,num2) -> (num1 + num2)%2==0;
        System.out.println(isEven.test(67,13));

        BiFunction<Double,Double,Double> calculatePower = (num1,num2) -> Math.pow(num1,num2);
        System.out.println(calculatePower.apply(2.0,3.0));

        BiConsumer<String,String> applyAndConvert = (str1,str2) -> System.out.println((str1 + str2).toUpperCase());
        applyAndConvert.accept("dipu","sapna");

        BinaryOperator<Double> calculatePowerAgain = (num1, num2) -> Math.pow(num1,num2);
        System.out.println(calculatePower.apply(2.0,3.0));
    }
}
