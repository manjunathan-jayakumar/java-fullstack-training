package com.programming.class2;

public class Interval {

    long start, end;

    Interval(long start, long end) {  // Not public
        if (start > end) {
            throw new IllegalArgumentException("'Start' should not be greater than 'end'");
        }

        this.start = start;
        this.end = end;
    }

    long duration() {
        return end - start;
    }

    public static void main(String[] args) {

        Interval obj0 = new Interval(17, 30);
        System.out.println("The duration is "+ obj0.duration());
        Interval obj = new Interval(19, 17);  // This will throw the set exception.
        System.out.println("The duration is "+ obj.duration());
    }
}
