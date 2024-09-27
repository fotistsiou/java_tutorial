package fotistsiou.javatutorial.fundamentals.f_methods;

public class BuiltInMethodsMathClass {

    public static void main(String[] args) {
        /* Built-In Methods - Math Class */
        // -> The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

        // Math.random()
        // -> It is a method of the Math class that generates a random double between 0.0 (inclusive) and 1.0 (exclusive).
        // -> Multiplying it by 11, gives a range between 0.0 and 10.999...
        // -> Casting it to an integer, gives a value from 0 to 10 (because the fractional part is truncated).
        int integer1 = (int)(Math.random() * 11);
        int integer2 = (int)(Math.random() * 11);
        if (integer1 != integer2) {
            // Math.max()
            System.out.println("Max between " + integer1 + " and " + integer2 + " is " + Math.max(integer1, integer2));
            // Math.min()
            System.out.println("Min between " + integer1 + " and " + integer2 + " is " + Math.min(integer1, integer2));
        } else {
            System.out.println("Numbers " + integer1 + " and " + integer2 + " are equal.");
        }
    }
}