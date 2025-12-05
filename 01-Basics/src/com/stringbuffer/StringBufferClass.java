package com.stringbuffer;

public class StringBufferClass {
    public static void main(String[] args) {

        String whyWeNeed = """
                -> If the content will change frequently then never recommended to go for String
                   object because for every change a new object will be created internally.
                
                -> To handle this type of requirement we should go for StringBuffer concept.
                
                -> The main advantage of StringBuffer over String is, all required changes will be
                   performed in the existing object only instead of creating new object.
                """;

        System.out.println(whyWeNeed);

        //empty StringBuffer object having default capacity 16
        StringBuffer sbEmpty = new StringBuffer();
        System.out.println(sbEmpty.capacity());

        //an empty StringBuffer object with the specified initial capacity
        StringBuffer sbInitialSize = new StringBuffer(20);
        System.out.println(sbInitialSize.capacity());

        //Creates an equivalent StringBuffer object for the given String with capacity=s.length()+16
        StringBuffer stringObject = new StringBuffer("Dileep");
        System.out.println(stringObject.capacity());

    }
}
