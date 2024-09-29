package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

import java.util.HashSet;

public class HashSetCollection {

    public static void main(String[] args) {
        /* HashMap */
        // -> A HashSet is a collection which can contain many objects of the same type as a LinkedList and an ArrayList.
        // -> A HasSet contains unique items without duplicates.
        // -> A HasSet implements different interface than a LinkedList and an ArrayList.
        // -> Use HashSet when you need uniqueness of elements and fast access times for add, remove, and contains operations.

        // Create a HashSet
        HashSet<String> cars = new HashSet<String>();

        // Add items to the HashSet
        // -> A HashSet does not provide the addFirst and the addLast methods.
        // -> A HashSet cannot add item at a specified position.
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");

        // Print the HashSet
        System.out.println("Cars: " + cars);

        // Access an item in the HashSet
        // -> A HashSet does not provide direct access by index
        // -> A HashSet can check if an item exists
        if (cars.contains("Toyota")) {
            System.out.println("The car 'Toyota' is exists.");
        }
    }
}
