package com.creation;

public class RunnableThread {
    public static void main(String[] args) {
        MyRunnableThread r = new MyRunnableThread();
        Thread t = new Thread(r);
        Thread t1=new Thread();

        //t.start();
        t1.start();
        for(int i = 0;i<10;i++)
            System.out.println("I am main Thread");
    }
}
