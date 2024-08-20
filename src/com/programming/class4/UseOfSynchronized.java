package com.programming.class4;

class SharedResource {
    synchronized static void print(int n) {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i * n);
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        SharedResource.print(10);
    }
}

class MyThread2 extends Thread {
    public void run() {
        SharedResource.print(20);
    }
}

public class UseOfSynchronized {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
//        try{
//            t1.join();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
        t2.start();
    }
}
