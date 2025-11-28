package com.exception;

public class SystemExit {
    public static void main(String[] args) {
        String systemExit = """
                Finally will not be executed.
                """;
        try
        {
            System.out.println("try");
            System.exit(0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("catch block executed");
        }
        finally
        {
            System.out.println("finally block executed");
        }
    }
}
