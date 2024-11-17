package fotistsiou.javatutorial.b_java_fundamentals.m_exceptionHandling;

import java.util.Scanner;

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
