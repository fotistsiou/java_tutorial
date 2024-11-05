package fotistsiou.javatutorial.fundamentals.h_arrays.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The index of the first max in an array
 * --------------------------------------
 * Write a program that reads an array of ints and finds the index of the first maximum in that array.
 * --------------------------------------
 * Input data format: line that contains the number of elements in the array.
 * Output data format: Only a single integer value: the index of the first maximum.
 */

public class IndexOfFirstMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        scanner.close();

        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}
