package fotistsiou.javatutorial.fundamentals.q_lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Lambda Expressions
 * -> A lambda expression is a short block of code which takes in parameters and returns a value.
 * -> A lambda expression doesn't need a name.
 * -> A lambda expression can be implemented right in the body of a method.
 */

public class LambdaExpressions {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        /* Using Lambda Expressions 1 */
        // -> Lambda expressions are usually passed as parameters to a function
        numbers.forEach((n) -> { System.out.println(n); });

        /* Using Lambda Expressions 2 */
        // -> Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
        // -> The lambda expression should have the same number of parameters and the same return type as that method.
        // -> Java has many of these kinds of interfaces built in, such as the Consumer interface used by lists.
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        /* Using Lambda Expressions 3 */
        // -> To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type.
        // -> Calling the interface's method will run the lambda expression
        // Define lambda expressions to format strings:
        StringFunction exclaim = (s) -> s + "!"; // adds "!"
        StringFunction ask = (s) -> s + "?"; // adds "?"
        // The printFormatted method applies the passed lambda to format the string:
        String formatResult1 = printFormatted("Hello", exclaim);
        String formatResult2 = printFormatted("Hello", ask);
        // Print the formatted strings:
        System.out.println(formatResult1);
        System.out.println(formatResult2);
    }

    // A functional interface with one method (single-method interface).
    // This interface can be used to pass lambda expressions that operate on strings.
    interface StringFunction {
        String run(String str);
    }

    // Method that accepts a String and a StringFunction (functional interface).
    // It runs the lambda expression passed through the StringFunction to format the string.
    public static String printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        return result;
    }
}
