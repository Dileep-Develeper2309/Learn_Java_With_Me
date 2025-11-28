package com.exception;

public class ExceptionDef {
    public static void main(String[] args) {

        String exception = """
                An unwanted program that disturb the normal flow of the program
                is called exception.
                """;

        String exceptionHandling = """
                Exceptional handling means finding an alternative way to continue the normal
                flow of the program
                """;

        //Exception Hierarchy
        String Throwable = """
                Throwable act as a root for exception hierarchy.
                Throwable class contains the following two child classes:Exception
                and Error.
                """;

        String checkedException = """
                The exceptions which are checked by compiler during compile time is called
                checked exception so that program can run smoothly during runtime.
                """;

        String uncheckedException = """
                The exceptions which are not checked by compiler are called unchecked exception.
                RunTimeException and its child classes and Error and its child class are comes
                under unchecked exception.
                """;

        String howToHandle = """
                We can handle exceptions during try catch.
                """;

        System.out.println(exception);
        System.out.println(exceptionHandling);
        System.out.println(Throwable);
        System.out.println(checkedException);
        System.out.println(uncheckedException);
        System.out.println(howToHandle);
    }
}
