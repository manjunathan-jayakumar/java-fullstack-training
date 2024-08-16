package com.programming.class3.InnerClass;

public class MemberInnerClass {

    private int data = 10;

    // Bifurcate or cut out one functionality from other functionalities.
    // Member innerClass
    class AccessPrivate {
        void show() {
            System.out.println("The data is "+ data);
        }
    }

    public static void main(String[] args) {

        // The way to access this non-static Member inner class
        MemberInnerClass obj = new MemberInnerClass();
        MemberInnerClass.AccessPrivate obj2 = obj.new AccessPrivate();  // syntax
        obj2.show();
    }
}

// obj and obj2 are two separate objects.
// obj cannot access the methods and attr of inner class.
// obj2 can access the methods and attrs of outer class.
