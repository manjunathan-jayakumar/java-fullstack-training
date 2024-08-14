package com.programming.class2.PackageB;

import com.programming.class2.PackageA.ClassA;

// class within another package
public class ClassD {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println(obj.data);
        obj.display();
    }
}
