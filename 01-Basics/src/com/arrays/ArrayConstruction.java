package com.arrays;

import java.util.Arrays;

public class ArrayConstruction {
    public static void main(String[] args) {

        String arrayConstruction = """
                Every array in Java is an Object.
                So we can create an Array using new operator.
                
                Note:At the time array creation we should specify 
                size otherwise we will face compile time error.
                """;

        System.out.println(arrayConstruction);
        int[] arr1 = new int[10];//must specify the size even 0 also

        int[] arr2 = new int[0]; //valid we can mention 0 also

        int[] arr3 = new int['a'];

        System.out.println(arr3.length);

        //declaration, construction and initialization of an array in a single line.
        char[] name = {'d','i','p','u'};
        System.out.println(Arrays.toString(name));
    }
}
