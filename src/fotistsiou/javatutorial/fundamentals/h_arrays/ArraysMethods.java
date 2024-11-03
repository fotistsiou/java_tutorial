package fotistsiou.javatutorial.fundamentals.h_arrays;

import java.util.Arrays;

/**
 * Array Fill Method
 * -> The fill() method fills an array with a specified value.
 * -> Syntax:
 *    - Arrays.fill(array, value)
 *    - Arrays.fill(array, start, end, value)
 * -> Parameter Values
 *    - array: Required. The array to be filled.
 *    - start: Optional. The index position of the first element (inclusive) to be filled.
 *    - end:   Optional. The index position of the last element (exclusive) to be filled.
 *    - value: Required. The value to fill in the array
 */

public class ArraysMethods {

    public static void main(String[] args) {
        int size = 10;
        char[] characters = new char[size];

        // Array Fill Method
        Arrays.fill(characters, 0, size / 2, 'A');
        Arrays.fill(characters, size / 2, size, 'F');
        System.out.println(Arrays.toString(characters));
    }
}
