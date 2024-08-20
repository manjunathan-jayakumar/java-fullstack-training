package com.programming.class5.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

// Array is mostly used for searching since it is an index based data structure.
// LinkedList is used for all manipulation(CRUD operations) because with LinkedList,
// we can process data in both directions, forward and backward.
public class LinkedListClassAPI {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add(null);

        linkedList.addFirst("7 Sins");
        linkedList.addLast("Dragon Fruit");

        System.out.println("position of 'Banana' is "+ linkedList.indexOf("Banana"));

        System.out.println("Forward Direction ----");
        ListIterator<String> itr = linkedList.listIterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.println("Backward Direction ----");
        while(itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeFirstOccurrence("Apple");
        linkedList.removeLastOccurrence(null);
        String removeAndReturnFirstElement = linkedList.poll();

    }
}
