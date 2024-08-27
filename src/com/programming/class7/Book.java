package com.programming.class7;

public class Book implements Comparable<Book>{

    int id;
    String name;
    int price;

    Book(int id, String name, int price)  {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(id, o.id);
    }
}
