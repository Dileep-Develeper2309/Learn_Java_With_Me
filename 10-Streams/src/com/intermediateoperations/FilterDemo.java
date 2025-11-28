package com.intermediateoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {

        List<String> itDepartments = new ArrayList<>();

        itDepartments.add("Development");
        itDepartments.add("Testing");
        itDepartments.add("Support");
        itDepartments.add("Networking");
        itDepartments.add("Security");
        itDepartments.add("DevOps");

        Stream<String> streamsIt = itDepartments.stream();

        streamsIt.filter(name -> name.length()>6).map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }
}
