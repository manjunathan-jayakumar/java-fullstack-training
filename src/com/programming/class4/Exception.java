package com.programming.class4;

public class Exception {

    public static void main(String[] args) {

        try {
            System.out.println(50/0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("Exception is Handled");
        }
    }
}
