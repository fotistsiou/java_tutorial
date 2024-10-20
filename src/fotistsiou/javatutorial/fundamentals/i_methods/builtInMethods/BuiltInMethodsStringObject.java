package fotistsiou.javatutorial.fundamentals.i_methods.builtInMethods;

/* Built-In Methods - String Object */
// -> A String in Java is actually an object, which contain methods that can perform certain operations on strings.

public class BuiltInMethodsStringObject {

    /**
     * The main method executes the string manipulation operations.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        String string1 = "Hello World";
        // Convert string to upper case using .toUpperCase() method
        String string2 = string1.toUpperCase();
        stringEndsWith(string1);
        stringEndsWith(string2);
    }

    /**
     * Checks if the given string ends with "World" and prints the result.
     * If it does not, splits the string at spaces and prints the second word.
     *
     * @param string The string to check.
     */
    public static void stringEndsWith(String string) {
        // Check if the string ends with "World" using .endsWith() method
        if (string.endsWith("World")) {
            System.out.println(
                "The string '" +
                string +
                "' ends with the text 'World'."
            );
        } else {
            // Splits the string by space and prints the last part using .split() method
            String[] array = string.split(" ");
            System.out.println(
                "The string '" +
                string +
                "' don't end with the text 'World', but it ends with the text '" +
                array[1] +
                "'."
            );
        }
    }
}