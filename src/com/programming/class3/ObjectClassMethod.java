package com.programming.class3;

public class ObjectClassMethod {

    public static void main(String[] args) {

        String str1 = "ABC";
        String str2 = "ABC";
        System.out.println("String literals");

        if(str1 == str2){
            System.out.println("== works");
        }
        else {
            System.out.println("== doesn't work");
        }

        if(str1.equals(str2)){
            System.out.println("equals() works");
        }
        else {
            System.out.println("equals() doesn't work");
        }
        System.out.println();

        String str3 = new String("ABC");
        String str4 = new String("ABC");
        System.out.println("String objects");

        if(str3 == str4){
            System.out.println("== works");
        }
        else {
            System.out.println("== doesn't work");
        }

        if(str3.equals(str4)){
            System.out.println("equals() works");
        }
        else {
            System.out.println("equals() doesn't work");
        }
    }
}
