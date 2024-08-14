package com.programming.class2.DS;

public class MultiDimensionalArray {

    public static void main(String[] args){
        int[][] intArr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] intArr2 = {{1, 2, 3}, {4, 5, 6}};

        int[][] intArr3 = new int[2][3];

        //copying the sum of two Arrays to third array
        for (int i = 0; i < intArr3.length; i++) {
            for (int j = 0; j < intArr3[0].length; j++) {
                intArr3[i][j] = intArr1[i][j] + intArr2[i][j];
                System.out.print(intArr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
