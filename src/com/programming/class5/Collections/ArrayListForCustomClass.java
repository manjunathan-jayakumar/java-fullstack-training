package com.programming.class5.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListForCustomClass {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book ob1 = new Book(21, "Lord of the Rings", 39.99f);
        Book ob2 = new Book(22, "Hobbit", 34.99f);

        bookList.add(ob1);
        bookList.add(ob1);
        bookList.add(new Book(23, "One Punch Man", 19.99f));
        bookList.add(ob2);

        // Traverse the list
        Iterator<Book> itr = bookList.iterator();
        while(itr.hasNext()) {
            Book b = itr.next();
            System.out.println("id: "+ b.bookId + ", name: "+ b.name+ ", Price: $"+ b.price);
        }
    }
}
