package com.threadpriorities;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.setPriority(10);
        t.start();
        for(int i=0;i<10;i++) {
            System.out.println("main thread");
        }

        String exception = """
                Some operating systems(like windowsXP) may not provide proper support for Thread
                priorities. We have to install separate bats provided by vendor to provide support for
                priorities.
                """;

        System.out.println(exception);
    }
}
