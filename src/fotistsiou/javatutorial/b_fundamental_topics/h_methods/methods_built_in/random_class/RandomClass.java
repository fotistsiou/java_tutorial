package fotistsiou.javatutorial.b_fundamental_topics.h_methods.methods_built_in.random_class;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {
        // Initialize random number generator
        Random random = new Random();

        // Generates boolean value
        System.out.println("Boolean Random Value: " + random.nextBoolean());

        // Generates double value
        System.out.println("Double Random Value: " + random.nextDouble());

        // Generates float value
        System.out.println("Float Random Value: " + random.nextFloat());

        // Generates int value
        System.out.println("Int Random Value: " + random.nextInt());

        // Generates int value within specific limit
        System.out.println("Int Random Value (0-3): " + random.nextInt(4)); // it may print 0, 1, 2, 3

        // Generates int value within specific range
        int lower = 2;
        int upper = 5;
        int intervalLength = upper - lower + 1;
        System.out.println("Int Random Value (2-5): " + (random.nextInt(intervalLength) + lower)); // it may print 2, 3, 4, 5
    }
}
