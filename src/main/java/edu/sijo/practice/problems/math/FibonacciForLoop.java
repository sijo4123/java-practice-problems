package edu.sijo.practice.problems.math;

public class FibonacciForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(fibonacciInt(i));
        }
    }

    private static int fibonacciInt(int n) {
        if ( n <= 1) return n;
        int prev = 0, next = 1, sum;

        for (int i=2; i <= n; i++){
            sum = prev;
            prev = next;
            next = sum + prev;
        }
        return next;
    }

}

