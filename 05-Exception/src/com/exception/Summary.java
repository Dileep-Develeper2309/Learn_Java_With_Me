package com.exception;

public class Summary {
    public static void main(String[] args) {
        String summary = """
                1. try: To maintain risky code.
                2. catch: To maintain handling code.
                3. finally: To maintain cleanup code.
                4. throw: To handover our created exception object to the JVM manually.
                5. throws: To delegate responsibility of exception handling to the caller method.
                """;

        System.out.println(summary);
    }
}
