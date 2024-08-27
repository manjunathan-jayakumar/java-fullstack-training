package com.programming.class8;

@FunctionalInterface
interface Calci {
    double getValue(int a, int b);
}

public class LambdaExercise {
    public static void main(String[] args) {
        Calci addForm = Integer::sum;
        Calci diffForm = (a, b) -> a - b;
        Calci prodForm = (a, b) -> a * b;
        Calci divForm = (a, b) -> (double) a / b;

        System.out.println("2 + 3 = "+ operations(2, 3, addForm));
        System.out.println("2 - 3 = "+ operations(2, 3, diffForm));
        System.out.println("2 * 3 = "+ operations(2, 3, prodForm));
        System.out.println("2 / 3 = "+ operations(2, 3, divForm));

    }

    static double operations(int a, int b, Calci f){
        return f.getValue(a, b);
    }

}

