package com.programming.class3;

class Machine {
    void start() {
        System.out.println("Machine Started...");
    }
    void stop() {
        System.out.println("Machine stopped...");
    }
}

class Camera extends Machine {

    @Override
    void start() {
        System.out.println("Camera started...");
    }

    void snap() {
        System.out.println("Photo clicked!");
    }
}

public class CastingExample {

    public static void main(String[] args) {
        Machine m = new Machine();
        m.start(); m.stop();
        System.out.println();

        Camera c = new Camera();
        c.start(); c.snap(); c.stop();
        System.out.println();

        // Upcasting happens automatically in Java
        Machine m2 = c;
        m2.start(); m2.stop();  // m2.snap();  --> won't work
        System.out.println();

        // Down-casting is only possible where relationship is mentioned in the object creation.
        Machine m3 = new Camera();
        Camera c1 = (Camera)m3;
        c1.start(); c1.snap(); c1.stop();
    }
}
