package com.thread;

public class MyThreadCreation {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread);
        t.start();
    }
}
