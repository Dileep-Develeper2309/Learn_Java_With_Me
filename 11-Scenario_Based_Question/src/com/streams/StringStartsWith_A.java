package com.streams;

import java.util.Arrays;
import java.util.List;

public class StringStartsWith_A {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Banana", "Apple", "Cat", "Andrew");

        boolean newList = nameList.stream()
                .anyMatch(name -> name.startsWith("A"));

        System.out.println(newList);

    }
}
