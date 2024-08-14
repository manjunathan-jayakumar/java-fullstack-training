package com.programming.class2;

public class NumberInitialization {

    private int data;

    // this block initializes the data. without this the data will be defaulted to 0.
    // Non-parameterized constructor
    NumberInitialization() {  // Constructor is not public here. see if it publicized in other example
        data = 100;
    }

    // Parameterized constructor
    NumberInitialization(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        NumberInitialization obj = new NumberInitialization();
        System.out.println("The value of data is "+ obj.data);

        NumberInitialization obj2 = new NumberInitialization(2000);
        System.out.println("The value of data is "+ obj2.data);
    }
}

// Constructor overloading example
