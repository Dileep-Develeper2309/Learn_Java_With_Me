package com.creation;

import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {

        //creating streams from Collections
        var list = List.of("A","B","C","D");

        Stream<String> streamAlphabets = list.stream();
        streamAlphabets.forEach(System.out::println);

        //Stream's static method
        Stream<String> staticStream = Stream.of("A","B","C","D");
        staticStream.forEach(System.out::println);
    }
}
