package fotistsiou.javatutorial.b_java_fundamentals.e_conditionalStatements;

import java.util.Scanner;

/**
 * Conditional Statements
 * -> Java has the following conditional statements:
 *    - Use if to specify a block of code to be executed, if a specified condition is true.
 *    - Use else to specify a block of code to be executed, if the same condition is false.
 *    - Use else if to specify a new condition to test, if the first condition is false.
 *    - Use switch to specify many alternative blocks of code to be executed.
 * */

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The single if case
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age > 100) {
            System.out.println("Very experienced person");
        }

        // The if-else case
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("It's an even number");
        } else {
            System.out.println("It's an odd number");
        }

        // The if-else-if case
        System.out.println("Enter an amount: ");
        long dollars = scanner.nextLong();
        if (dollars < 1000) {
            System.out.println("Buy a laptop");
        } else if (dollars < 2000) {
            System.out.println("Buy a personal computer");
        } else if (dollars < 100_000) {
            System.out.println("Buy a server");
        } else {
            System.out.println("Buy a data center or a quantum computer");
        }

        // The switch case
        System.out.println("Enter the number of current day: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        scanner.close();
    }
}
