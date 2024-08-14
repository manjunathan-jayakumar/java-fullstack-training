package com.programming.class2.PackageB;

import com.programming.class2.PackageA.ClassA;

// Child Class of ClassA within another package
public class ClassC extends ClassA {
    public static void main(String[] args) {
        ClassC obj = new ClassC();  // Here object of child is created to check protected attr and methods.
        System.out.println(obj.data);
        obj.display();
    }
}
