package com.programming.class8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamConcept {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Australia");
        countries.add("USA");
        countries.add("Great Britain");

        Collections.sort(countries);  // changes the original list
        for(String country : countries) {
            country = country.toUpperCase();
            if(!country.startsWith("A")) System.out.println(country+" ");
        }
        System.out.println();

        // using stream
        countries.stream().map(s -> s.toUpperCase()).filter(s -> !s.startsWith("A")).sorted().forEach(c -> System.out.println(c+" "));
    }
}
