package com.programming.class2.DS;

import java.util.Arrays;
import java.util.Collections;

public class HowToSortArray {

    public static void main(String[] args) {

        Integer[] intArr = {10, 2, 4, 5, 7, 32, 11, 444, 67};
        Arrays.sort(intArr);  // modifies the original array
        System.out.println("Sorted rep of Array is "+ Arrays.toString(intArr));

        // reverse sort
        Arrays.sort(intArr, Collections.reverseOrder());
        System.out.println("Descending -- sorted rep of Array is "+ Arrays.toString(intArr));
    }
}
