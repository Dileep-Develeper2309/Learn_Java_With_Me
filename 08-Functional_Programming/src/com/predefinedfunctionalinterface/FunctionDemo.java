package com.predefinedfunctionalinterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        //Function takes a value of some data type and return a value of some data type.
        Function<String,String> upperCase = name -> name.toUpperCase();
        Function<String,Integer> stringLength = name -> name.length();
        Function<String,String> sameData = Function.identity();

        System.out.println(upperCase.apply("dileep"));
        System.out.println(stringLength.apply("Dileep"));
        System.out.println(sameData.apply("Hi Dileep"));
    }
}
