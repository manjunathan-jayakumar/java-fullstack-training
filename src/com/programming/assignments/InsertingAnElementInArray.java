package com.programming.assignments;

import java.util.Arrays;

public class InsertingAnElementInArray {

    static void insert(int[] arr, int pos, int item, int currentLength){
        for(int i = currentLength-1; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = item;

    }

    public static void main(String[] args) {
        int len = 6;
        int[] arr = new int[7];
        Arrays.fill(arr, 1);
        insert(arr, 2, 99, len);
        for(int idx = 0; idx <= len; ++idx){
            System.out.println(arr[idx]+ " ");
        }
    }
}

// try to improve.
