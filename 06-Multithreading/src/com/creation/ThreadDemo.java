package com.creation;

public class ThreadDemo {
    public static void main(String[] args) {
        String creation = """
                -> One of the way to create thread is to extend the Thread.
                -> By extending the Thread class we have to override the run method.
                """;

        MyThread t = new MyThread();
        t.start();   // starts a NEW thread

        //t.run -> no new thread will be created and it will run like normal method.

        for (int i = 0; i <= 10; i++)
            System.out.println("Main Thread");
    }
}
