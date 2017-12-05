/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360sandbox;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author reyob
 */
class threadingtheneadle2 {
    public static void main(String[] args) {}
    
    static Callable<String> callable(String result, long sleepSeconds) {
    return () -> {
        TimeUnit.SECONDS.sleep(sleepSeconds);
        return result;
    };
}
    
    static void exampleofexecutors() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        double number = floor(random() * 10);
        long blue = (long) number;
        number = floor(random() * 10);
        long yellow = (long) number;
        number = floor(random() * 10);
        long red = (long) number;
        List<Callable<String>> callables = Arrays.asList(
            callable("blue", blue),
            callable("yellow", yellow),
            callable("red", red));

        String result = executor.invokeAny(callables);
        System.out.println("Fastest collor today: " + result + "!\n");
       
        executor.shutdownNow();
        
        ScheduledExecutorService executor2 = Executors.newScheduledThreadPool(2);
        
        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
        int initialDelay = 0;
        int period = 1;
        executor2.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);
        
        Runnable task2 = () -> System.out.println("How long will this go on?");
        int initialDelay2 = 1;
        executor2.scheduleAtFixedRate(task2, initialDelay2, period, TimeUnit.SECONDS);
        
        try {
            System.out.println("attempt to shutdown executor");
            /*I set the wait time for termination to an unusually large time so that 
            previous threads could execute mulitple times for effect*/
            executor2.awaitTermination(15, TimeUnit.SECONDS);
            executor2.shutdown();
        }
        catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        }
        finally {
            if (!executor2.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor2.shutdownNow();
            System.out.println("shutdown finished");
        }
        
    }
    
}
