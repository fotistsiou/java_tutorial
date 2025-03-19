package fotistsiou.javatutorial.b_java_fundamentals_topics.e_conditionalStatements.problems;

import java.util.Scanner;

/**
 * Result of operations
 * --------------------
 * Given two initialized variables:
 * 1. int var1 = 100;
 * 2. int var2 = 0;
 * What is a value of var2 after executing the following code?
 * switch (var1) {
 *     case 100:
 *         var2 += var1;
 *     case 200:
 *         var2 += var1 / 4;
 *         break;
 *     case 300:
 *         var2 += var1 / 10;
 *         break;
 * }
 */

public class ResultOfOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 125) {
                break;
            }
            System.out.println("Try again:");
            scanner.nextLine();
        }
        System.out.println("Correct!");
        scanner.close();
    }
}
