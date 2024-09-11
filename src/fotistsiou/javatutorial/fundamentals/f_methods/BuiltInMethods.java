package fotistsiou.javatutorial.fundamentals.f_methods;

public class BuiltInMethods {
    /* Built-In Methods */

    // String Object:
    // A String in Java is actually an object, which contain methods that can perform certain operations on strings.
    // Math Class:
    // The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

    public static void main(String[] args) {
        String string1 = "Hello World";
        String string2 = string1.toUpperCase();
        stringEndsWith(string1);
        stringEndsWith(string2);
    }

    public static void stringEndsWith(String string) {
        // 'endsWith()' string object method
        if (string.endsWith("World")) {
            System.out.println(
                "The string '" +
                string +
                "' ends with the text 'World'."
            );
        } else {
            // 'split()' string object method
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