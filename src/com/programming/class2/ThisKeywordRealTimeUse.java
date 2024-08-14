package com.programming.class2;

public class ThisKeywordRealTimeUse {

    void message() {
        display(this);
        System.out.println("message");
    }

    void display(ThisKeywordRealTimeUse obj) {
        obj.show();
        System.out.println("Display");
    }

    void show() {
        System.out.println("Show");
    }

    public static void main(String[] args) {
        ThisKeywordRealTimeUse obj = new ThisKeywordRealTimeUse();
        obj.message();
    }
}
