package fotistsiou.javatutorial.b_fundamental_topics.b_packages_ioStreams.problems;

import java.util.Scanner;

/**
 * Coordinate Input Validation
 * ---------------------------
 * Write a Java program that prompts the user to enter coordinates on an x-y plane, using integer values.
 * The program should read two integers (representing xAxis and yAxis), check if they are valid integer inputs,
 * and only proceed when both inputs are integers. If the input is invalid (e.g., a letter or symbol),
 * the program should prompt the user to enter numbers again.
 * ---------------------------
 * Requirements
 * 1. Prompt for Input: The program should ask the user to enter values for xAxis and yAxis.
 * 2. Validate Input: Ensure that both xAxis and yAxis are integers.
 *    If the user enters a non-integer, display a message: "You should enter numbers!"
 * 3. Loop Until Valid Input: Use a while loop to continue prompting the user until both xAxis and yAxis are valid integers.
 * 4. Display Coordinates: Once valid input is received for both xAxis and yAxis, display them in the format:
 *    Coordinates entered: xAxis yAxis
 */

public class CoordinateInputValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to make a move & analyze user input
        int xAxis = 0, yAxis = 0;

        while (true) {
            System.out.print("Enter x-axis and y-axis values: ");
            if (scanner.hasNextInt()) {
                xAxis = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    yAxis = scanner.nextInt();
                    break; // Exit the loop if both inputs are valid integers
                } else {
                    System.out.println("You should enter numbers!");
                    scanner.nextLine(); // Clear the invalid input
                }
            } else {
                System.out.println("You should enter numbers!");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        System.out.println("Coordinates entered: " + xAxis + " " + yAxis);
        scanner.close();
    }
}
