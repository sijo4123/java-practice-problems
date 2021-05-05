package edu.sijo.practice.problems.collections;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ListTraversal {
    public static void main(String[] args) {
        List<String> test = Arrays.asList("a", "b", "c");
        //test.stream().forEach(System.out::println);
        test.stream().forEach( ele -> System.out.println(ele));
    }
}
