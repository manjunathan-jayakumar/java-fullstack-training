package com.programming.class3;

import java.util.Objects;

public class CloneableObject implements Cloneable {  // should implement the Cloneable interface for this work.

    String name;
    int age;

    CloneableObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloneableObject that = (CloneableObject) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    public static void main(String[] args) throws CloneNotSupportedException {  // this line is to handle the exception thrown by clone()

        CloneableObject obj1 = new CloneableObject("ABC", 29);

        CloneableObject obj2 = (CloneableObject) obj1.clone();  // creates a clone of the obj1

        System.out.println(obj2.equals(obj1));
    }
}
