package fotistsiou.javatutorial.b_java_fundamentals.h_methods.methods_user_defined;

/**
 * User-Defined Methods
 * --------------------
 * A method is a block of code which only runs when it is called.
 * When you create a method, you can add variables into the parentheses of the method, known as 'parameters'.
 * When you call a method and a parameter is passed to the method, it is called 'argument'.
 * The combination of the name of the method and the list of its parameters is known as a method signature (e.g. countSeeds(int, int)).
 * Methods are used to perform certain actions, and they are also known as functions.
 * Use methods to reuse code. Define the code once, and use it many times.
 */

public class UserDefinedMethods {

    public static void main(String[] args) {
        // Call a method
        myMethod("Liam", "Refsnes");
        myMethod("Jenny", "Lalus");
        myMethod("Anja", "Pereturs");
    }

    // User-Defined Method
    static void myMethod(String name, String surname) {
        System.out.println(name + " " + surname);
    }
}
