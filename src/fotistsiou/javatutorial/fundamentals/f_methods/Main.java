package fotistsiou.javatutorial.fundamentals.f_methods;

import java.util.Scanner;

public class Main {
    /* Methods */
    // Calculation of Fibonacci Number
    // 1st way - Fibonacci Number Using recursion in Java (Slow)
    // 2nd way - Fibonacci Number Using Memoization in Java (Quick)


    // 2nd way - 1st step
    public static long[] fibonacciCache;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you want to know its Fibonacci number:");
        int n = scanner.nextInt();

        // 2nd way - 2nd step
        fibonacciCache = new long[n + 1];

        // 1st way - Print Fibonacci Number
        System.out.println("Fibonacci of Number " + n + " with Recursion: " + fibonacciRecursion(n));
        // Print Fibonacci Series
        // for (int i = 1; i <= n; i++) {
        //     System.out.print(fibonacciRecursion(i) + " ");
        // }

        // 2nd way - Print Fibonacci Number
        System.out.println("Fibonacci of Number " + n + " with Memoization: " + fibonacciMemoization(n));

        scanner.close();
    }

    // 1st way - 1st step
    public static long fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return (fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2));
    }

    // 2nd way - 3rd step
    public static long fibonacciMemoization(int n) {
        if (n <= 1) {
            return n;
        }
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }
        long nthFibonacciNumber = fibonacciMemoization(n - 1) + fibonacciMemoization(n - 2);
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
