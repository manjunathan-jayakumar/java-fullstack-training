package com.programming.class2;

// current program proves `this` keyword is `objName`
public class HowThisKeywordWorks {

    void display() {
        System.out.println("this is "+ this);
    }

    public static void main(String[] args) {
        HowThisKeywordWorks obj1 = new HowThisKeywordWorks();
        System.out.println("Obj1 is "+ obj1);
        obj1.display();

        System.out.println();

        HowThisKeywordWorks obj2 = new HowThisKeywordWorks();
        System.out.println("Obj1 is "+ obj2);
        obj2.display();
    }
}
