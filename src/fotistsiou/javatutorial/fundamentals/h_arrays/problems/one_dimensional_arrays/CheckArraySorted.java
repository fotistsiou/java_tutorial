package fotistsiou.javatutorial.fundamentals.h_arrays.problems.one_dimensional_arrays;

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

        // Read the size of the array
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character after reading the integer

        // Read the next line of input, which contains the array elements separated by spaces
        String line = scanner.nextLine();
        scanner.close();

        // Initialize the array with the specified size
        int[] array = new int[size];

        // Split the line of elements into individual strings and parse them as integers
        String[] elements = line.split(" ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        // Check if the array is sorted in non-decreasing order
        for (int i = 1; i < size; i++) {
            // If any element is less than the previous one, the array is not sorted
            if (array[i] < array[i - 1]) {
                System.out.println(false);
                return; // Exit the program early since the array is unsorted
            }
        }

        // If the loop completes without finding any decreasing pair, the array is sorted
        System.out.println(true);
    }
}
