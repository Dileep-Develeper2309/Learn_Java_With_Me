package com.predefinedfunctionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {

        //input data and output of same type
        UnaryOperator<String> lowerCase = name -> name.toLowerCase();
        System.out.println(lowerCase.apply("DILEEP"));
    }
}
