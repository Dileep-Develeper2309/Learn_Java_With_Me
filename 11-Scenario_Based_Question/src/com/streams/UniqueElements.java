package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        HashSet<Integer> uniqueElements = new HashSet<>();

        List<Integer> uniqueNumbers = duplicateNumbers.stream()
                .filter(uniqueElements::add).collect(Collectors.toList());

        System.out.println(uniqueNumbers);
    }
}
