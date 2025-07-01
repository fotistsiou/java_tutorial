package fotistsiou.javatutorial.c_logging.c_introduction_to_debugging.examples;

import java.util.Scanner;

public class DebuggingTechniques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assertions
        System.out.println("Enter a number greater than 0: ");
        int positiveNumber = scanner.nextInt();
        assert (positiveNumber > 0) : "Invalid number";
        System.out.println("Your number is" + positiveNumber);

        scanner.close();
    }
}
