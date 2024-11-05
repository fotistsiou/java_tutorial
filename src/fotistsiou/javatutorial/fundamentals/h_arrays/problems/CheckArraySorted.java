package fotistsiou.javatutorial.fundamentals.h_arrays.problems;

import java.util.Scanner;

/**
 * Check if an array is sorted ascending
 * -------------------------------------
 * Write a program that reads an array of int's and checks if the array is sorted ascending (from smallest to largest number).
 * -------------------------------------
 * Input data format:
 * 1. The first line contains the size of an array.
 * 2. The second line contains elements of the array separated by spaces.
 * Output data format: Only a single value: true or false.
 * 1. Only a single value: true or false.
 */

public class CheckArraySorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        String line = scanner.nextLine();
        scanner.close();

        int[] array = new int[size];
        String[] elements = line.split(" ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
