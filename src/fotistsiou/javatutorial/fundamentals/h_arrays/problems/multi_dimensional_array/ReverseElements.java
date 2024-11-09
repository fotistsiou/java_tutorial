package fotistsiou.javatutorial.fundamentals.h_arrays.problems.multi_dimensional_array;

import java.util.Arrays;

/**
 * Reverse elements
 * ----------------
 * In this task, you need to implement reverseElements method.
 * It should reverse all rows of the two-dimensional array as in the example below.
 * P.S. You don't need to create a new array, just modify the existing two-dimensional array.
 */

public class ReverseElements {

    public static void main(String[] args) {
        int[][] twoDimArray = {
            {0, 1, 2, 3},
            {4, 5, 6, 7},
            {8, 9, 10, 11}
        };
        reverseElements(twoDimArray);
        System.out.println(Arrays.deepToString(twoDimArray));
    }

    static void reverseElements(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            int len = twoDimArray[i].length;
            for (int j = 0; j < len / 2; j++) {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][len - 1 - j];
                twoDimArray[i][len - 1 - j] = temp;
            }
        }
    }
}
