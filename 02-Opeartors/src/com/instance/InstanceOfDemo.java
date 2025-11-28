package com.instance;

public class InstanceOfDemo {
    public static void main(String[] args) {
        String instanceOfDef = """
                We use instanceOf operator to check whether a given
                object is particular type or not.
                """;

        System.out.println(instanceOfDef);

        String s = "Dileep";
        System.out.println(s instanceof String);
    }
}
