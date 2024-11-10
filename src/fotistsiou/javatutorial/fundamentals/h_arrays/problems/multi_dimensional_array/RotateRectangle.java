package fotistsiou.javatutorial.fundamentals.h_arrays.problems.multi_dimensional_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Rotate a rectangle array
 * ------------------------
 * Given a rectangle array n×m in size.
 * Rotate it by 90 degrees clockwise, by recording the result into the new array m×n in size.
 * ------------------------
 * Input data format:
 * - Input consists of the two numbers n and m, not exceeding 100, and then an array n×m in size.
 * Output data format:
 * - Output the resulting array. Separate numbers by a single space in the output.
 */

public class RotateRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the matrix and initialize it
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        // Reading the matrix from input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Step 1: Transpose the matrix
        int[][] newMatrix = new int[cols][rows];
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        // Step 2: Flip the transposed matrix vertically
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows / 2; j++) {
                int temp = newMatrix[i][j];
                newMatrix[i][j] = newMatrix[i][rows - 1 - j];
                newMatrix[i][rows - 1 - j] = temp;
            }
        }

        // Print the final matrix as separate numbers by a single space in the output.
        for (int[] row : newMatrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
