package com.programming.class3;

public class InstanceOfKeyword {

    public static void main(String[] args) {

        InstanceOfKeyword obj = new InstanceOfKeyword();
        System.out.println(obj instanceof InstanceOfKeyword); // true
        obj = null;
        System.out.println(obj instanceof InstanceOfKeyword);  // false
    }
}
