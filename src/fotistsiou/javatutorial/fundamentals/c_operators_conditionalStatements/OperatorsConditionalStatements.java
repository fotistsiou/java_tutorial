package fotistsiou.javatutorial.fundamentals.c_operators_conditionalStatements;

import java.util.Locale;
import java.util.Scanner;

public class OperatorsConditionalStatements {
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

        System.out.println("---------- Travel Organization! ----------");
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

        System.out.println("Your budget: " + budget);
        System.out.println("The total of expenses: " + totalOfExpenses);
        System.out.println("The cost per person: " + costPerPerson);


        /* Conditional Statements */

        // If Statement
        if (leftOver > 0) {
            System.out.println("Τhe money left over for the rest of the trip is " + leftOver);
        } else if (leftOver == 0) {
            System.out.println("You have no money left over for the rest of the trip.");
        } else {
            System.out.println("Your budget is less than your travel expenses.");
        }

        // Switch Statement
        System.out.println("Enter the number of days of your travel:");
        int numOfDays = scanner.nextInt();
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
