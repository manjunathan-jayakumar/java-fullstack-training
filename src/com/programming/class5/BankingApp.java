package com.programming.class5;

public class BankingApp {

    public static void main(String[] args) {
        Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            };
        }.start();

        new Thread() {
            public void run() {
                c.deposit(10000);
            };
        }.start();
    }
}

class Customer {
    // starting amount
    int amt = 10000;

    synchronized void withdraw(int amt) {
        System.out.println("About to withdraw: $"+ amt);
        if(amt > this.amt) {
            System.out.println("Insufficient balance, waiting for deposit...");
            try {
                wait();  // makes current thread halt.
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        this.amt -= amt;
        System.out.println("Successfully withdrawn, Your balance is $"+ this.amt);
    }

    synchronized void deposit(int amt) {
        System.out.println("About to deposit: $"+ amt);
        this.amt += amt;
        System.out.println("Successfully deposited, your current balance is $"+ this.amt);
        notify();  // notifies halted thread to resume
    }
}