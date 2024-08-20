package com.programming.class5;

public class GenericMethod {

    public static void main(String[] args) {

        Integer[] intArr = {11, 22, 33, 44, 55};
        Character[] chArr = {'a', 'b', 'f', 'g', 'r'};

        System.out.println("Print Integer Array");
        printArray(intArr);

        System.out.println("Print Integer Array");
        printArray(chArr);
    }

    // One method catering to all type of data
    static <E> void printArray(E[] elements) {
        for(E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
