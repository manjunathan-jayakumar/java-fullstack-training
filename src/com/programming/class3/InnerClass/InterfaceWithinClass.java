package com.programming.class3.InnerClass;

class WithinClass {
    interface C {
        void message();
    }
}

public class InterfaceWithinClass implements WithinClass.C{
    @Override
    public void message() {
        System.out.println("Interface within class");
    }

    public static void main(String[] args) {
        InterfaceWithinClass obj = new InterfaceWithinClass();
        obj.message();
    }
}
