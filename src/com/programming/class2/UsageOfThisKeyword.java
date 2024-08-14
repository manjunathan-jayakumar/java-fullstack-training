package com.programming.class2;

public class UsageOfThisKeyword {

    /* this keyword resolves the ambiguity between n0n static instance variable,
    local variable and method parameter.
     */

    int data = 10;

    UsageOfThisKeyword() {
        int data = 15;  // new local variable is initialized
        System.out.println("Value of Local Variable is "+ data); // local for method
        System.out.println("Value of Global Variable is "+ this.data); // global for the *object*
    }

    UsageOfThisKeyword(int data) {
        System.out.println("Value of Local Variable is "+ data);
        System.out.println("Value of Global Variable is "+ this.data);
    }

    UsageOfThisKeyword(int data, String str) {
        this.data = data;  // object attr is updated with local var.
        System.out.println("Value of Local Variable is "+ data);
        System.out.println("Value of Global Variable is "+ this.data);
    }

    public static void main(String[] args) {
        UsageOfThisKeyword obj1 = new UsageOfThisKeyword();
        UsageOfThisKeyword obj2 = new UsageOfThisKeyword(20);
        UsageOfThisKeyword obj3 = new UsageOfThisKeyword(20, "Jan");

    }
}

/*
Take:
    local variable of a method and the attr name
    of the object containing that method can be same.
    to access object attr use `this` keyword. else local will be
    accessed.

    note: if there is no local variable with same name then
    you can call attr without `this` keyword.
 */
