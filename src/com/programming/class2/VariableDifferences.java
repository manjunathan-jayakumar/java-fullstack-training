package com.programming.class2;

public class VariableDifferences {

    // Non-static
    int value1;

    VariableDifferences() {
        value1 = 200;
    }

    // static
    static int value2;

    static {
        System.out.println("Static initialization Block");
        value2 = 100;
    }

    public static void main(String[] args) {
        System.out.println("Main");
        System.out.println("Value 2: "+ VariableDifferences.value2);
        VariableDifferences obj = new VariableDifferences();
        System.out.println("Value 1: "+ obj.value1);
    }
}
