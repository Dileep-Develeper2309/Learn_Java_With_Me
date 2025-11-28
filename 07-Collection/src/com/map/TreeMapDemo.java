package com.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        String def = """
                -> TreeMap is implementation of RedBlack Tree concept and stores the key-value in
                   sorted order based on the key.
                -> TreeMap cannot contain null key and maintain the ascending order based on key.
                """;

        Map<Integer,String> numbers = new TreeMap<>();
        numbers.put(1,"One");
        numbers.put(6,"Six");
        numbers.put(3,"Three");
        numbers.put(5,"Five");

        for(Map.Entry<Integer,String> entry:numbers.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
