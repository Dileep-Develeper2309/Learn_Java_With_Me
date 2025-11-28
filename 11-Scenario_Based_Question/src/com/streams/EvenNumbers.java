package com.streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> evenNumbers = list.stream()
                .filter(num -> num%2==0)
                .toList();

        System.out.println(evenNumbers);
    }
}
