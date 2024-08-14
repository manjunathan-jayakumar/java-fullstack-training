package com.programming.class2.DS;

import java.util.Arrays;

public class HowArraysAreCompared {

    public static void main(String[] args) {

        int[] intArr1 = {1, 2};
        int[] intArr2 = {1, 2};

        if(intArr1 == intArr2) {  // compares address of two arrays
            System.out.println("Arrays address are same");
        }
        else {
            System.out.println("Arrays are different");
        }

        System.out.println(Arrays.equals(intArr1, intArr2));  // compares each elements

        if(Arrays.equals(intArr1, intArr2)) {
            System.out.println("Array values are equal");
        }
        else {
            System.out.println("Array values are not equal");
        }

        boolean[] blnArr1 = {true, false};
        boolean[] blnArr2 = {true, false};

        if(Arrays.equals(blnArr1, blnArr2)) {
            System.out.println("these boolean arrays are equal valued");
        }
        else {
            System.out.println("These boolean arrays are not equal valued");
        }

    }
}
