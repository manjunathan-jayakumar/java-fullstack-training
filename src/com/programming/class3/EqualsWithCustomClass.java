package com.programming.class3;

import java.util.Objects;

class Employee {
    String firstName;

    Employee(String name) {
        this.firstName = name;
    }

    // Override the equals and hashcode methods of Object class to work on custom classes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }
}

public class EqualsWithCustomClass {

    public static void main(String[] args) {
        Employee e1 = new Employee("ABC");
        Employee e2 = new Employee("ABC");

        System.out.println(e1.equals(e2));
        System.out.println("Hashcode of e1: "+ e1.hashCode());
        System.out.println("Hashcode of e2: "+ e2.hashCode());
    }
}
