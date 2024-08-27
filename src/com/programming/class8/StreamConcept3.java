package com.programming.class8;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StreamConcept3 {
    public static void main(String[] args) {
        Integer[] scores = new Integer[] {88, 55,66, 22, 0, 33, 54};
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Bread");shoppingList.add("Milk");
        shoppingList.add("Cereals");shoppingList.add("protein shake");

        shoppingList.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        Arrays.stream(scores).sorted().forEach(s -> System.out.print(s + " "));
    }
}
