package com.programming.class3.InnerClass;

//Map.Entry - Map Interface and Entry is a sub interface
//This is used for traversing Map implementation classes.
interface A {
    void show();
    interface B {
        void display();
    }
}

//public class InterfaceWithinInterface implements A{
//
//    @Override
//    public void show() {
//        System.out.println("This is show of interface A");
//    }
//}

public class InterfaceWithinInterface implements A.B {

    @Override
    public void display() {
        System.out.println("This is display of interface B within A");
    }

    public static void main(String[] args) {
        InterfaceWithinInterface obj = new InterfaceWithinInterface();
        obj.display();
    }
}
