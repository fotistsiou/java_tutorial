package fotistsiou.javatutorial.b_fundamental_topics.c_variables_dataTypes_typeCasting.problems;

import java.util.Scanner;

/**
 * Calculating Min & Max Integer
 * -----------------------------
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
            // This means an integer uses 32 binary digits (bits) in memory.
            int integerBits = 32;

            // Maximum value of a signed integer is calculated using the formula:
            // 2^(n - 1) - 1
            // Explanation of the formula:
            // -> 2: Binary base (since each bit can have two states, 0 or 1).
            // -> n: Total number of bits (here, 32).
            // -> n - 1: This accounts for the fact that one bit is reserved for the sign (+ or -).
            //           Only 31 bits remain for the magnitude of the number.
            // -> -1: Subtract 1 because all zeros in binary represent 0,
            //        and all ones represent the largest number in that range.
            // Example for 32 bits:
            // -> 2^(32 - 1) - 1 = 2^31 - 1 = 2,147,483,647 (maximum positive value).
            int maxInt = (int) (Math.pow(2, (integerBits - 1)) - 1);

            // Minimum value of a signed integer is calculated using the formula:
            // -2^(n - 1)
            // Explanation of the formula:
            // -> 2: Binary base (since each bit can have two states, 0 or 1).
            // -> n: Total number of bits (here, 32).
            // -> n - 1: This accounts for the fact that one bit is reserved for the sign (+ or -).
            //           Only 31 bits remain for the magnitude of the number.
            // -> -: The negative sign is because the smallest value in a signed integer is negative,
            //       and its absolute value is larger than the positive maximum by 1.
            // Example for 32 bits:
            // -> -2^(32 - 1) = -2^31 = -2,147,483,648 (minimum negative value).
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

