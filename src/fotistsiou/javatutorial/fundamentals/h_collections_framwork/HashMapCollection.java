package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

import java.util.HashMap;

public class HashMapCollection {

    public static void main(String[] args) {
        /* HashMap */
        // -> A HashMap stores items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

        // Create a HashMap
        HashMap<String,String> cars = new HashMap<String, String>();

        // Add items to the HashMap (key, value)
        cars.put("Toyota", "Yaris");
        cars.put("BMW", "X5");
        cars.put("Audi", "A6");
        cars.put("Volvo", "XC90");
        cars.put("Mazda", "Mazda3");

        // Print the HashMap
        System.out.println("Cars: " + cars);

        // Access an item in the HashMap
        System.out.println("The 'Toyota' model: " + cars.get("Toyota"));

        // HashMap Size
        System.out.println("Number of cars: " + cars.size());

        // Remove an item from the HashMap
        cars.remove("Mazda");
        System.out.println("Cars after removing the 'Mazda' car: " + cars);

        // Modify an item of the HashMap
        cars.put("BMW", "Z4");

        // Sort the HashMap
        // TODO: Sort by key and by value

        // Sort the ArrayList in reverse order
        // TODO: Reverse sort by key and by value

        // Loop through the items of the HashMap
        int index = 0;
        for (String car : cars.keySet()) {
            System.out.println("Car number " + index + ": " + car);
        }
        for (String model : cars.values()) {
            System.out.println("Model number " + index + ": " + model);
        }
        for (String i : cars.keySet()) {
            System.out.println("Car: " + i + ", Model: " + cars.get(i));
        }

        // Remove all items from the HashMap
        cars.clear();
        System.out.println("Cars after removing all cars: " + cars);
    }
}
