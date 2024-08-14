package com.programming.class2;

// Compile Time polymorphism (or) method overloading
public class AdderFunction {

    int add(int a,int b) {  // func1
        return a + b;
    }

    float add(float a, float b) {  // func2
        return a + b;
    }

    int add(int a, int b, int c) {  // func3
        return a + b + c;
    }

    public static void main(String[] args) {
        AdderFunction obj = new AdderFunction();
        System.out.println("Add by func1: "+ obj.add(2, 3));
        System.out.println("Add by func2: "+ obj.add(2.6f, 3.9f));
        System.out.println("Add by func3: "+ obj.add(2, 3, 5));
    }
}

// All three methods have same name but different parameter type or count.
// The arguments decide which method to be called.
// Main function can also be overloaded.