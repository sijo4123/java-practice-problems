package edu.sijo.practice.problems.design.singleton;

public class Singleton {

        private static volatile Singleton singletonInstance = new Singleton();

        //private constructor.
        private Singleton(){}

        public static Singleton getInstance() {
            return singletonInstance;
        }

}
