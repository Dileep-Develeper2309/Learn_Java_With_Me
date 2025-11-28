package com.creation;

public class MyOwnThread extends Thread{

    public void run(){
        String startMethodJob = """
                For every Thread the required mandatory activities like registering the Thread with
                Thread Scheduler will takes care by Thread class start() method and programmer is
                responsible just to define the job of the Thread inside run() method.
                That is start() method acts as best assistant to the programmer.
                """;
        String overloadingRun = """
                We can overload run() method but Thread class start() method always invokes no
                argument run() method the other overload run() methods we have to call explicitly then
                only it will be executed just like normal method.
                """;

        String overloadingStartMethod = """
                If we override start() method then our start() method will be executed just like a normal
                method call and no new Thread will be started.
                """;
        System.out.println(startMethodJob);
        System.out.println(overloadingRun);
        System.out.println(overloadingRun);
    }
}
