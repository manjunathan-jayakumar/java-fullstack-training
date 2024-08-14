package com.programming.class2;

// `super` keyword refers to immediate parent class

class Parent {

    int data = 10;

    void show() {
        System.out.println("Parent class");
    }
}

public class SuperKeyword extends Parent {

    int data = 20;

    void show() {
        System.out.println("Child Class");
    }

    void display() {
        System.out.println("Current Data is "+ this.data);
        System.out.println("Parent Data is "+ super.data);
        this.show();
        super.show();
    }

    public static void main(String[] args) {
        SuperKeyword obj = new SuperKeyword();
        obj.display();
    }
}
