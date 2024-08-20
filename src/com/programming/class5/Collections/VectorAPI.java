package com.programming.class5.Collections;

import java.util.Vector;

public class VectorAPI {

    public static void main(String[] args) {

        // first argument is initial capacity and second argument is load factor
        Vector<String> vec = new Vector<>(2, 5);
        // the moment third element is added to vector its capacity increased by 5

        vec.add("a");
        vec.add("a");
        vec.add("a");
        System.out.println("Size of Vector is "+ vec.size());
        System.out.println("Capacity of Vector is "+ vec.capacity());
    }
}
