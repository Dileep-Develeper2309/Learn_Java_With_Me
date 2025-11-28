package com.main;

public class MainMethod {
    public static void main(String[] args) {

        String mainMethodCheck = """
                At runtime JVM checks for main method with below prototype:
                public static void main(String[] args)
                """;

        System.out.println(mainMethodCheck);

        String mainMethodExplaination = """
                public = To call by JVM from anywhere
                static = without creating object JVM has to call it.
                void = Main will not return anything.
                main = name of method and JVM always look for main method.
                String[] args = Commandline arguments
                """;

        String mainMethodOverloading = """
                We can overload the main method but JVM always call the main
                method having String[] args as arguments.
                """;

        System.out.println(mainMethodCheck);
        System.out.println(mainMethodExplaination);
        System.out.println(mainMethodOverloading);
        System.out.println("Inside main method");
    }

    public static void main(int x){
        System.out.println("Overloaded Main method");
    }
}
