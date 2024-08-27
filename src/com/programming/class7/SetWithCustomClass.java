package com.programming.class7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetWithCustomClass {

    public static void main(String[] args) {
        Set<Book> hSet = new HashSet<>();

        Book b1 = new Book(1, "kddwafw", 435);
        Book b2 = new Book(2, "jaddgh", 76);
        Book b3 = new Book(3, "jwgdanew", 33);
        Book b4 = new Book(4, "iigmn", 908);

        hSet.add(b2);hSet.add(b1);hSet.add(b4);hSet.add(b3);
        hSet.add(b2);hSet.add(b1);hSet.add(b4);hSet.add(b3);

        Iterator<Book> itr = hSet.iterator();
        while(itr.hasNext()){
            Book b = itr.next();
            System.out.println(b.id+ " "+ b.name+ " "+ b.price);
        }
    }
}
