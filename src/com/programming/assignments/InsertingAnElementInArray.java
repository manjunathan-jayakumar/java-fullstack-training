package com.programming.assignments;

import java.util.Arrays;

public class InsertingAnElementInArray {

    static void insert(int[] arr, int pos, int item, int currentLength){
        for(int i = currentLength+1; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = item;

    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int len = 6;
        for(int i = 0; i < len; i++){
            arr[i] = 0;
        }
        insert(arr, 2, 99, len);
        for(int item: arr){
            System.out.println(item+ " ");
        }
    }
}

// try to improve.
