package fotistsiou.javatutorial.b_java_fundamentals_topics.c_variables_dataTypes_typeCasting.problems;

import java.util.Scanner;

/**
 * Ghostly access in the mansion of code
 * ---------------------------------------
 * You are an indie java game developer looking to capitalize on the upcoming Halloween hype.
 * For your game, you're designing a HauntedMansion class with various room types.
 * Which combination of access modifiers would be most appropriate for the following elements?
 * 1. The HauntedMansion class itself
 * 2. A GhostRoom inner class used only within HauntedMansion
 * 3. A method to add new rooms, used by other classes
 * 4. A list storing all rooms, accessed only within HauntedMansion
 * ---------------------------------------
 * Select one option from the list:
 * a. public, private, public, private
 * b. public, protected, public, package-private
 * c. public, private, private, protected
 * d. package-private, private, public, private
 * e. package-private, public, public, private
 */

public class GhostlyAccess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a character from 'a' to 'e':");
            String input = scanner.next();
            char answer = input.charAt(0);

            switch (answer) {
                case 'a':
                    System.out.println("Correct Answer!");
                    scanner.close();
                    return;
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                    System.out.println("Wrong answer. Try again!");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a character from 'a' to 'e'.");
            }
        }
    }
}
