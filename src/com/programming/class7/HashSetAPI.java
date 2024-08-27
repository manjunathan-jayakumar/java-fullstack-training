package com.programming.class7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetAPI {
    public static void main(String[] args) {
        Set<String> hSet = new HashSet<>();
        hSet.add("Z");hSet.add("Z");hSet.add("Z"); // only last Z is taken

        // only one null is allowed
        hSet.add(null);hSet.add(null);hSet.add(null);

        hSet.add("X");hSet.add("T");hSet.add("A");

        // Random order
        Iterator<String> itr = hSet.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+ " ");
        }
    }
}

// can replace HasSet with LinkedHashSet or TreeSet.. They have their own properties.