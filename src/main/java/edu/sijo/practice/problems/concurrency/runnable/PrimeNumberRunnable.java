package edu.sijo.practice.problems.concurrency.runnable;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimeNumberRunnable {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n I can tell you the nth Prime Number. Enter n:");
            int n = scanner.nextInt();
            if (n == 0) break;
            Runnable runnable = () -> {
               int nthPrimeNumber = calculateNthPrimeNumbner(n);
               System.out.println("\n Result:");
               System.out.println("\n Value of "+n+" th prime "+ nthPrimeNumber);
            };
            ExecutorService executorService = Executors.newFixedThreadPool(1);
            executorService.submit(runnable);
            break;
        }
    }

    private static int calculateNthPrimeNumbner(int n) {
        int candidate, count;
        for(candidate = 2, count = 0; count < n; ++candidate) {
            if (isPrime(candidate)) {
                ++count;
            }
        }
        // The candidate has been incremented once after the count reached n
        return candidate-1;
    }

    private static boolean isPrime(int n) {
        for(int i = 2; i < n; ++i) {
            if (n % i == 0) {
                // We are naive, but not stupid, if
                // the number has a divisor other
                // than 1 or itself, we return immediately.
                return false;
            }
        }
        return true;
    }
}
