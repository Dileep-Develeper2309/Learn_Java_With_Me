package com.string;

public class StringBuilderScenario2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = sb1;

        System.out.println(sb1==sb2);//true
        System.out.println(sb1.equals(sb2));//true
    }
}
