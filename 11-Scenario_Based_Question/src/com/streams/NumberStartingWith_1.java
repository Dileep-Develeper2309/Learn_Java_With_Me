package com.streams;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWith_1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 20, null, 19, 30);

        List<Integer> numberStartWith1 = numbers.stream()
                .filter(num -> String.valueOf(num).startsWith("1"))
                .toList();

        System.out.println(numberStartWith1);

        String caution = """
                Caution: when i is null, String.valueOf(null) returns the literal string "null", 
                so it won’t throw an exception (but it also won’t match).
                """;
        System.out.println(caution);
    }
}
