package com.programming.class1;

class Machine {

    void start() {
        System.out.println("Machine Started..");
    }

    void stop() {
        System.out.println("Machine Stoped..");
    }
}

class Camera extends Machine {

    @Override
    void start() {
        System.out.println("Camera started..");
    }

    void snap() {
        System.out.println("Photo Clicked!");
    }
}

public class WhatIsInheritance {

    public static void main(String[] args) {
        Machine m = new Machine();
        m.start();
        m.stop();
        System.out.println();

        Camera c = new Camera();
        c.start();
        c.stop();
        c.snap();
        System.out.println();

        Machine m2 = new Camera();
        /*
        This instantiation creates Machine object with overridden methods of Machine in Camera.
        But not the extra functions in child.
         */
        m2.start();
        m2.stop();
//        m2.snap(); // --> Not accessible (try uncommenting this)
    }
}
