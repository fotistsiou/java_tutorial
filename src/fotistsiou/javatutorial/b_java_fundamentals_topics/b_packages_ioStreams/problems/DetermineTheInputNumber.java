package fotistsiou.javatutorial.b_java_fundamentals_topics.b_packages_ioStreams.problems;

import java.util.Scanner;

/**
 * Determine the type of the input number
 * --------------------------------------
 * You are given a number as the input.
 * Your task is to determine whether it is a positive integer, negative integer, zero or a non-integer.
 * 1. If the integer is positive, print 'positive'.
 * 2. If it is negative, print 'negative'.
 * 3. If the integer is zero, print 'zero'.
 * 4. If it is a non-integer, print 'non-integer'.
 */

public class DetermineTheInputNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                System.out.println("positive");
            } else if (n < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        } else {
            System.out.println("non-integer");
        }

        scanner.close();
    }
}
