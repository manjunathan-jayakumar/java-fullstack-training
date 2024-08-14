package com.programming.class2;

public class StaticCounter {

    static int count = 10;

    StaticCounter() {
        count++;
        System.out.println("The value of count is "+ count);
    }

    public static void main(String[] args) {
         StaticCounter c1 = new StaticCounter();
         StaticCounter c2 = new StaticCounter();
         StaticCounter c3 = new StaticCounter();

    }
}
