package com.varargs;

public class VarArg {

    public static void sum(int... x){

        int total = 0;

        for(int i = 0; i<x.length; i++){
            total = total + x[i];
        }

        System.out.println(total);
    }

    public static void array(int... arg){
        System.out.println("Var Args");
    }

    public static void main(String... args) {
        String varArg = """
                -> We can pass any number of arguments including 0 also.
                
                -> We can number of parameter  including 0 also.
                
                -> If we mix var arg parameter with general parameter then
                   var arg parameter should be least.
                
                -> A method can have only one var arg parameter.
                
                -> For an var arg method we can provide the corresponding
                   type array as an argument.
                
                -> Wherever single dimensional array present we can replace with 
                var-arg parameter and its reverse is not possible.
                """;

        System.out.println(varArg);

        sum();
        sum(10);
        sum(10,20);
        sum(10,20,30,40);

        array(new int[]{1,2,3});
    }
}
