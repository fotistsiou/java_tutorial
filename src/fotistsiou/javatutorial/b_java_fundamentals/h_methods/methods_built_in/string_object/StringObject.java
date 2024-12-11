package fotistsiou.javatutorial.b_java_fundamentals.h_methods.methods_built_in.string_object;

import java.util.Arrays;

/**
 * Built-In Methods - String Object
 * --------------------------------
 * A String in Java is actually an object, which contain methods that can perform certain operations on strings.
 */

public class StringObject {

    public static void main(String[] args) {
        String string = "Hello World!";
        System.out.println("The initial string: " + string);

        // length method
        int stringLength = string.length();
        System.out.println("Length of string: " + stringLength);

        // toUpperCase & toLowerCase method
        System.out.println("After toUpperCase: " + string.toUpperCase());
        System.out.println("After toLowerCase: " + string.toLowerCase());

        // split, toCharArray & valueOf methods
        String[] stringToArray = string.split(" ");
        System.out.println("After split: " + Arrays.toString(stringToArray));
        char[] stringToCharArray = string.toCharArray();
        System.out.println("After toCharArray: " + Arrays.toString(stringToCharArray));
        String charArrayToString = String.valueOf(stringToCharArray);
        System.out.println("After valueOf: " + charArrayToString);

        // indexOf method
        int index = string.indexOf("World");
        System.out.println("World starts from index: " + index);

        // join method
        String[] stringArr = string.split("");
        System.out.println("After join: " + String.join(" ", stringArr));
    }
}