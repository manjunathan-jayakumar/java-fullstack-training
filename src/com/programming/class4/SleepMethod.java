package com.programming.class4;

public class SleepMethod extends Thread {

    public static void main(String[] args) {

        SleepMethod t1 = new SleepMethod();
        SleepMethod t2 = new SleepMethod();
        SleepMethod t3 = new SleepMethod();
        t1.start();
        try {
            t1.join();  // holds the main thread until t1 finishes.
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }

    public void run() {
        for(int i= 0; i <= 5; i++){
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
