package edu.sijo.practice.problems.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTraversal {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("a", "first");
        testMap.put("b", "second");
        testMap.put("c", "third");

        for ( Map.Entry<String,String> entry : testMap.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}
