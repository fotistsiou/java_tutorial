package fotistsiou.javatutorial.b_java_fundamentals_topics.e_conditionalStatements.problems;

import java.util.Locale;
import java.util.Scanner;

/**
 * Travel Assistant
 * ----------------
 * Write a travel assistant program that:
 * 1. Reads the budget, the tickets fare, the stay charge, the car fee and the number of days.
 * 2. Then, calculates the leftover amount.
 * 3. Prints a comment about leftover amount using "if" statement
 * 4. Prints a comment about travel days using "switch" statement.
 */

public class TravelAssistant {

    public static void main(String[] args) {
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

        if (leftOver > 0) {
            System.out.println("Τhe money left over for the rest of the trip is " + leftOver);
        } else if (leftOver == 0) {
            System.out.println("You have no money left over for the rest of the trip.");
        } else {
            System.out.println("Your budget is less than your travel expenses.");
        }

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
