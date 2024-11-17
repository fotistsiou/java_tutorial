package fotistsiou.javatutorial.b_java_fundamentals.g_arrays.problems.iterating_over_arrays;

import java.util.Scanner;

/**
 * The index of the first max in an array
 * --------------------------------------
 * Write a program that reads an array of ints and finds the index of the first maximum in that array.
 * --------------------------------------
 * Input data format:
 * 1. The first line contains the number of elements in the array.
 * 2. The second line contains the array elements separated by spaces.
 * Output data format:
 * 1. Only a single integer value: the index of the first maximum.
 */

public class IndexOfFirstMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array and initialize the array with that size
        int[] arr = new int[scanner.nextInt()];

        // Initialize indexOfMax to track the index of the maximum element
        int indexOfMax = 0;

        // Loop through the array to populate it with user inputs and find the max index
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt(); // Read each integer input and store in the array

            // Update indexOfMax if the current element is greater than the current max
            if (arr[i] > arr[indexOfMax]) {
                indexOfMax = i;
            }
        }

        // Output the index of the maximum element in the array
        System.out.println(indexOfMax);

        scanner.close();
    }
}
