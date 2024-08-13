package com.programming.class1;
// abstract class is like interface, but it can also hold definition in addition to declaration

// abstract keyword signifies a abstract class.
abstract class Shape {

    abstract void calculateArea(double radius);  // these declaration needs to be defined in subclass
    double area, radius;

    void purpose() {
        System.out.println("This Calculates the area of different Mathematical shapes.");
    }
}

class Circle extends Shape {  // in java, a class can extend only one class at a time

    @Override  // Best practices
    void calculateArea(double radius) {
        area = Math.PI * radius * radius;
        System.out.println("Area of circle is "+ area+ " Units");
        purpose();
    }
}

class Triangle extends Shape {
    @Override
    void calculateArea(double base) {
        area = (base * 200)/2; // height 200 default
        System.out.println("Default Area of triangle is "+ area);
    }

    // above method is to satisfy abstract declaration. below uses polymorphism to overload above method.
    void calculateArea(double base, double height) {
        area = (base * height)/2;
        System.out.println("Overloaded Area of triangle is "+ area);
    }


}

public class UnderstandAbstractClass {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.calculateArea(33);

        Triangle obj2 = new Triangle();
        obj2.calculateArea(12);
        obj2.calculateArea(12, 20);
    }
}
