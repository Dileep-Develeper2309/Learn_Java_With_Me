package com.arrays;

public class AnonymousArray {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5}));
    }

    public static int sum(int[] arr){
        int total = 0;
        for(int i:arr){
            total = total + i;
        }
        return total;
    }

    /*
    In the above program just to call sum() , we required an array but after completing
    sum() call we are not using that array any more, Anonymous Array is best suitable.
     */
}
