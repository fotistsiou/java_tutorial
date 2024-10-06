package fotistsiou.javatutorial.fundamentals.f_conditionalStatements;

import java.util.Locale;
import java.util.Scanner;

/* Conditional Statements */
// Java has the following conditional statements:
// - Use if to specify a block of code to be executed, if a specified condition is true
// - Use else to specify a block of code to be executed, if the same condition is false
// - Use else if to specify a new condition to test, if the first condition is false
// - Use switch to specify many alternative blocks of code to be executed

public class ConditionalStatements {

    public static void main(String[] args) {
        // Write a travel assistant program that:
        // - Reads the budget, the tickets fare, the stay charge, the car fee and the number of days.
        // - Then, calculates the leftover amount.
        // - Finally, prints a comment about leftover amount and another comment about travel days.

        Scanner scanner = new Scanner(System.in);
        Locale systemLocale = Locale.getDefault(); // Configure "Scanner" to use system's default locale format (for double separators).
        scanner.useLocale(systemLocale);

        System.out.println(("Enter your budget:"));
        double budget = scanner.nextDouble();
        System.out.println(("Enter the tickets fare:"));
        double ticketsFare = scanner.nextDouble();
        System.out.println("Enter the charge for your stay:");
        double stayCharge = scanner.nextDouble();
        System.out.println("Enter the car rental fee:");
        double carFee = scanner.nextDouble();
        System.out.println("Enter the number of days of your travel:");
        int numOfDays = scanner.nextInt();

        double totalOfExpenses = ticketsFare + stayCharge + carFee;
        double leftOver = budget - totalOfExpenses;

        System.out.println("Your budget: " + budget);
        System.out.println("The total of expenses: " + totalOfExpenses);

        // If Statement
        if (leftOver > 0) {
            System.out.println("Τhe money left over for the rest of the trip is " + leftOver);
        } else if (leftOver == 0) {
            System.out.println("You have no money left over for the rest of the trip.");
        } else {
            System.out.println("Your budget is less than your travel expenses.");
        }

        // Switch Statement
        switch (numOfDays) {
            case 1:
                System.out.println("Your travel is " + numOfDays + " day, so it is short.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Your travel is " + numOfDays + " days, so it is short.");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Your travel is " + numOfDays + " days, so it is neither short nor far.");
                break;
            default:
                System.out.println("Your travel is " + numOfDays + " days, so it is far.");
        }

        scanner.close();
    }
}
