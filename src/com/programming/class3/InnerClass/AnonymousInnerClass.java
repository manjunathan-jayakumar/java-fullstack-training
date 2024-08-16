package com.programming.class3.InnerClass;

abstract class Person {
    abstract void firstName();
}

public class AnonymousInnerClass {

    public static void main(String[] args) {

        // Anonymous Inner Class
        Person p= new Person() {
            @Override
            void firstName() {
                System.out.println("First Name is "+ "ANON");
            }
        };
        p.firstName();
    }
}

// you know its purpose when you learn lambda
