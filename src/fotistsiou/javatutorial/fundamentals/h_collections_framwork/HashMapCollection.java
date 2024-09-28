package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

/* HashMap */
// -> A HashMap stores items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

import java.util.HashMap;

public class HashMapCollection {

    public static void main(String[] args) {
        // Create a HashMap object
        HashMap<String,String> capitalsOfCountries = new HashMap<String, String>();

        // Add Items
        capitalsOfCountries.put("England", "London");
        capitalsOfCountries.put("Germany", "Berlin");
        capitalsOfCountries.put("Norway", "Oslo");
        capitalsOfCountries.put("Greece", "Athens");
        capitalsOfCountries.put("USA", "Washington DC");

        // Print an HashMap
        System.out.println("Countries & Capitals: " + capitalsOfCountries);

        // Access an Item
        System.out.println("Countries & Capitals: " + capitalsOfCountries.get("Greece"));

        // HashMap Size
        System.out.println("HashMap Size: " + capitalsOfCountries.size());

        // Remove an Item
        capitalsOfCountries.remove("USA");
        System.out.println("Countries & Capitals After Remove an HashMap Item: " + capitalsOfCountries);

        // Loop Through a HashMap
        System.out.println("Countries After Loop Through the HashMap:");
        for (String country : capitalsOfCountries.keySet()) {
            System.out.println(country);
        }
        System.out.println("Capitals After Loop Through the HashMap:");
        for (String city : capitalsOfCountries.values()) {
            System.out.println(city);
        }
        System.out.println("Countries & Capitals After Loop Through the HashMap:");
        for (String i : capitalsOfCountries.keySet()) {
            System.out.println("Country: " + i + ", City: " + capitalsOfCountries.get(i));
        }
    }
}
