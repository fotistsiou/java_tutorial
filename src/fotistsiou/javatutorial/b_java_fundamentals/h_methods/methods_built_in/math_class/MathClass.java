package fotistsiou.javatutorial.b_java_fundamentals.h_methods.methods_built_in.math_class;

/**
 * Built-In Methods - Math Class
 * -----------------------------
 * The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
 */

public class MathClass {

    public static void main(String[] args) {
        // Math.random()
        // -> It is a method of the Math class that generates a random double between 0.0 (inclusive) and 1.0 (exclusive).
        // -> Multiplying it by 11, gives a range between 0.0 and 10.999...
        // -> Casting it to an integer, gives a value from 0 to 10 (because the fractional part is truncated).
        int integer1 = (int)(Math.random() * 11);
        int integer2 = (int)(Math.random() * 11);

        // Maximum & Minimum Number
        if (integer1 != integer2) {
            // Math.max(x, y)
            // -> Returns the number with the highest value.
            System.out.println("Max between " + integer1 + " and " + integer2 + " is " + Math.max(integer1, integer2));
            // Math.min(x, y)
            // -> Returns the number with the lowest value.
            System.out.println("Min between " + integer1 + " and " + integer2 + " is " + Math.min(integer1, integer2));
        } else {
            System.out.println("Numbers " + integer1 + " and " + integer2 + " are equal.");
        }
    }
}