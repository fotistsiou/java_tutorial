package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

/* ArrayList */
// -> The ArrayList class is a resizable array, which can be found in the java.util package.
// -> The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {

    public static void main(String[] args) {
        // Create an ArrayList object
        ArrayList<String> cars = new ArrayList<String>();

        // Add Items
        cars.add("Toyota");
        cars.add("BMW");
        cars.addFirst("Audi");
        cars.addLast("Volvo");
        cars.add(1, "Mazda"); // Add Item at a specified position (not remove the existing element)

        // Print an ArrayList
        System.out.println("Cars: " + cars);

        // Access an Item
        System.out.println("2nd Car: " + cars.get(1));

        // ArrayList Size
        System.out.println("Cars ArrayList Size: " + cars.size());

        // Remove an Item
        cars.remove(1);
        System.out.println("Cars: " + cars);

        // Modify an Item
        cars.set(1, "Hyundai");
        System.out.println("Cars: " + cars);

        // Sort an ArrayList
        Collections.sort(cars);
        System.out.println("Cars: " + cars);

        // Reverse the Order Items
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("Cars: " + cars);

        // Remove all Items
        // cars.clear();
        // System.out.println("Cars: " + cars);

        // Loop Through an ArrayList
        int index = 0;
        for (String car : cars) {
            if (index == 0) {
                System.out.print("Cars: " + car + ", ");
            } else if(index == cars.size() - 1) {
                System.out.println(car + ".");
            } else {
                System.out.print(car + ", ");
            }
            index++;
        }
    }
}
