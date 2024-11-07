package fotistsiou.javatutorial.fundamentals.h_arrays.multi_dimensional_arrays;

import java.util.Arrays;

public class ThreeDimensionalArrays {

    public static void main(String[] args) {
        // Creates the three-dimensional array
        int[][][] threeDimArray = new int[2][3][4]; // 2 rows, 3 columns, 4 elements
        int element = 0;
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    threeDimArray[i][j][k] = element;
                }
                element++;
            }
        }

        // Print the three-dimensional array
        for (int i = 0; i < threeDimArray.length; i++) {
            System.out.println("rows " + i + " {");
            for (int j = 0; j < threeDimArray[i].length; j++) {
                System.out.println("..column " + j + " {");
                System.out.println("....elements: " + Arrays.toString(threeDimArray[i][j]));
                System.out.println("..}");
            }
            System.out.println("}");
        }

        // Refer to an element of the three-dimensional array
        System.out.println("First element: " + threeDimArray[0][0][0]);
        System.out.println("Last element: " + threeDimArray[1][2][3]);
    }
}
