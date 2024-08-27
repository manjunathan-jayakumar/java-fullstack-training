package com.programming.class8;

@FunctionalInterface
interface Person{
    abstract void showName(String name);
}

public class AnonymousClassImplementation {

    public static void main(String[] args) {
        Person obj = new Person() {
            @Override
            public void showName(String name) {
                System.out.println("Name is "+ name);
            }
        };
        obj.showName("Anonymous class implementation");

        Person obj2 = (demoData) -> {
            System.out.println("Eliminate the need of "+ demoData);
        };
        obj2.showName("Anonymous class elimination");
    }
}
