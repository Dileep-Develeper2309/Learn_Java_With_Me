package com.predefinedfunctionalinterface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        //It consumes only input data and not return anything
        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());

        convertAndDisplay.accept("dipu");
    }
}
