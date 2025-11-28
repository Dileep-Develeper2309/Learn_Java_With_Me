package com.stopthreadexecution;

public class Yield extends Thread{

    public void run(){
        Thread.yield();
        for(int i=1;i<=5;i++)
            System.out.println("Children");
    }
}
