package fotistsiou.javatutorial.fundamentals.f_loops.problems;

import java.util.Scanner;

/**
 * Sequence Of Temperatures
 * ------------------------
 * Write a Java program that reads a sequence of temperatures readings in degrees Celsius.
 * The program will be reading temperatures until a reading of 100 degrees or more is encountered.
 */

public class SequenceOfTemperatures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0;
        System.out.println("Enter a temperature: ");
        int temperature = scanner.nextInt();
        while (temperature < 100) {
            maxTemperature = Math.max(maxTemperature, temperature);
            System.out.println("Enter the next temperature: ");
            temperature = scanner.nextInt();
        }
        System.out.println("Max Temperature: " + maxTemperature);
    }
}
