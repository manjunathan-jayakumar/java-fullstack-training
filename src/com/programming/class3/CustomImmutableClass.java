package com.programming.class3;

import java.util.HashMap;
import java.util.Iterator;

public class CustomImmutableClass {

    private final int id;
    private final String name;

    private final HashMap<String, Integer> hMap;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> gethMap() {
        return (HashMap<String, Integer>) hMap.clone();
    }

    CustomImmutableClass(int id,String name, HashMap<String, Integer> hm) {
        this.id = id;
        this.name = name;

//        making a deepcopy
        HashMap<String, Integer> tempMap = new HashMap<>();
        String key;
        Iterator<String> itr = hm.keySet().iterator();
        while(itr.hasNext()) {
            key = itr.next();
            tempMap.put(key, hm.get(key));
        }
        this.hMap = tempMap;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("ABC", 111);
        hMap.put("ABCD", 112);
        int id = 10;
        String name = "Anil";

        CustomImmutableClass obj = new CustomImmutableClass(id, name, hMap);

        System.out.println("id: "+ obj.id);
        System.out.println("name: "+ obj.name);
        System.out.println("hMap: "+ obj.hMap);

        System.out.println("id: "+ obj.getId());
        System.out.println("name: "+ obj.getName());
        System.out.println("hMap: "+ obj.gethMap());

        // These attrs cannot be changed again.
    }
}
