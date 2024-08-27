package com.programming.class7;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceAPI {

    public static void main(String[] args) {
        Map<String, String> hMap = new TreeMap<>(); // ordered based on keys
//        Map<String, String> hMap = new Hashtable<>();  // unordered
        hMap.put("A", "B");
        hMap.put("C", "D");
        hMap.put("E", "F"); // No null key is allowed - hashMap

//        System.out.println(hMap.get("C"));

        // iterate
        for(Map.Entry<String, String> hm : hMap.entrySet()) {
            System.out.println(hm.getKey()+ ": "+ hm.getValue());
        }
    }
}
