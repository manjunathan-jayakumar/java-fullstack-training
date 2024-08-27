package com.programming.class7;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapWithCustomClass {

    public static void main(String[] args) {
        Map<String, Book> hMap = new TreeMap<>();

        Book b1 = new Book(1, "kddwafw", 435);
        Book b2 = new Book(2, "jaddgh", 76);
        Book b3 = new Book(3, "jwgdanew", 33);
        Book b4 = new Book(4, "iigmn", 908);

        hMap.put("B", b1);
        hMap.put("A", b3);
        hMap.put("C", b4);
        hMap.put("D", b2);

        for(Map.Entry<String, Book> hm : hMap.entrySet()) {
            String key = hm.getKey();
            Book b = hm.getValue();

            System.out.println(key+ " - "+ b.id+"::"+b.name);
        }

    }
}
