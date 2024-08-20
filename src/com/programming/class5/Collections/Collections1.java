package com.programming.class5.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections1 {

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        listStr.add("A");listStr.add("A");listStr.add("A");listStr.add("A");
        listStr.add(null);listStr.add(null);listStr.add(null);
        listStr.add("X");listStr.add("Y");listStr.add("Z");

        // Second Array
        List<String> listStr2 = new ArrayList<>();
        listStr2.add("Q");listStr2.add("R");listStr2.add(null);

        // add all elements of listStr2 into listStr
        listStr.addAll(listStr2);

        // Duplicate and null are allowed
        // Insertion order is maintained - we retrieve the data in same
        // order in which it is originally added.

        System.out.println("Size of ArrayList is " + listStr.size());

        //Traverse the array
        Iterator<String> itr = listStr.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();


        // Few functions
        listStr.remove("A"); // remove the first occurrence of "A"
//        listStr.removeAll(listStr2); // remove second arraylist elements from first
        listStr.retainAll(listStr2); // remove everything from listStr except the elements in listStr from listStr2
        listStr.set(1, "Updated A"); // update the element present at the given index.

        for(String str: listStr) {
            System.out.print(str+ " ");
        }
        listStr.clear(); // After everything is done.
    }
}
