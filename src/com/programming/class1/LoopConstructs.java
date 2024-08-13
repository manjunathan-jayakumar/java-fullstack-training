package com.programming.class1;

public class LoopConstructs {

    public static void main(String[] args) {

        // while loop
        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // for loop
        for(int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }

        System.out.println();

        // do-while loop - while loop that runs least once.
        int k = 11;
        do {
            System.out.println(k + " ");
            k++;
        }while (k <= 10);
    }
}
