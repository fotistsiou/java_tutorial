package fotistsiou.javatutorial.fundamentals.d_operators.problems;

import java.util.Scanner;

/**
 * Comparing strings
 * ---------------------------------------
 * Fill in the gaps in the following statement:
 * The (1) ____ compares the characters inside a string object whereas (2) ____ compares two objects references
 * to see whether they refer to the same instance.
 * ---------------------------------------
 * Select one option from the list:
 * a. (1) == operator, (2) equals( ) method
 * b. (1) equals( ) method, (2) == operator
 * c. (1) equals( ) method, (2) === operator
 * d. (1) == operator, (2) compare( ) method
 */

public class ComparingStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a character from 'a' to 'd':");
            String input = scanner.next();
            char answer = input.charAt(0);

            switch (answer) {
                case 'b':
                    System.out.println("Correct Answer!");
                    scanner.close();
                    return;
                case 'a':
                case 'c':
                case 'd':
                    System.out.println("Wrong answer. Try again!");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a character from 'a' to 'd'.");
            }
        }
    }
}
