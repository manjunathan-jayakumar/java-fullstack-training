package com.programming.class2.DS;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        char[] chArr1 = {'a', 'd', 'u', 'e', 'f'};
        char[] chArr2 = new char[3];

        System.arraycopy(chArr1, 1, chArr2, 0, 3);
        System.out.println(Arrays.toString(chArr2));

        System.out.println(new String(chArr2));
    }
}
