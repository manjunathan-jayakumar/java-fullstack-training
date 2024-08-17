package com.programming.assignments;

public class ReversingAnArray {

    public static void main(String[] args) {

        int[] arr = {6, 5, 4, 3, 2, 1};
        int arrLength = arr.length;
        int mid = arrLength/2;
        for(int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[arrLength - 1 - i];
            arr[arrLength - 1 - i] = temp;
        }

        for(int i : arr) {
            System.out.println(i + " ");
        }
    }
}
