package fotistsiou.javatutorial.fundamentals.q_lambdaExpressions;

/* Lambda Expressions */
// -> A lambda expression is a short block of code which takes in parameters and returns a value.
// -> A lambda expression doesn't need a name.
// -> A lambda expression can be implemented right in the body of a method.

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressions {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Lambda expressions are usually passed as parameters to a function
        numbers.forEach(
            (n) -> { System.out.println(n); }
        );

        // Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
        // The lambda expression should have the same number of parameters and the same return type as that method.
        // Java has many of these kinds of interfaces built in, such as the Consumer interface used by lists.
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        // To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type.
        // Calling the interface's method will run the lambda expression
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

    }

    interface StringFunction {
        String run(String str);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
