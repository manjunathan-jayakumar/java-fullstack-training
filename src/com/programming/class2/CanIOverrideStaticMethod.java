package com.programming.class2;

class ParentClass {

    static String lang = "en";

    static void changeLang(String lan){
        lang = lan;
    }
}

public class CanIOverrideStaticMethod extends ParentClass {  // I cannot

//    @Override  // throws error - you should not remove this annotation  to make it work. it defies the purpose.
//    static void changeLang(String lan) {
//        lang = lan + "-new";
//        System.out.println(lang);
//    }

    public static void main(String[] args) {
        CanIOverrideStaticMethod.changeLang("Jap");
        System.out.println(ParentClass.lang);
    }
}


