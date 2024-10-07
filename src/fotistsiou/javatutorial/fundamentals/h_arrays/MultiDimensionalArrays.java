package fotistsiou.javatutorial.fundamentals.h_arrays;

/* Multi-Dimensional Arrays */
// -> A multidimensional array is an array of arrays.
// -> Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        // Create a Multi-Dimensional Array
        int[][] myNumbers = { {1, 2, 3}, {4, 5} };

        // Create a Multi-Dimensional Array from One-Dimensional Arrays
        String[] carBrands = {"Toyota", "Hyundai", "Opel"};
        String[] carModels = {"Yaris", "i20", "Corsa"};
        String[][] cars = new String[3][2];
        for (int i = 0; i < 3; i++) {
            cars[i][0] = carBrands[i];
            cars[i][1] = carModels[i];
        }

        // Print the Multi-Dimensional Array
        System.out.println("Cars: " + java.util.Arrays.deepToString(cars));

        // Access the Elements of the Multi-Dimensional Array
        System.out.println("The 1st car is " + cars[0][0] + " and the 1st model is " + cars[0][1]);

        // Change Elements of the Multi-Dimensional Array
        cars[2][0] = "Volvo";
        cars[2][1] = "XC90";
        System.out.println("The 3rd car is " + cars[2][0] + " and the 3rd model is " + cars[2][1]);

        // Multi-Dimensional Array Length
        System.out.println("There are " + cars.length + " cars & models.");

        // Loop Through a Multi-Dimensional Array
        // -> With For Loop
        System.out.println("Loop Through a Multi-Dimensional Array With For Loop:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i + ". Brand: " + cars[i][0] + ", Model: " + cars[i][1]);
        }
        // -> With For-Each Loop
        System.out.println("Loop Through a Multi-Dimensional Array With For-Each Loop:");
        int index1 = 0;
        for (String[] car : cars) {
            System.out.println(index1 + ". Brand: " + car[0] + ", Model: " + car[1]);
            index1++;
        }
        // -> With Nested For Loop
        System.out.println("Loop Through a Multi-Dimensional Array With Nested For Loop:");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                if (j % 2 == 0) {
                    System.out.println("Brand " + i + ": "  + cars[i][j]);
                } else {
                    System.out.println("Model " + i + ": "  + cars[i][j]);
                }
            }
        }
        // -> With Nested For-Each Loop
        System.out.println("Loop Through a Multi-Dimensional Array With Nested For-Each Loop:");
        int index2 = 0;
        int index3 = 0;
        for (String[] car : cars) {
            for (String c : car) {
                if (index3 % 2 == 0) {
                    System.out.println("Brand " + index2 + ": "  + c);
                } else {
                    System.out.println("Model " + index2 + ": "  + c);
                }
                index3++;
            }
            index2++;
        }
    }
}
