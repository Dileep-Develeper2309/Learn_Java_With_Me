package com.map;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapDemo {
    public static void main(String[] args) {
        String feature = "Order of insertion is maintained";

        Map<Integer,String> numbers = new LinkedHashMap<>();
        numbers.put(1,"One");
        numbers.put(6,"Six");
        numbers.put(3,"Three");
        numbers.put(5,"Five");

        for(Map.Entry<Integer,String> entry:numbers.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
