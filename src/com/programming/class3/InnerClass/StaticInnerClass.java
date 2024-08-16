package com.programming.class3.InnerClass;

public class StaticInnerClass {

    static int noOfChapters = 11;

    static class Access {
        void message() {
            System.out.println("No. of Chapters is "+ noOfChapters);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.Access obj = new StaticInnerClass.Access();
        obj.message();
    }
}
