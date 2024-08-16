package com.programming.class3.Final;

public class FinalKeywordRules {

    //non-static variable
    final String PAN_CARD_NUMBER;

    FinalKeywordRules() {  // This can access final non-static variable
        PAN_CARD_NUMBER = "Illuminati";
    }

    void display() {
        System.out.println("PAN card number is "+ PAN_CARD_NUMBER);
    }

//    static {  // cannot access final non-static variable
//       PAN_CARD_NUMBER = "JAY73467" ;
//    }
    public static void main(String[] args) {
        FinalKeywordRules obj = new FinalKeywordRules();
        obj.display();
    }
}
