package fotistsiou.javatutorial.fundamentals.h_arrays.problems.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Right Rotation
 * --------------
 * A right rotation is an operation that shifts each element of an array to the right.
 * For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}.
 * If we rotate it by 2, the new array will be {4,5,1,2,3}.
 * It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.
 * Implement rotate method that performs a right rotation on an array by a given number.
 * --------------
 * Input data format:
 * 1. The first line contains the array elements separated by spaces.
 * 2. The second line contains the steps number of rotation.
 * Output data format:
 * 1. The rotated array elements, separated by spaces.
 */

public class RightRotation {

    private static void rotate(int[] arr, int steps) {
        int n = arr.length;

        // Handle steps greater than the array length
        steps = steps % n;

        // No rotation needed
        if (steps == 0) return;

        int[] rotatedArr = new int[n];

        // Place the last `steps` elements at the start
        System.arraycopy(arr, n - steps, rotatedArr, 0, steps);

        // Place the rest after the first part
        System.arraycopy(arr, 0, rotatedArr, steps, n - steps);

        // Copy the rotated array back to the original array
        System.arraycopy(rotatedArr, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array items from the input line, split by spaces,
        // convert each item to an integer, and store in an integer array
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Read the number of steps to rotate the array
        int steps = Integer.parseInt(scanner.nextLine());

        // Call the rotate function to perform the array rotation
        rotate(arr, steps);

        // Print the rotated array elements, separated by spaces
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
