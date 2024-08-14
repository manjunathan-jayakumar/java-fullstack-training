package com.programming.class2.PackageA;

// Access modifier
public class ClassA {

    public int data = 10;

    public void display(){
        System.out.println("Data: "+ data);
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.display();
    }
}

/*
Play around by changing the access modifier of ClassA between public/abstract/final.
and access modifier of `int data` and `void display` among public/private/protected.

to check the level of access run ClassA, ClassB, ClassC and ClassD from PackageA and PackageB.
 */
