package fotistsiou.javatutorial.fundamentals.m_exceptionHandling;

import java.util.Scanner;

/**
 * Exception Handling
 * -> Try - Catch - Finally
 *    - The 'try' statement allows you to define a block of code to be tested for errors while it is being executed.
 *    - The 'catch' statement allows you to define a block of code to be executed, if an error occurs in the try block.
 *    - The 'finally' statement lets you execute code, after try...catch, regardless of the result
 * -> Throw
 *    - The throw statement allows you to create a custom error.
 *    - The throw statement is used together with an exception type.
 */

public class ExceptionHandling {
    public static void main(String[] args) {
        // Try - Catch - Finally
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage() + ".");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        // Throw
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
