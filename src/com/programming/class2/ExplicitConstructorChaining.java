package com.programming.class2;

public class ExplicitConstructorChaining {

    int data;

    ExplicitConstructorChaining() {  //con1
        this(123);  // calls con2
        this.data = 404;
        System.out.println("No parameter constructor - "+ this.data);
    }

    ExplicitConstructorChaining(int i) {  // con2
        this("ABC");  // calls con3
        System.out.println("2 parameter - "+ i);
    }

    ExplicitConstructorChaining(String str) {  // con3
        System.out.println("3 Parameter - "+ str);
    }

    public static void main(String[] args) {
        ExplicitConstructorChaining obj = new ExplicitConstructorChaining();  // This will call con1
    }
}
