package fotistsiou.javatutorial.fundamentals.i_methods;

import java.util.Scanner;

public class Methods {
    /* Methods */

    // Calculation of Fibonacci Number
    // 1st way - Fibonacci Number Using Recursion (Slow)
    // 2nd way - Fibonacci Number Using Memoization (Quick)

    // 2nd way - 1st step
    public static long[] fibonacciCache;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you want to know its Fibonacci number:");
        int n = scanner.nextInt();

        // 2nd way - 2nd step
        fibonacciCache = new long[n + 1];

        // 1st way - Print Fibonacci Number
        System.out.println("----- Fibonacci Number Using Recursion -----");
        long startTimeRecursion = System.nanoTime();
        System.out.println("The Fibonacci Number of the number " + n + " is: " + fibonacciRecursion(n));
        long endTimeRecursion = System.nanoTime();
        double durationRecursion = (endTimeRecursion - startTimeRecursion) / 1_000_000_000.0;
        System.out.println("The calculation of Fibonacci Number took: " + String.format("%.7f", durationRecursion) + " seconds.");
        // 1st way - Print Fibonacci Sequence
        System.out.print("Fibonacci sequence up to F(" + n + "): ");
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                System.out.println(fibonacciRecursion(i) + ".");
            } else {
                System.out.print(fibonacciRecursion(i) + " ");
            }

        }

        // 2nd way - Print Fibonacci Number
        System.out.println("----- Fibonacci Number Using Memoization -----");
        long startTimeMemoization = System.nanoTime();
        System.out.println("The Fibonacci Number of the number " + n + " is: " + fibonacciMemoization(n));
        long endTimeMemoization = System.nanoTime();
        double durationMemoization = (endTimeMemoization - startTimeMemoization) / 1_000_000_000.0;
        System.out.println("The calculation of Fibonacci Number took: " + String.format("%.7f", durationMemoization) + " seconds.");
        // 2nd way - Print Fibonacci Sequence
        System.out.print("Fibonacci sequence up to F(" + n + "): ");
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                System.out.println(fibonacciMemoization(i) + ".");
            } else {
                System.out.print(fibonacciMemoization(i) + " ");
            }
        }

        scanner.close();
    }

    // 1st way - 1st step
    public static long fibonacciRecursion(int n) {
        if (n <= 1) {
            return n; // Base case: F(0) = 0, F(1) = 1
        }
        // Recursive call without memoization
        return (fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2));
    }

    // 2nd way - 3rd step
    public static long fibonacciMemoization(int n) {
        if (n <= 1) {
            return n; // Base case: F(0) = 0, F(1) = 1
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n]; // Return cached value if it exists
        }

        // Recursive call with memoization
        long nthFibonacciNumber = fibonacciMemoization(n - 1) + fibonacciMemoization(n - 2);
        fibonacciCache[n] = nthFibonacciNumber; // Cache the result

        return nthFibonacciNumber;
    }
}
