package edu.sijo.practice.problems.math.fibonacci;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciStream {

    public static void main(String[] args) {
        List<Integer> fibonacci = getFibonacci(10);
        fibonacci.forEach(x -> System.out.println(x));
        String fibonacciString = getFibonacciBigInteger(50);
        System.out.println(fibonacciString);
    }

    public static String getFibonacciString(int series) {
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(series)
                .map(n -> n[0])
                .map(String::valueOf) // convert to string
                .collect(Collectors.joining(", "));
    }

    public static String getFibonacciBigInteger(int series) {
        return Stream.iterate(new BigInteger[] {BigInteger.ZERO, BigInteger.ONE},
                t -> new BigInteger[] {t[1], t[0].add(t[1])})
                .limit(50)
                .map( t -> t[0])
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static List<Integer> getFibonacci(int series) {
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(series)
                .map(n -> n[0])
                .collect(Collectors.toList());
    }
}
