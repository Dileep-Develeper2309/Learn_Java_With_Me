package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

    public static void main(String[] args) {

        List<String> itDepartments = new ArrayList<>();

        itDepartments.add("Development");
        itDepartments.add("Testing");
        itDepartments.add("Support");
        itDepartments.add("Networking");
        itDepartments.add("Security");
        itDepartments.add("DevOps");

        System.out.println(itDepartments.stream().count());

        var numbers = List.of(1,2,3,4,5);
        int sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);

        int total = numbers.stream().mapToInt(num->num).sum();
        System.out.println(total);
    }
}
