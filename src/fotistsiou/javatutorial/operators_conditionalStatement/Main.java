package fotistsiou.javatutorial.operators_conditionalStatement;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Operators */

        // The most common groups of Java operators are the following:
        // - Arithmetic operators: +, -, *, /, %, ++, --
        // - Assignment operators: =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
        // - Comparison operators: ==, !=, >, <, >=, <=
        // - Logical operators: &&, ||, !

        Scanner scanner = new Scanner(System.in);
        // Configure "Scanner" to use system's default locale format (for double separators).
        Locale systemLocale = Locale.getDefault();
        scanner.useLocale(systemLocale);

        System.out.println("Calculate your travel expenses!");
        System.out.println("Enter the number of people of your travel:");
        int numOfPeople = scanner.nextInt();
        System.out.println(("Enter your budget:"));
        double budget = scanner.nextDouble();
        System.out.println(("Enter the tickets fare:"));
        double ticketsFare = scanner.nextDouble();
        System.out.println("Enter the charge for your stay:");
        double stayCharge = scanner.nextDouble();
        System.out.println("Enter the car rental fee:");
        double carFee = scanner.nextDouble();

        double totalOfExpenses = ticketsFare + stayCharge + carFee;
        double costPerPerson = totalOfExpenses / numOfPeople;
        double leftOver = budget - totalOfExpenses;

        System.out.println("The total of expenses is " + totalOfExpenses);
        System.out.println("The cost per person is " + costPerPerson);

        /* Conditional Statements */

        // If Statement
        if (leftOver > 0) {
            System.out.println("Τhe money left over for the rest of the trip is " + leftOver);
        } else if (leftOver == 0) {
            System.out.println("You have no money left over for the rest of the trip.");
        } else {
            System.out.println("Your budget is less than your travel expenses.");
        }

    }
}
