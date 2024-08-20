package com.programming.class4;

public class ThreadCreation extends Thread {
    public static void main(String[] args) {
        ThreadCreation obj = new ThreadCreation();
        Thread t1 = new Thread(obj);
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("Thread got created using Runnable interface");
    }
}
