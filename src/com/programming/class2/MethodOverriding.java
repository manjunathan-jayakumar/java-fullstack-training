package com.programming.class2;
// Runtime Polymorphism

class Bank {
    float rateOfInterest() {
        return 7.5f;
    }
}

class Axis extends Bank {

    @Override
    float rateOfInterest() {
        return 7.0f;
    }
}

class SBI extends Bank {
    @Override
    float rateOfInterest() {
        return 6.8f;
    }
}
public class MethodOverriding {

    public static void main(String[] args) {
        Bank obj = new Bank();
        System.out.println("RoI of Bank: "+ obj.rateOfInterest());
        Axis obj2 = new Axis();
        System.out.println("RoI of Axis Bank: "+ obj2.rateOfInterest());
        SBI obj3 = new SBI();
        System.out.println("RoI of SBI Bank: "+ obj3.rateOfInterest());

    }
}
