package com.programming.class3.InnerClass;

public class LocalInnerClass {

    private int data = 20;

    void display() {
        class Inner2 {
            void show() {
                System.out.println("The value of data is "+ data);
            }
        }
        Inner2 obj = new Inner2();
        obj.show();
    }

    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
    }
}

// has the same functionality as member inner class.
