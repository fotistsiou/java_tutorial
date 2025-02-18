package fotistsiou.javatutorial.b_java_fundamentals.m_exceptions_bugs.examples;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }

        // Control Statement
        System.out.println("Enter a number: ");
        String input = scanner.nextLine();
        if (input.matches("\\d+")) {
            int number = Integer.parseInt(input);
            System.out.println("Your number is" + number);
        } else {
            System.out.println("Invalid number: " + input);
        }

        // Assertions
        System.out.println("Enter a number greater than 0: ");
        int positiveNumber = scanner.nextInt();
        assert (positiveNumber > 0) : "Invalid number";
        System.out.println("Your number is" + positiveNumber);

        scanner.close();
    }
}
