package fotistsiou.javatutorial.b_java_fundamentals.h_methods.methodsBuiltIn.wrapper_classes;

import java.util.Scanner;

/**
 * Built-In Methods - Wrapper Classes
 * ----------------------------------
 * Integer.compare()
 * -> Integer.compare() method is used to compare two integer values numerically.
 *    - Return value is -1, when int1 <  int2.
 *    - Return value is 0,  when int1 == int2.
 *    - Return value is 1,  when int1 >  int2.
 */

public class CompareMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer.compare()
        System.out.println("Enter 2 integers:");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int result = Integer.compare(int1, int2);
        if (result == -1) {
            System.out.println("The 1st integer is less than the 2nd integer.");
        } else if (result == 1) {
            System.out.println("The 1st integer is greater than the 2nd integer.");
        } else {
            System.out.println("The 1st integer is equal to the 2nd integer.");
        }

        scanner.close();
    }
}
