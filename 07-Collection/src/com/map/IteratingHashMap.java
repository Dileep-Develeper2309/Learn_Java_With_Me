package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingHashMap {
    public static void main(String[] args) {

        Map<String,String> capitals = new HashMap<>();
        capitals.put("India","New Delhi");
        capitals.put("Bhutan","Thimpur");
        capitals.put("France","Paris");

        approach1(capitals);
    }

    private static void approach1(Map<String, String> capitals) {

        //using  keySet
        Set<String> keys = capitals.keySet(); //it will return keys in form of Set

        System.out.println("----Using For each----");
        for(String key:keys){
            String capital = capitals.get(key);
            System.out.println(key+":"+capital);
        }

        System.out.println();

        System.out.println("----Using Iterator----");
        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            String capital = capitals.get(key);
            System.out.println(key+":"+capital);
        }
    }

    private static void approach2(Map<String, String> capitals) {

        //Using entry
    }
}
