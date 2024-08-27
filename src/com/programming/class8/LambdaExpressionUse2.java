package com.programming.class8;

@FunctionalInterface  // interface with single function
interface MyComparable {
    boolean compare(int n1, int n2);
}

public class LambdaExpressionUse2 {
    public static void main(String[] args) {
        MyComparable obj = (a, b) -> {
            return a > b;
        };
        System.out.println(obj.compare(2, 4));

    }
}
