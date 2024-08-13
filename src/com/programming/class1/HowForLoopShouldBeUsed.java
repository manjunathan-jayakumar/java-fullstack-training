package com.programming.class1;

import java.util.*;

public class HowForLoopShouldBeUsed {
    /* Run this class to compare the different For loop runtimes */

    static  List<Integer> listInt = new ArrayList<>();
    static long startTime, endTime;

    static {
        // static initializer block runs before main function
        for (int i = 1; i <= 100_00_00; i++) {
            listInt.add(i);
        }
    }

    public static void main(String[] args) {
        startTime = Calendar.getInstance().getTimeInMillis();
        // enhanced for loop
        for (Integer i : listInt) {}
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Enhanced For loop took - " + (endTime - startTime) + " ms");

        startTime = Calendar.getInstance().getTimeInMillis();
        for(int i = 1; i < listInt.size(); i++) {}
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("size - Boolean Exp - Basic For loop took - " + (endTime - startTime) + " ms");

        startTime = Calendar.getInstance().getTimeInMillis();
        int sizeOfCol = listInt.size();
        for(int i = 1; i < sizeOfCol; i++) {}
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("value passed - Basic For loop took - " + (endTime - startTime) + " ms");

        startTime = Calendar.getInstance().getTimeInMillis();
        for(int i = sizeOfCol; i >= 0; --i) {}
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("value passed - Backward Basic For loop took - " + (endTime - startTime) + " ms");

    }
}
