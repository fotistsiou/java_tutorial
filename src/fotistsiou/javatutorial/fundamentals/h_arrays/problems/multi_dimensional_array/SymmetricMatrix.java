package fotistsiou.javatutorial.fundamentals.h_arrays.problems.multi_dimensional_array;

import java.util.Scanner;

/**
 * Symmetric matrix
 * ----------------
 * Given the number n, not exceeding 10, and a matrix of size n × n.
 * Check whether this matrix is symmetric in relation to the main diagonal.
 * Output the word “YES”, if it is symmetric and the word “NO” otherwise.
 * Keep in mind that the main diagonal runs from the top left corner to the bottom right corner.
 */

public class SymmetricMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int[][] matrix = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                // The main diagonal in a matrix runs from the top-left corner to the bottom-right corner.
                // To check if a matrix is symmetric along the main diagonal, we need to ensure that:
                //  - for every element (i,j) above the diagonal,
                //  - the element at (j,i) (its reflection along the main diagonal) is the same.
                // The means that matrix[i][j] == matrix[j][i] for all i != j
                if (i != j) {
                    if (matrix[i][j] != matrix[j][i]) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }

        System.out.println("YES");
    }
}
