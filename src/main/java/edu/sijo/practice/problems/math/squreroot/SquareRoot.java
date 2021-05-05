package edu.sijo.practice.problems.math.squreroot;

import java.util.List;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(square(2));;
        System.out.println(squareRoot(9));
    }

    private static <T extends Number> Number square(T w){
        if (w instanceof Double) {
            return (T) w.getClass().cast(w.doubleValue() * w.doubleValue());
        }
        if (w instanceof Long) {
            return (T) w.getClass().cast(w.longValue() * w.longValue());
        }
        if (w instanceof Integer) {
            return (T) w.getClass().cast(w.intValue() * w.intValue());
        }
        return null;
    }

    private static <T extends Number> Number squareRoot(T w){
        if (w instanceof Double) {
            return (T) w.getClass().cast(Math.sqrt(w.doubleValue()));
        }
        if (w instanceof Long) {
            return (T) w.getClass().cast(Math.sqrt(w.longValue()));
        }
        if (w instanceof Integer) {
            return (T) new Double(Math.sqrt(w.intValue()));
        }
        if (w instanceof Integer) {
            return (T) new Double(Math.pow(2, w.intValue()));
        }
        return null;
    }

}
