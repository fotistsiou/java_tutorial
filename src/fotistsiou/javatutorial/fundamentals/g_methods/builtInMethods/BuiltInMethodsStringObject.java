package fotistsiou.javatutorial.fundamentals.g_methods.builtInMethods;

public class BuiltInMethodsStringObject {

    public static void main(String[] args) {
        /* Built-In Methods - String Object */
        // -> A String in Java is actually an object, which contain methods that can perform certain operations on strings.

        String string1 = "Hello World";
        // .toUpperCase() method
        String string2 = string1.toUpperCase();
        stringEndsWith(string1);
        stringEndsWith(string2);
    }

    public static void stringEndsWith(String string) {
        // .endsWith() method
        if (string.endsWith("World")) {
            System.out.println(
                "The string '" +
                string +
                "' ends with the text 'World'."
            );
        } else {
            // .split() method
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