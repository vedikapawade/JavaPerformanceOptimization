package com.skillpilots.performance;

public class PerformanceOptimization {

    // Slow Method using String Concatenation
    public static String slowMethod() {
        String result = "";

        for (int i = 1; i <= 10000; i++) {
            result = result + i;
        }

        return result;
    }

    // Fast Method using StringBuilder
    public static String fastMethod() {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 10000; i++) {
            result.append(i);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println(" JAVA PERFORMANCE OPTIMIZATION");
        System.out.println("===================================");

        // Slow Method Time
        long start = System.nanoTime();

        slowMethod();

        long end = System.nanoTime();

        long slowTime = end - start;

        // Fast Method Time
        start = System.nanoTime();

        fastMethod();

        end = System.nanoTime();

        long fastTime = end - start;

        System.out.println("\nSlow Method Execution Time");
        System.out.println(slowTime + " ns");

        System.out.println("\nOptimized Method Execution Time");
        System.out.println(fastTime + " ns");

        System.out.println();

        if (fastTime < slowTime) {
            System.out.println("Optimization Successful!");
            System.out.println("StringBuilder performs faster.");
        } else {
            System.out.println("Performance is nearly the same.");
        }
    }
}