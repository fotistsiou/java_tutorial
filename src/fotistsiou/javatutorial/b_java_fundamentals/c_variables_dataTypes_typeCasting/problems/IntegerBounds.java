package fotistsiou.javatutorial.b_java_fundamentals.c_variables_dataTypes_typeCasting.problems;

import java.util.Scanner;

/**
 * Calculating Min & Max Int
 * -------------------------
 * 1. Write the formula for calculating the upper (max) possible value of an int variable.
 * 2. Write the formula for calculating the lower (min) possible value of an int variable.
 */

public class IntegerBounds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String input = scanner.nextLine();

        try {
            // Parse the input string to an integer
            int inputInt = Integer.parseInt(input);

            // Typically, integers are stored as 4 bytes (32 bits).
            int integerBits = 32;
            // Maximum signed int value: 2^(31) - 1 = +2147483647
            int maxInt = (int) (Math.pow(2, (integerBits - 1)) - 1); // Removed Math.round (it's redundant here)
            // Minimum signed int value: -(2^31) = -2147483648
            int minInt = (int) -Math.pow(2, (integerBits - 1));

            // Check the input against bounds
            if (inputInt == maxInt) {
                System.out.println("Max Integer: " + inputInt);
            } else if (inputInt == minInt) {
                System.out.println("Min Integer: " + inputInt);
            } else {
                System.out.println("Integer between INT_MIN (" + minInt + ") and INT_MAX (" + maxInt + "): " + inputInt);
            }
        } catch (NumberFormatException e) {
            // Handle invalid input
            System.out.println("Out of bounds integer value.");
        }
    }
}

