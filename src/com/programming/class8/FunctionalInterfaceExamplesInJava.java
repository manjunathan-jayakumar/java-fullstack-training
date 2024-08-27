package com.programming.class8;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExamplesInJava {

    public static void main(String[] args) {

        // it has test method
        Predicate<String> obj1 = (s) -> s.length() > 0;
        System.out.println(obj1.test("ABC"));
        System.out.println(obj1.negate().test("ABC"));

        // it has get method
        Supplier<Customer> obj2 = Customer::new;
        Customer obj3 = obj2.get();
        obj3.firstName = "Johnny";
        System.out.println("first name is "+obj3.firstName);
    }
}
