package com.programming.class1;

public class SelectionStatement {
    public static void main(String[] args){
        int number = 15;

        if(number % 2 == 0) {
            System.out.println(number + " is a even number");
        }
        else{
            System.out.println(number + " is a odd number");
        }

        int marks = 85;

        if(marks >= 90 && marks <= 100) {
            System.out.println(marks + " falls under Excellent grade category.");
        }
        else {
            System.out.println(marks + " falls under very good grade category.");
        }
    }

}
