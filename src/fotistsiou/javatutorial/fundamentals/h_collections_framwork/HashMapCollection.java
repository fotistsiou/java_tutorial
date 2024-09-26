package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

/* HashMap */
// -> A HashMap stores items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities that will store strings keys with string values.
        HashMap<String,String> capitalCities = new HashMap<String, String>();

        // Add Items (keys and values)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Greece", "Athens");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // Access an Item
        System.out.println(capitalCities.get("Greece"));

        // Remove an Item
        capitalCities.remove("USA");
        System.out.println(capitalCities);

        // HashMap Size
        System.out.println(capitalCities.size());

        // Loop Through a HashMap
        System.out.println("Countries:");
        for (String country : capitalCities.keySet()) {
            System.out.println(country);
        }
        System.out.println("Cities:");
        for (String city : capitalCities.values()) {
            System.out.println(city);
        }
        System.out.println("Countries & Cities:");
        for (String i : capitalCities.keySet()) {
            System.out.println("Country: " + i + ", City: " + capitalCities.get(i));
        }
    }
}
