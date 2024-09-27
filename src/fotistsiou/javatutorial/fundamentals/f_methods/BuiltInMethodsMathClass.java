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

        // Rounding Numbers
        double double1 = 23;
        double double2 = 5;
        double division = double1 / double2;
        System.out.println("Division without rounds : " + division);
        // Math.round(x)
        // -> Returns the value of x rounded to its nearest integer.
        System.out.println("Division with round: " + Math.round(division));
        // Math.ceil(x)
        // -> Returns the value of x rounded up to its nearest number.
        System.out.println("Division with ceil: " + Math.ceil(division));
        // Math.floor(x)
        // -> Returns the value of x rounded down to its nearest number.
        System.out.println("Division with floor: " + Math.floor(division));

        // TODO: How to round double / float value to 2 decimal places
    }
}