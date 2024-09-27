package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

/* ArrayList */
// -> The ArrayList class is a resizable array, which can be found in the java.util package.
// -> The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {

    public static void main(String[] args) {
        // Create an ArrayList object called cars that will store strings.
        ArrayList<String> cars = new ArrayList<String>();

        // Add elements to the list, use the add() method
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");

        // Print an ArrayList
        System.out.println("Cars: " + cars);

        // To find out how many elements an ArrayList have, use the size method
        System.out.println("Cars ArrayList Size: " + cars.size());

        // Add an item at a specified position by referring to the index number, moving the existing element one position.
        cars.add(1, "Mazda");
        System.out.println("Cars: " + cars);

        // Access an element in the ArrayList, use the get() method and refer to the index number
        System.out.println("2nd Car: " + cars.get(1));

        // Modify an element, use the set() method and refer to the index number
        cars.set(1, "Hyundai");
        System.out.println("Cars: " + cars);

        // Remove an element, use the remove() method and refer to the index number
        cars.remove(1);
        System.out.println("Cars: " + cars);

        // Remove all the elements in the ArrayList, use the clear() method
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

        // Sort an ArrayList
        Collections.sort(cars);
        System.out.println("Cars: " + cars);

        // Reverse the Order
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("Cars: " + cars);
    }
}
