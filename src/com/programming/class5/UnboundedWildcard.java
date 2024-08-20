package com.programming.class5;

import java.util.*;

public class UnboundedWildcard {

    public static void main(String[] args) {

        UnboundedWildcard obj = new UnboundedWildcard();
        List<String> strList = new ArrayList<>();
        strList.add("ABC");
        obj.printCollection(strList);
        List<Integer> intList = new ArrayList<>();
        intList.add(123);
        obj.printCollection(intList);
        Set<String> hSet = new HashSet<>();
        hSet.add("ABC");
        obj.printCollection(hSet);
    }

    void printCollection(Collection<?> objs) {
        for(Object obj : objs) {
            System.out.println(obj.getClass().getCanonicalName()+ ":"+ obj);
        }

    }
}
