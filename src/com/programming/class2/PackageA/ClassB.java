package com.programming.class2.PackageA;

// class within the same package
public class ClassB {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println(obj.data);
        obj.display();
    }
}
