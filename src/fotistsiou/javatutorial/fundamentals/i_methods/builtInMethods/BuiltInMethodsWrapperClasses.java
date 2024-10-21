package fotistsiou.javatutorial.fundamentals.i_methods.builtInMethods;

import java.util.Scanner;

public class BuiltInMethodsWrapperClasses {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        /* Wrapper Classes "Integer", Method ".compare()" */
        // -> Compares two int values numerically.
        // -> In this case, it compares a number with zero (0):
        //    - If number > 0 returns  1
        //    - If number = 0 returns  0
        //    - If number < 0 returns -1
        int result = Integer.compare(n, 0);
        System.out.println(result);
    }
}
