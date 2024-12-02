package fotistsiou.javatutorial.b_java_fundamentals.h_methods.methods_built_in.random_class;

import java.util.Random;

/**
 * Random Class
 * ------------
 * - Random class is part of java.util package.
 * - An instance of java Random class is used to generate random numbers.
 * - This class provides several methods to generate random numbers of type integer, double, long, float etc.
 * - Random number generation algorithm works on the seed value. If not provided, seed value is created from system nano time.
 * - If two Random instances have same seed value, then they will generate same sequence of random numbers.
 * - Java Random class is thread-safe, however in multithreaded environment it’s advised to use
 *   java.util.concurrent.ThreadLocalRandom class.
 * -
 */

public class RandomClass {

    public static void main(String[] args) {
        // Initialize random number generator
        Random random = new Random();

        // Generates boolean value
        System.out.println(random.nextBoolean());

        // Generates double value
        System.out.println(random.nextDouble());

        // Generates float value
        System.out.println(random.nextFloat());

        // Generates int value
        System.out.println(random.nextInt());

        // Generates int value within specific limit
        System.out.println(random.nextInt(20));
    }
}
