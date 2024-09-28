package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

/* HashMap */
// -> A HashSet is a collection of items where every item is unique.

import java.util.HashSet;

public class HashSetCollection {

    public static void main(String[] args) {
        // Create a HashSet object
        HashSet<String> cars = new HashSet<String>();

        // Add Elements
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");

        // Print an HashSet
        System.out.println("Cars: " + cars);
    }
}
