package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class GetDuplicates {
    public static void main(String[] args) {

        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        HashSet<Integer> seen = new HashSet<>();
        List<Integer> uniqueNumbers = duplicateNumbers.stream()
                .filter(num -> !seen.add(num))
                .collect(Collectors.toList());

        System.out.println(uniqueNumbers);
    }
}
