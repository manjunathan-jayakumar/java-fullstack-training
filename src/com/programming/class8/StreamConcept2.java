package com.programming.class8;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamConcept2 {
    public static void main(String[] args) {
        Stream<String> fruitNames = Stream.of("PineApple", "Apple", "Orange", "Dragon fruit", "Jack fruit", "Kiwi");

        // getting stream of data in array list
        List<String> fruitsList = fruitNames.collect(Collectors.toList());

    }
}
