package com.programming.class3.InnerClass;

interface Sample {
    void message();

    class Definition {
        void show() {
            System.out.println("Parent class inside interface");
        }
    }
}

public class ClassWithinInterface extends Sample.Definition {
    @Override
    void show() {
        System.out.println("Child class inside interface");
    }

    public static void main(String[] args) {
        ClassWithinInterface obj = new ClassWithinInterface();
        obj.show(); // child

        Sample.Definition obj2 = new Sample.Definition();
        obj2.show(); // Parent
    }
}
