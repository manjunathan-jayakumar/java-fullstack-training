package com.programming.class1;

public class SelectionStatement2 {

    public static void main(String[] args) {
        SelectionStatement2 obj = new SelectionStatement2();

        obj.grading('A');
        obj.grading('B');
        obj.grading('C');
        obj.grading('D');
        obj.grading('E');

    }

    void grading(char grade) {
        int success = switch (grade) {
            case 'A', 'B' -> {
                System.out.println(grade + " falls under Excellent Grade Category");
                yield 1;
            }
            case 'C' -> {
                System.out.println(grade + " falls under Very Good Grade Category");
                yield 1;
            }
            case 'D' -> {
                System.out.println(grade + " falls under Good Grade category");
                yield 1;
            }
            case 'E', 'F' -> {
                System.out.println("Reappear for the exam");
                yield -1;
            }
            default -> {
                System.out.println("Unknown scenario");
                yield 0;
            }
        };
        passTheCourse(success);
    }

    static void passTheCourse(int success) {
        switch(success) {
            case 1:
                System.out.println("Passed the course");
                break;
            case -1:
                System.out.println("Couldn't pass the exam");
                break;
            case 0:
                System.out.println("Unknown result");
                break;
        }
    }
}
