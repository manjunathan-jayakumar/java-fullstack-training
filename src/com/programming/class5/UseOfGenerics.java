package com.programming.class5;

import java.util.ArrayList;
import java.util.List;

public class UseOfGenerics {

    public static void main(String[] args) {

        // Without generics
        List listOfData = new ArrayList();  // ArrayList implements List
        listOfData.add(123);
        listOfData.add("ABC");
        listOfData.add(false);

        String stringData = (String) listOfData.get(1); // typecast is required. since the datatype of element is unknown.
        System.out.println("Data at index 1 is "+ stringData);

        // with generics
        List<String> listOfStringOnlyData = new ArrayList<>();
        // Compile time checking is going on.
        listOfStringOnlyData.add("DEF");
        listOfStringOnlyData.add("GHI");

        String stringData2 = listOfStringOnlyData.get(1); // typecasting not required.
        System.out.println("Data at index 1 is "+ stringData2);
    }
}
