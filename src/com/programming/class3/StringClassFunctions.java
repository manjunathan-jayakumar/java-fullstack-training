package com.programming.class3;

public class StringClassFunctions {

    public static void main(String[] args) {

        String str = "ABCDEFDG";
        System.out.println("Element at 1st index is "+ str.charAt(0));

        // with arrays, we use length property
        // with collections, we use size function
        // with strings, we use length function
        System.out.println("Total length of string is "+ str.length());

        // return a string starting with index
        System.out.println("Part of string - starting from 5th idx: "+ str.substring(5));

        System.out.println("substring starting at 0 ending at 5: "+ str.substring(0, 5));

        System.out.println("Lowercase - " + str.toLowerCase());
        System.out.println("Uppercase - " + str.toUpperCase());

        System.out.println("Concatination - " + str.concat("--XYZ"));

        System.out.println("Index of B is "+ str.indexOf("B"));
        System.out.println("Whether str starts with A: "+ str.startsWith("A"));

        System.out.println("Whether str ends with G: "+ str.endsWith("G"));
        System.out.println("Last index of D is "+ str.lastIndexOf("D"));

    }
}
