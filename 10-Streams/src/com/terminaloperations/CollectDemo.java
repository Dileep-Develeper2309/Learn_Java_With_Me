package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<String> itDepartments = new ArrayList<>();

        itDepartments.add("Development");
        itDepartments.add("Testing");
        itDepartments.add("Support");
        itDepartments.add("Networking");
        itDepartments.add("Security");
        itDepartments.add("DevOps");

        List<String> newNames = itDepartments.stream()
                .filter(name -> name.startsWith("D"))
                .collect(Collectors.toList());

        newNames.forEach(System.out::println);
    }
}
