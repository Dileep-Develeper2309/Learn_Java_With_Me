package com.stopthreadexecution;

public class HowToStop {
    public static void main(String[] args) {

        String howToStop = """
                We can prevent(stop) a Thread execution by using the following methods.
                1. yield();
                2. join();
                3. sleep();
                """;

        String Yield = """
                yield():
                1. yield() method causes "to pause current executing Thread for giving the chance
                of remaining waiting Threads of same priority".
                2. If all waiting Threads have the low priority or if there is no waiting Threads then
                the same Thread will be continued its execution.
                3. If several waiting Threads with same priority available then we can't expect
                exact which Thread will get chance for execution.
                4. The Thread which is yielded when it get chance once again for execution is
                depends on mercy of the Thread scheduler.
                5. public static native void yield();
                """;

        String Join = """
             -> If a Thread wants to wait until completing some other Thread then we should go for
                join() method.
                Example: If a Thread t1 executes t2.join() then t1 should go for waiting state until
                completing t2.
                Every join() method throws InterruptedException, which is checked exception hence
                compulsory we should handle either by try catch or by throws keyword.
                Otherwise we will get compiletime error.
                """;

        String Sleep = """
                If a Thread don't want to perform any operation for a particular amount of time then
                we should go for sleep() method.
                """;

        System.out.println(howToStop);
        System.out.println(Yield);
        System.out.println(Join);
        System.out.println(Sleep);
    }
}
