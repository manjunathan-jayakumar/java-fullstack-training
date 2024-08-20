package com.programming.class5.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListConversion {

    public static void main(String[] args) {

        String[] str = {"z", "d", "s", "k"};

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str));

        arrayList.add("o");
        arrayList.add("R");

        System.out.println("Size of arrayList is " + arrayList.size());

        // Traverse
        for(String st : arrayList) {
            System.out.print(st + " ");
        }
        System.out.println();

        // Converting ArrayList to Array.
        // as object array
        Object[] arr0 = arrayList.toArray();

        // as string array
        String[] arr = new String[arrayList.size()];  // Initializing since it is needed to pass in as arg for .toArray()
        arr = arrayList.toArray(arr);

        // Another method
        String[] arr2 = arrayList.toArray(new String[0]);

        for(String each : arr2) {
            System.out.print(each + " ");
        }

    }
}
