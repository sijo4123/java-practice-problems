package edu.sijo.practice.problems.concurrency.callable;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable runnable = () -> System.out.println("Printed From Runnable");

        Callable<String> callable = () -> {
            System.out.println("Printed From Callable");
            Thread.sleep(2000);
            return "Printed From callable";
        };

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(runnable);
        Future<String> result = executorService.submit(callable);
        String resp = result.get();
        System.out.println(resp);
    }
}
