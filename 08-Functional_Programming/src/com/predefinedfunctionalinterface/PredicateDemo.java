package com.predefinedfunctionalinterface;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num%2==0;
        Predicate<Integer> isGreater = num -> num>50;

        System.out.println(isEven.test(78));
        System.out.println(isGreater.test(78));

        //checking number is greater than 50 and even\
        System.out.println(isEven.and(isGreater).test(78));
    }
}
