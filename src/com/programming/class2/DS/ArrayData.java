package com.programming.class2.DS;

public class ArrayData {

    public static void main(String[] args) {

        // declaration, instantiation(Giving the length)
        int[] intArr = new int[5];

        // initialization
        intArr[0] = 10;
        intArr[1] = 11;
        intArr[3] = 12;
        intArr[2] = 13;
        intArr[4] = 14;

        // traverse array with length property
        for(int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+ ":"+ i+ " ");
        }
        System.out.println();
        // another way to traverse - enhanced for - for each
        for(int i : intArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // String array
        String[] strArr = {"A", "AR", "ARR", "ARRA", "ARRAY"};

        for(String i : strArr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
