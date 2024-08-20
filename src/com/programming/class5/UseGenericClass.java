package com.programming.class5;

// Here T stands for Type
class GenericsClass<T> {

    T att;

    T get() {
        return att;
    }

    void set(T a) {
        this.att = a;
    }
}

public class UseGenericClass {
    public static void main(String[] args) {
        GenericsClass<String> obj = new GenericsClass<>();
        obj.set("Hello");

        System.out.println("Get data: "+ obj.get());

        GenericsClass<Float> obj2 = new GenericsClass<>();  // cannot use primitive data type
        obj2.set(2.87f);

        System.out.println("Get data: "+ obj2.get());
    }
}
