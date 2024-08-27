package com.programming.class8;

interface Circle {
    double getProperty(double radius);
}

public class LambdaExpressionUse3 {
    public static void main(String[] args) {
        Circle areaFormula = (r) -> Math.PI * r * r;
        Circle circumferenceFormula = (r) -> 2 * Math.PI * r;

        double area = circleOperations(10, areaFormula);
        double circumference = circleOperations(11.23, circumferenceFormula);

        System.out.println("area when r = 10 is "+ area);
        System.out.println("Circumference when r = 11.23 is "+ circumference);

    }

    static double circleOperations(double radius, Circle c) {
        return c.getProperty(radius);
    }
}
