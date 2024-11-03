package fotistsiou.javatutorial.fundamentals.e_operators.problems;

/**
 * Increment & Decrement Operators
 * -------------------------------
 * Find the values of the variables in each statement and then print the result:
 * 1. int a = 4;
 * 2. int b = a++;
 * 3. int c = --a + b++;
 * 4. int result = ++a - (c++ - b) + c;
 */

public class IncrementDecrementOperators {

    public static void main(String[] args) {
        int a = 4; // Current Statement: a == 4
        int b = a++; // Current Statement: a == 5, b == 4
        int c = --a + b++; // Current Statement: a == 4, b == 5, c == 8, Calculation: c = 4 + 4 = 8
        int result = ++a - (c++ - b) + c; // Current Statement: a == 5, b == 5, c == 9, Calculation: result = 5 - (8 - 5) + 9 = 11
        System.out.println("The result is " + result);
    }
}
