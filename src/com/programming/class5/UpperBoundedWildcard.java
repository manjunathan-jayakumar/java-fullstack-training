package com.programming.class5;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Triangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Square extends Rectangle {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class UpperBoundedWildcard {

    // ? extends - is how we set the upper limit to restrict the scope of data.
    static void drawShapes(List<? extends Shape> shapeData) {  // upper bound by Shape
        for(Shape s: shapeData) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Shape> listShape = new ArrayList<>();
        listShape.add(new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing Shape");
            }
        });

        List<Circle> listCircle = new ArrayList<>();  // immediate child
        listCircle.add(new Circle());
        listCircle.add(new Circle());

        List<Square> listSquare = new ArrayList<>();  // level 2 child
        listSquare.add(new Square());
        listSquare.add(new Square());

        System.out.println("Printing Shapes");
        drawShapes(listShape);

        System.out.println("Printing Circles");
        drawShapes(listCircle);

        System.out.println("Printing Square");
        drawShapes(listSquare);

    }
}
