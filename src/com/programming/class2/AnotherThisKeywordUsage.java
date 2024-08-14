package com.programming.class2;

public class AnotherThisKeywordUsage {

    int data2;

    AnotherThisKeywordUsage getMeObject() {
        return this;
    }

    int data() {
        System.out.println("Data");
        return 111;
    }

    public static void main(String[] args) {
        AnotherThisKeywordUsage obj = new AnotherThisKeywordUsage();
        obj.data();

        obj.data2 = new AnotherThisKeywordUsage().getMeObject().data();  // Figure out how this works

        System.out.println(obj.data2);
    }
}
