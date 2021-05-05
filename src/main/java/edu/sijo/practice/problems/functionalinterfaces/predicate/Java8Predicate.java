package edu.sijo.practice.problems.functionalinterfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate {
    private static Object List;

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(greaterThan5(list)); // [6, 7, 8, 9, 10]
        System.out.println(geaterThan5AndLessThan8(list)); // [6, 7, 8, 9, 10]

        List<String> words = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
        System.out.println(startWithAandLength3(words)); // [6, 7, 8, 9, 10]
    }

    private static List<Integer> greaterThan5(List<Integer> list){
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        return list.stream().filter(noGreaterThan5).collect(Collectors.toList());
    }

    private static List<Integer> geaterThan5AndLessThan8(List<Integer> list){
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 8;
        return list.stream()
                .filter(noGreaterThan5.and(noLessThan8))
                .collect(Collectors.toList());
    }

    private static <T extends String> List<T> startWithAandLength3(List<T> list){
        Predicate<T> lengthIs3 = x -> x.length() == 3;
        Predicate<T> startWithA = x -> x.startsWith("A");
        return list.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());
    }
}
