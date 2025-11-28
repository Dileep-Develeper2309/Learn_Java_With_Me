package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSorting {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 11, 1, 3, 5, 6, 5);
        List<Integer> result = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
