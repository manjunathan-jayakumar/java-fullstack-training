package com.programming.class1;

public class BreakAndContinueKeywords {

    public static void main(String[] args) {

        // break
        for(int i =1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i + " ");
        }
        System.out.println();

        // continue
        for(int i =1; i <= 10; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i + " ");
        }

    }
}
