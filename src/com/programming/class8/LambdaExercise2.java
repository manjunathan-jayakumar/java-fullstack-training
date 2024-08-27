package com.programming.class8;

// upper bound and lower bound in lambda.

import java.awt.*;

class Shape{
    void draw() {
        System.out.println("Drawing shape...");
    }
}

class rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing rectangle...");
    }
}

class square extends Rectangle {
    void draw() {
        System.out.println("Drawing square...");
    }
}

public class LambdaExercise2 {

}
