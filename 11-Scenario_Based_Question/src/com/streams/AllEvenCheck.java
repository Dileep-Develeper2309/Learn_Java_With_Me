package com.streams;

import java.util.Arrays;
import java.util.List;

public class AllEvenCheck {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean allEven = numbers.stream()
                .allMatch(num -> num%2==0);
        System.out.println(allEven);
    }
}
