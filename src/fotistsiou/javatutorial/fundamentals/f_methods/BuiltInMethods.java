package fotistsiou.javatutorial.fundamentals.f_methods;

public class BuiltInMethods {
    /* Built-In Methods */

    // String Object:
    // A String in Java is actually an object, which contain methods that can perform certain operations on strings.
    // Math Class:
    // The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

    public static void main(String[] args) {
        // String Object
        String string1 = "Hello World";
        String string2 = string1.toUpperCase();
        stringEndsWith(string1);
        stringEndsWith(string2);

        // Math Class
        // 'random()' method of Math class
        // Math.random() generates a random double between 0.0 (inclusive) and 1.0 (exclusive).
        // Multiplying it by 11 gives a range between 0.0 and 10.999..., which, when cast to an integer,
        // will give values from 0 to 10 (because the fractional part is truncated).
        int integer1 = (int)(Math.random() * 11);
        int integer2 = (int)(Math.random() * 11);
        if (integer1 != integer2) {
            // 'max()' method of Math class
            System.out.println("Max between " + integer1 + " and " + integer2 + " is " + Math.max(integer1, integer2));
            // 'min()' method of Math class
            System.out.println("Min between " + integer1 + " and " + integer2 + " is " + Math.min(integer1, integer2));
        } else {
            System.out.println("Numbers " + integer1 + " and " + integer2 + " are equal.");
        }
    }

    public static void stringEndsWith(String string) {
        // 'endsWith()' String object method
        if (string.endsWith("World")) {
            System.out.println(
                "The string '" +
                string +
                "' ends with the text 'World'."
            );
        } else {
            // 'split()' String object method
            String[] array = string.split(" ");
            System.out.println(
                "The string '" +
                string +
                "' don't end with the text 'World', but it ends with the text '" +
                array[1] +
                "'."
            );
        }
    }
}