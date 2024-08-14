package com.programming.class2.DS;

public class PassArrayToMethod {

    public static void main(String[] args) {

        int[] intArr = {10, 3, 2, 5, 6, 18, 18};
        findMinValue(intArr);
    }

    static void findMinValue(int[] intArr) {
        int minValue = intArr[0]; // take first element of array

        for(int i = 1; i < intArr.length; i++) {
            if(minValue > intArr[i]) {
                minValue = intArr[i];
            }
        }

        System.out.println("Minimum element: " + minValue);
    }
}
