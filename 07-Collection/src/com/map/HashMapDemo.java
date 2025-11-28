package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String,String> capitals = new HashMap<>();
        capitals.put("India","New Delhi");
        capitals.put("Bhutan","Thimpur");
        capitals.put("France","Paris");
        capitals.put(null,null);

        //Order of insertion is not followed
        System.out.println(capitals);

        //get the value
        System.out.println(capitals.get("India"));

        //get the size
        System.out.println(capitals.size());
    }
}
