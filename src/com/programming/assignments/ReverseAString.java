package com.programming.assignments;

import java.util.Scanner;

public class ReverseAString {

    public static String reverseString(String str) {
        StringBuilder revStr = new StringBuilder();
        int lastIndex = str.length() - 1;
        for(int idx = lastIndex; idx >= 0; --idx) {
            revStr.append(str.charAt(idx));
        }
        return revStr.toString();
    }

    public static String reverseSecondHalf(String str) {
        int len = str.length();

        if(len <= 3) return str;

        int mid = len%2==0? len/2 : len/2 + 1;

        StringBuilder res = new StringBuilder();
        for(int idx = 0; idx < mid; ++idx) {
            res.append(str.charAt(idx));
        }
        StringBuilder secHalf = new StringBuilder();
        for(int idx = mid; idx < len; ++idx) {
            secHalf.append(str.charAt(idx));
        }
        res.append(reverseString(secHalf.toString()));
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Reversed string: "+ reverseString(str));
        System.out.println("Second half reversed: "+ reverseSecondHalf(str));
    }
}
